package metier;

import java.io.Serializable;
import javax.persistence.*;

@Embeddable
public  class Adresse  implements Serializable {

    @Column(length=40)
    private String rue ;
    private String codePostal;
    private String ville;
    
    public Adresse()
    {
    	 
    }
    
	public Adresse(String rue, String codePostal, String ville) {
		super();
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	@Override
	public String toString() {
		return "Adresse [rue=" + rue + ", codePostal=" + codePostal + ", ville=" + ville + "]";
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
    
    // reste de la classe
}