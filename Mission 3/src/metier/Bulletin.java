package metier;

public class Bulletin {
	
	//Variables
	String nom; 
	String prenom; 
	int note; 

	//Getter-Setter
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

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}
	
	//Constructeur avec assignation d'attribuet
	public Bulletin(String nom, String prenom, int note) {
		this.nom = nom;
		this.prenom = prenom;
		this.note = note;
	}
	
	//Constructeur
	public Bulletin() {
		this.nom = new String();
		this.prenom = new String();
		this.note = 0;
	}
	
	public String toString() {
		return "Bulletin " + this.nom + " " + this.prenom + " " + this.note;
	}
}