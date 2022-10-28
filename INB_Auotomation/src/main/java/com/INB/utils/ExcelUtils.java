package com.INB.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.INB.constants.FrameworkConstants;
import com.INB.exceptions.FrameworkException;
import com.INB.exceptions.InvalidPathForExcelException;

public final class ExcelUtils {

	private ExcelUtils() {

	}

	/*******************************************************************************************************************
	                  this method will return all list of map which contains the values from given
	                                excel sheet as key and value pair
                                      --try with resources instead of try catch block--
	 *******************************************************************************************************************/


	public static List<Map<String,String>> getTestDetails(String sheetName) { 
		List<Map<String,String>> list=null;
		//FileInputStream fs = null;

		try(FileInputStream fs = new FileInputStream(FrameworkConstants.getExcelpath())) {
			//	fs=new FileInputStream(FrameworkConstants.getExcelpath());
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			XSSFSheet sheet=workbook.getSheet(sheetName);

			list=new ArrayList<Map<String,String>>();
			Map<String ,String > map = null;

			int lastRowNum=sheet.getLastRowNum();
			int lastColNum=sheet.getRow(0).getLastCellNum();

			for(int i=1; i<=lastRowNum;i++) {  //for row 

				map=new HashMap<>();  //everytime when rownumgets updated new hashmap will get generated

				for(int j=0;j<lastColNum;j++) {    //for coloum

					String key=sheet.getRow(0).getCell(j).getStringCellValue();  //will save all the data form headerline as a key

					String value=sheet.getRow(i).getCell(j).getStringCellValue();//will save all the data from givendata as a value

					map.put(key, value);
				}
				list.add(map);   //this will add all the maps<string,string>  in the form of list
			}

		} 
		catch (FileNotFoundException e) {
			/*
			 * StackTraceElement a[]=e.getStackTrace(); a[0]=new
			 * StackTraceElement("com.INB.utils.ExcelUtils", "getTestDetails",
			 * "ExcelUtils.java", 33); e.setStackTrace(a);
			 */
			throw new InvalidPathForExcelException("Excel File you are trying to read is not found");
		}
		catch (IOException e) {

			throw new FrameworkException("Some  IO excepition happened while running excel file");
		}

		catch(NullPointerException npe)
		{
			throw new NullPointerException("The  value of one of the row or column  is blank in given excel file ");
		}		


		return list;
	}

}
