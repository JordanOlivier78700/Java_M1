package dao;

import java.util.ArrayList;
import java.util.Scanner;

import metier.*;

public class bulletinDAO {
	
	ArrayList<Bulletin> ibulletin = new ArrayList<Bulletin>();
	
	public ArrayList<Bulletin> getIbulletin() {
		return ibulletin;
	}

	public void setIbulletin(ArrayList<Bulletin> ibulletin) {
		this.ibulletin = ibulletin;
	}

	//Constructeur
	public bulletinDAO() {
		
	}
	
	//Permet d'insérer le bulletin dont les valeurs sont demandées par saisie utilisateur
	public ArrayList<Bulletin> addBulletin() {
		//Demande a l'utilisateur les valeurs du bulletin
		System.out.println("Quelles sont les valeurs du bulletin ? " );
		
		//Permet a l'utilisateur de mettre la valeur
		Scanner sc = new Scanner(System.in);
		System.out.println("Nom : " );
		//Enregistre la valeur mise
		String nomScan = sc.nextLine();
		
		System.out.println("Prenom : " );
		String prenomScan = sc.nextLine();
		
		System.out.println("Note : " );
		int noteScan = Integer.parseInt(sc.nextLine());
		
		//Recuperation des set 
		Bulletin b1 = new Bulletin();
		b1.setNom(nomScan);
		b1.setPrenom(prenomScan);
		b1.setNote(noteScan);
		
		//Insertition du bulletin avec les paramètres saisie
		this.ibulletin.add(b1);
		
		return ibulletin;
	}
	
	//Recherche de bulletin par nom et retour le bulletin de l'étudiant
	public Bulletin getBulletinParMC(String mc, ArrayList<Bulletin> ibulletin) {
		//Demande a l'utilisateur quelle mot veut il cherche 
		//Permet a l'utilisateur de mettre la valeur
		Scanner sc = new Scanner(System.in);
		System.out.println("Quelle nom voulez vous chercher ? " );
		//Enregistre la valeur mise
		mc = sc.nextLine();
		
		//Cherche le mot clé dans la liste de bulletin 
		for (int i = 0; i < ibulletin.size(); i++) {
			if (ibulletin.get(i).getNom().equals(mc)) {
				//Retourne le ou les bulletin(s) demander
				return ibulletin.get(i);
			}
		}
		
		return null;
	}
	
	//Supprime la liste de bulletins qui ne sont pas demander
	public ArrayList<Bulletin> deleteBulletinParMC(String mc, ArrayList<Bulletin> ibulletin) {
		//Demande a l'utilisateur quelle bulletin il veut supprimer 
		//Permet a l'utilisateur de mettre la valeur
		Scanner sc = new Scanner(System.in);
		System.out.println("Quelle bulletin voulez vous supprimer ? " );
		//Enregistre la valeur mise
		mc = sc.nextLine();
		
		//Cherche le mot clé dans la liste de bulletin 
		for(int i = 0; i < ibulletin.size(); i++) {
			if(ibulletin.get(i).getNom().equals(mc)) {
				//Supprime le bulletin 
				ibulletin.remove(i);
			}
		}
		
		//Retourne tout les bulletin restant
		return ibulletin;
	}
}