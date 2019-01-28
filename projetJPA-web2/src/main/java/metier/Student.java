package metier;
import java.io.Serializable;
import java.util.Scanner;

import javax.persistence.*;

@Entity
public class Student implements Serializable
{
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	int idStudent;
	String nom;
	String prenom;
	int note;
	int age;

	public Student()
	{
	}
	

	public int getIdStudent() {
		return idStudent;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setNom() {
		System.out.println("Entrez le nom : ");
		Scanner sc = new Scanner(System.in);
		this.nom = sc.nextLine();
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setPrenom() {
		System.out.println("Entrez le prénom : ");
		Scanner sc = new Scanner(System.in);
		this.prenom = sc.nextLine();
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}
	public void setNote() {
		System.out.println("Entrez la note : ");
		Scanner sc = new Scanner(System.in);
		this.note = sc.nextInt();
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void setAge() {
		System.out.println("Entrez l'age : ");
		Scanner sc = new Scanner(System.in);
		this.age = sc.nextInt();
	}

	
}
