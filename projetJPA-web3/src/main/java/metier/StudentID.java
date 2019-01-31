package metier;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class StudentID implements Serializable
{
	String nom;
	String prenom;
	
	
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
	@Override
	public String toString() {
		return "StudentID [nom=" + nom + ", prenom=" + prenom + "]";
	}
	public StudentID(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	public StudentID() {
		
	}
	

}
