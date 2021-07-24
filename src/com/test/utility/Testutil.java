package com.test.utility;

import java.util.ArrayList;

public class Testutil {
	static Xls_Reader reader;

	public static ArrayList<Object[]> getDataFromExcel() {
	
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			reader = new Xls_Reader("C:\\Users\\Guest1\\eclipse-workspace\\morningsessions\\src\\com\\testData\\ebayTestData.xlsx");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		for(int rowNum = 2; int rowNum <= reader)
		
		}
		
	}
	

