package test;

import java.util.ArrayList;

import dao.*;
import metier.Bulletin;

public class bulletinTest {

	public static void main(String[] args) {
		
		bulletinDAO bul = new bulletinDAO();
		Bulletin bulltin = new Bulletin("jojo", "coucou", 12);
		
		System.out.println(bul.addBulletin().toString());
		bul.getIbulletin().add(bulltin);
		System.out.println(bul.getBulletinParMC("jojo",bul.getIbulletin()).toString());
		
		System.out.println(bul.deleteBulletinParMC("Donati",bul.getIbulletin()).toString());
	}
}