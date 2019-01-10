package test;

import java.util.Scanner;

public class bulletinTest {

	public static void main(String[] args) {
		
		
		//Demande a l'utilisateur le mot clé rechercher
		Scanner sc = new Scanner(System.in);
		System.out.println("Mot clé recherché :" );
		String recherche = sc.nextLine();
		System.out.println("Voici la liste des bulletins avec le mot " + recherche);
		
		
	}
}