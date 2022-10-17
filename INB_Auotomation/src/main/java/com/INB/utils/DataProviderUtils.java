package com.INB.utils;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;

import com.INB.constants.FrameworkConstants;

public final class DataProviderUtils {
	private static List<Map<String,String>> list=new ArrayList<Map<String,String>>();

	private DataProviderUtils() {

	}

	//	we have to filter out the test data which parameter are set as "yes" in sheetname "DATA" 

	@DataProvider (parallel=true)
	public static Object[] getData(Method method) {

		String testname=method.getName();  //testname will save the name of all the testmethods,whatever the test methods are calling this dataprovider

		if(list.isEmpty()) {
			list=ExcelUtils.getTestDetails(FrameworkConstants.getIterationDataSheet());// this will return all the data from from "data" sheet
		}

		List<Map<String, String>> smalllist=new ArrayList<Map<String,String>>();
		for (int i=0; i<list.size() ;i++) {
			if(list.get(i).get("testname").equals(testname) &&
					list.get(i).get("execute").equalsIgnoreCase("yes")) {
				smalllist.add(list.get(i));  //get(i)  returns the hashmap<s,s>__
			}
		}

	
		return smalllist.toArray();// toArray will give you object array
	}

}
