package metier;

import java.io.Serializable;
import javax.persistence.*;


@Entity
public class Eleve implements Serializable
{
	@GeneratedValue
	@Id
	long id;
	@Embedded
	Identite identite;
	double note;
	
	public Eleve ()
	{}

	public long getId() {
		return id;
	}

	public Identite getIdentite() {
		return identite;
	}

	public void setIdentite(Identite identite) {
		this.identite = identite;
	}

	public double getNote() {
		return note;
	}

	public void setNote(double note) {
		this.note = note;
	}

	public Eleve(Identite identite, double note) {
		super();
		this.identite = identite;
		this.note = note;
	}
	public Eleve(String nom, String prenom, int age, double note) {
		super();
		
		this.identite = new Identite(nom, prenom, age);
		this.note = note;
	}
	public Eleve(long id,Identite identite, double note) {
		super();
		this.id=id;
		this.identite = identite;
		this.note = note;
	}

	@Override
	public String toString() {
		return "Eleve [id=" + id + ", identite=" + identite + ", note=" + note + "]";
	}
	
	
	
	
	
}
