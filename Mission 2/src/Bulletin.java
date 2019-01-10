
public class Bulletin 
{
	private String nom;
	private String prenom;
	private int note;
	
	public Bulletin()
	{
		this.nom = "default";
		this.prenom = "default";
		this.note = 0;
	}
	


	public Bulletin(String nom, String prenom, int note) 
	{
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.note = note;
	}
	
	public String getNom() 
	{
		return nom;
	}
	public void setNom(String nom) 
	{
		this.nom = nom;
	}
	public String getPrenom() 
	{
		return prenom;
	}
	public void setPrenom(String prenom) 
	{
		this.prenom = prenom;
	}
	public int getNote() 
	{
		return note;
	}
	public void setNote(int note) 
	{
		this.note = note;
	}
	
	
	@Override
	public String toString() {
		return "Bulletin [nom=" + nom + ", prenom=" + prenom + ", note=" + note + "]";
	}
	
	
}
