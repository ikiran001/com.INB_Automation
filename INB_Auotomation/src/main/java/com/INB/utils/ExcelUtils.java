package com.INB.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.INB.constants.FrameworkConstants;

public final class ExcelUtils {

	private ExcelUtils() {

	}

	
	public static List<Map<String,String>> getTestDetails() {
		List<Map<String,String>> list=null;
		FileInputStream fs = null;


		try {
			fs=new FileInputStream(FrameworkConstants.getExcelpath());
			XSSFWorkbook	workbook = new XSSFWorkbook(fs);
			String sheetName="RUNMANAGER";
			XSSFSheet sheet=workbook.getSheet(sheetName);

			list=new ArrayList<Map<String,String>>();
			Map<String ,String > map = null;

			int lastRowNum=sheet.getLastRowNum();
			int lastColNum=sheet.getRow(0).getLastCellNum();

			for(int i=1; i<=lastRowNum;i++) {  //for row 
				map=new HashMap<String, String>();  //everytime when rownumgets updated new hashmap will get generated
				for(int j=0;j<lastColNum;j++) {  //for coloum

					String key=sheet.getRow(0).getCell(j).getStringCellValue();  //will save all the values form headerline as a key
					String value=sheet.getRow(i).getCell(j).getStringCellValue();//will save all the values from data as a value
					map.put(key, value);
					
				}
				list.add(map);   //this will add all the maps<string,string>  in the form of list
			}

		} catch (IOException e) {

			e.printStackTrace();
		}
		finally {
			try {
				if(Objects.nonNull(fs)) {
					fs.close();
				}
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

		return list;
	}

}
