package metier;

import java.io.Serializable;
import javax.persistence.*;


@Entity
public class Maire implements Serializable
{
	@Id
	@GeneratedValue
	int id;
	String name;
	
	public Maire() {}
	
	public Maire(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

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

	@Override
	public String toString() {
		return "Maire [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
