package dao;

import java.util.ArrayList;
import metier.Bulletin;

public class bulletinDAO {

	//Création de la liste Bulletin
	private ArrayList<Bulletin> bulletin = new ArrayList<>();
	
	//Permet d'insérer le bulletin dont les valeurs sont demandées par saisie utilisateur
	public void addBulletin(Bulletin b) {
		this.bulletin.add(b);
	}
	
	//Recherche de bulletin par nom et retour le bulletin de l'étudiant
	public void getBulletinParMC() {
		
	}
	
	//Supprime la liste de bulletins qui ne sont pas demander
	public void deleteBulletinParMC() {
		
	}
}