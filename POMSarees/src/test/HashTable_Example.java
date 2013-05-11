package test;

import java.util.Hashtable;

public class HashTable_Example {
	
	public static void main (String[] args){
		
		// Hashtable is the in built class in Java'.
		Hashtable table = new Hashtable();
		table.put("name", "Selenium");
		// Where name is the Key and Selenium is the Value
		table.put("purpose", "automation");
		
		System.out.println(table.get("name"));
		System.out.println(table.get("purpose"));
	}
	
	// Each row has one Hashtable, and Hashtable has keys and values from the Excel Sheet
	// From the Excel Sheet "Key" will be the Runmode and the "Value" will be "Y".  
	// Key and Values will be there for each and every row in the sheet.  

}
