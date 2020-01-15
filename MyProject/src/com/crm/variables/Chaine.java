package com.crm.variables;

public class Chaine {

	public static final String NOM_COULEUR_UN = "bleu";
	private static final String NOM_COULEUR_DEUX = "violet";
	
	public static String afficheNomCouleur() {
		
		final String NOM_COULEUR_TROIS = "vert";
		
		System.out.println("Le ciel est de la couleur  " + NOM_COULEUR_UN + " " + NOM_COULEUR_DEUX + " " + NOM_COULEUR_TROIS);
		
		String nomCouleur = NOM_COULEUR_UN;
		return nomCouleur;
		
	}
}