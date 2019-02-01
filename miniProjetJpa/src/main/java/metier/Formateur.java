package metier;

import java.io.Serializable;
import javax.persistence.*;


@Entity
public class Formateur implements Serializable
{
	@GeneratedValue
	@Id
	long id;
	@Embedded
	Identite identite;
	String experience;
	
	
	public Formateur ()
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

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public Formateur(long id, Identite identite, String experience) {
		super();
		this.id = id;
		this.identite = identite;
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Formateur [id=" + id + ", identite=" + identite + ", experience=" + experience + "]";
	}


	
	
	
	
	
}
