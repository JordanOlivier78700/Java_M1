package metier;

import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class Identite implements Serializable
{
	String nom;
	String prenom;
	int age;
	@Override
	public String toString() {
		return "Identite [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Identite(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	public Identite()
	{}

	
}
