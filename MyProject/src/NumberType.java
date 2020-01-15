
public class NumberType {

	public static void main(String[] args) {

		//chaine de caractères
		String strLetterNumber;
		
		
	//***********	
	//8 variables primitives	
		
		boolean boolTrueFalse;
				
		char characterOne;
								
		byte byteOneOctet;				
		short shortTwoOctets;	
		int intFourOctets;	
		long longEightOctets;
			
		// 4 octets
		//dans ce cas max vaut 255 : ensemble des nombres [-3.40282347E38 .. -1.40239846E-45], 0, [1.40239846E-45 .. 3.40282347E38]
		float floatCommaFourOctets;
		
		//8 octets
		//dans ce cas max vaut 2047 : ensemble des nombres [-1.79769313486231570E308 .. -4.94065645841246544E-324], 0, [4.94065645841246544E-324 .. 1.79769313486231570E308]
		double doubleCommaEightOctes;
		
	//*********	
		
		
		strLetterNumber = "MyChaine";
		
	//*********	
		//8 variables primitifs		
		boolTrueFalse = true;

		characterOne = 'a';  		//un caractère		//1 octet
		
		byteOneOctet = 1;			// -128 							-2 7 			et 			+ 127  								2 7  - 1
		shortTwoOctets = 2;			// -32 768  						-2 15 			et 			+ 32 767							2 15 - 1 
		intFourOctets = 3;			// - 2 147 483 648 	  				-2 31			et 			+ 2 147 483 647						2 31 - 1
		longEightOctets = 4;		// - 9 223 372 036 854 775 808		-2 93			et 			+ 9 223 372 036 854 775 807			2 93 - 1
		
		floatCommaFourOctets = 4;
		doubleCommaEightOctes = 5.825;
	//*********
		
		System.out.println(strLetterNumber);
		
		//8 variables primitives
		System.out.println(boolTrueFalse);
		System.out.println(characterOne);
		System.out.println(byteOneOctet + " " + shortTwoOctets + " " + intFourOctets + " " + longEightOctets);
		System.out.println(floatCommaFourOctets + " " + doubleCommaEightOctes);
	}

}
