package com.crm.variables;

public class TabStringToNumber {
	public static int [] tabStringToTabInt(String [] pTabString) {
		int tabInt[] = new int[pTabString.length];
		//int cellule;
		int nbCellule = 0;
		for(int i = 0 ; i < pTabString.length ; i++) {
			
			try {
				tabInt[nbCellule]=Integer.parseInt(pTabString[i]);
				nbCellule = nbCellule + 1; 
			} catch (NumberFormatException e){
				
			}
	
			
		}
		return tabInt;
		
	}
}
