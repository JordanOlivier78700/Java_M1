package test;

import java.util.Scanner;

public class bulletinTest {

	public static void main(String[] args) {
		
		
		//Demande a l'utilisateur le mot cl� rechercher
		Scanner sc = new Scanner(System.in);
		System.out.println("Mot cl� recherch� :" );
		String recherche = sc.nextLine();
		System.out.println("Voici la liste des bulletins avec le mot " + recherche);
		
		
	}
}