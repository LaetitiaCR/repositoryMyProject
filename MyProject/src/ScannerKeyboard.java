import java.util.Scanner;

public class ScannerKeyboard {

	
	public static void main(String[] args) {
		
		String strChaine = "";
		String strWord= "";
	
		System.out.println("Enter votre phrase :");
		
	
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("\\s");
		
		while(scan.hasNext()){
			strWord = scan.next();
			strChaine = strChaine + "  " + strWord;
			//System.out.println(strChaine);
		}
		
		
		scan.close();
		System.out.println(strChaine);
	}

}
