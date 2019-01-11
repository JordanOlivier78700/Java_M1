package metier;

public class Bulletin 
{
	private int idBulletin;
	private String nom;
	private String prenom;
	private int note;
	
	
	
	
	
	
	public Bulletin(String nom, String prenom, int note) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.note = note;
	}
	
	public int getIdBulletin() {
		return idBulletin;
	}
	public void setIdBulletin(int idBulletin) {
		this.idBulletin = idBulletin;
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
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	

}
