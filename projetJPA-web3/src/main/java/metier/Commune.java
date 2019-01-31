package metier;

import java.io.Serializable;
import javax.persistence.*;


@Entity
public class Commune implements Serializable
{
	@Id
	@GeneratedValue
	int id;
	String name;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "maire_id")
	Maire maire;
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Maire getMaire() {
		return maire;
	}
	public void setMaire(Maire maire) {
		this.maire = maire;
	}
	@Override
	public String toString() {
		return "Commune [id=" + id + ", name=" + name + ", maire=" + maire + "]";
	}
	public Commune(int id, String name, Maire maire) {
		super();
		this.id = id;
		this.name = name;
		this.maire = maire;
	}
	public Commune ()
	{}
	
	
}
