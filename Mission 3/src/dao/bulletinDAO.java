package dao;

import java.util.ArrayList;
import metier.Bulletin;

public class bulletinDAO {

	//Cr�ation de la liste Bulletin
	private ArrayList<Bulletin> bulletin = new ArrayList<>();
	
	//Permet d'ins�rer le bulletin dont les valeurs sont demand�es par saisie utilisateur
	public void addBulletin(Bulletin b) {
		this.bulletin.add(b);
	}
	
	//Recherche de bulletin par nom et retour le bulletin de l'�tudiant
	public void getBulletinParMC() {
		
	}
	
	//Supprime la liste de bulletins qui ne sont pas demander
	public void deleteBulletinParMC() {
		
	}
}