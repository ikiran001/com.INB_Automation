package com.INB.listeners;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

import com.INB.constants.FrameworkConstants;
import com.INB.utils.ExcelUtils;

public class MethodInterceptor implements IMethodInterceptor {
	

	/****************************************************************************************************************
	                this listener class will give you the all the eligible methods(test cases)
	                            whose execution parameter is set  as yes
	 ***************************************************************************************************************/
	
	
	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {

		List<Map<String, String>> list=ExcelUtils.getTestDetails(FrameworkConstants.getRunManagerSheet()); // Iterate this list with methods(contains all the testcases)
		List<IMethodInstance> result= new ArrayList<IMethodInstance>();
		for(int i=0; i<methods.size() ; i++) { // will provide all the test cases or  methods from test class
			for (int j=0 ; j<list.size(); j++) {  // will provide all the methods saved in list(which is derived from excel sheet)

				if(methods.get(i).getMethod().getMethodName().equals(list.get(j).get(FrameworkConstants.getTestCaseName())) && 
						list.get(j).get(FrameworkConstants.getExecuteDetails()).equalsIgnoreCase("yes")) {
					methods.get(i).getMethod().setDescription(list.get(j).get(FrameworkConstants.getTestDescription()));
					methods.get(i).getMethod().setInvocationCount(Integer.parseInt(list.get(j).get(FrameworkConstants.getCountDetails())));//will set the exceecutable count from j for loop to methods from i for loop
					methods.get(i).getMethod().setPriority(Integer.parseInt(list.get(j).get(FrameworkConstants.getPriorityDetails())));
					result.add(methods.get(i)); //this will add all the eligible methods to result instance
				}
			}
		}


		return result; //this will save all the list in key and value pair which are eligible for execution
	}

}
