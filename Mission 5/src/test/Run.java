package test;

import java.util.ArrayList;

import dao.BulletinDao;
import metier.Bulletin;

public class Run {

	public static void main(String[] args)
	{
		BulletinDao bullDAO =  new BulletinDao();
		Bulletin bull = new Bulletin("Ollivier", "Jordan", 55);
		Bulletin bull2 = new Bulletin("Debout", "Antoine", 12);
		Bulletin bull3 = new Bulletin("Lasne", "Ophélie", 8);

		
		bullDAO.addBulletin(bull3);
		bullDAO.addBulletin(bull2);
		bullDAO.addBulletin(bull);
		bullDAO.addBulletin(bull);
		
		ArrayList<String>listUser =bullDAO.bulletingParMC("Ollivier");
		System.out.println(listUser.toString());
	}

}
