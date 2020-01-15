package com.crm.variables;

public class StringToTab {

	public static String [] stringToTabString(String pChaine) {
		
		String strChaine = pChaine.trim();

		String[] parts = strChaine.split(" ");
		//String partnb1 = parts[0]; 
		//String partnb2 = parts[1]; 
	
		return parts; 
	}

}
