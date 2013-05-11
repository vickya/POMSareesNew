package com.online.sarees.util;

import java.util.Hashtable;

public class TestUtil {
	
	public static boolean isExecutable(String testName, Xls_Reader xls){
		for (int rNum=2; rNum<=xls.getRowCount("Test Cases");rNum++){
			if(testName.equals(xls.getCellData("Test Cases", "TCID", rNum))){
				if (xls.getCellData("Test Cases","Runmode", rNum).equals("Y"))
					return true;
				else 
					return false;
			}
		}
		
		return false;
	}
	
	public static Object[][] getData(String testName, Xls_Reader xls){
		System.out.println("*****************");
		// find test in the xls file 
		// find number of columns in the test 
		// find number of rows in the test
		// print the data of the test 
		// put the data in object array
		
		int testCaseStartIndex=0;
		for int(rNum=1;rNum<=xls.getRowCount("Test Data");rNum++){
			if (testName.equals(xls.getCellData("Test Data", 0, rNum))){
				testCaseStartIndex=rNum;
				break;
			}
		}
	
		System.out.println("Test starts from - "+testCaseStartIndex);
		
		// find number of columns in the test
		int colStartIndex = testCaseStartIndex+1;
		int cols=0;
		while(!xls.getCellData("Test Data", cols, colStartIndex).equal("")){
			cols++;
		}
		System.out.println("Total cols are - "+cols);
		
		// find the number of rows in the test
		int dataStartIndex=testCaseStartIndex+2;
		int rows=0;
		while(!xls.getCellData("Test Data", 0, (dataStartIndex+rows)).equals("")){
			rows++;
			
		}
		System.out.println("Total rows are - "+rows);
		
		// Put the data in the Object array
		Object[][] data = new Object[rows][1];
		Hashtable<String, String> table = null;
		
		// Print the data of the test
		for int(rNum=dataStartIndex;rNum<(dataStartIndex+rows);rNum++){
			//every row should have a new Hashtable
			table = new Hashtable<String, String>();
			for (int cNum=0;cNum<cols;cNum++){
				System.out.println(xls.getCellData("Test Data", cNum, rNum)+"---");
			}
			
			}
		}
	}
	

