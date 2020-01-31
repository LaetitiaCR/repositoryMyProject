import java.util.Scanner;

import com.crm.variables.Chaine;
import com.crm.variables.StringToTab;
import com.crm.variables.TabStringToNumber;

/**
 * @author Laëtitia
 *
 */
public class Application {
	
	
	

	
	/**
	 * @param affiche le couleur indiquée dans la constante NOM_COULEUR_UN du paquage com.crm.variables et de la classe Chaine;
	 */
	public static void main(String[] args) {
		
		

	
		String NameCouleur = Chaine.afficheNomCouleur();
		System.out.println("Le ciel est toujours " + NameCouleur);

		
		System.out.println("Enter des chiffres séparés par un espace pour calculer sa moyenne :");
		
		
		Scanner scan = new Scanner(System.in);
		
		String chiffreLine = scan.nextLine();
		
		scan.close();
		
		String [] tabLine = StringToTab.stringToTabString(chiffreLine);
		
		//String nb1TabLine = tabLine[0]; 
		//String nb2TabLine = tabLine[1]; 
		
		int [] tabInt = new int[tabLine.length];
		float moyenneTabInt=0;
		tabInt = TabStringToNumber.tabStringToTabInt(tabLine);
		
		for(int i = 0 ; i < tabInt.length ; i++) {
		
			moyenneTabInt = moyenneTabInt + tabInt[i];
			System.out.println(tabInt[i]);
		}
			
		
		/*
		scan.useDelimiter("\\s");
		
		
		while(scan.hasNextInt()){
			intNb = intNb + scan.nextInt();
			//System.out.println(strChaine);
		}
		*/
		
		
		//System.out.println(intNb);
		System.out.println(chiffreLine);
		System.out.println(moyenneTabInt/tabLine.length);
		//System.out.println(nb1TabLine + nb2TabLine);
		
		
		System.out.println(Chaine.NOM_COULEUR_UN);
		
		
		
	}

}
