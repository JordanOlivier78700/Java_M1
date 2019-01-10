import java.util.ArrayList;
import java.util.List;

public class IBulletin 
{
	private List<Bulletin> maliste;
	


	public IBulletin ()
	{
		this.maliste = new ArrayList<>();
	}

	public List<Bulletin> getMaliste() 
	{
		return maliste;
	}

	public void setMaliste(List<Bulletin> maliste) 
	{
		this.maliste = maliste;
	}
	
	public void addBulletin(Bulletin bulletin)
	{
		this.maliste.add(bulletin);
	}
	@Override
	public String toString() {
		return "IBulletin [maliste=" + maliste + "]";
	}
	
	
	
}
