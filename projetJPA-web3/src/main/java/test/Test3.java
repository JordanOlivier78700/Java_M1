package test;
import dao.CommuneDAO;
import dao.StudentDAO;
import metier.Commune;
import metier.Maire;
import metier.Student;

public class Test3 {

	public static void main(String[] args) 
	{
		Commune com =  new Commune();
		Maire maire=  new Maire();
		CommuneDAO comDAO = new CommuneDAO();
		
		com.setName("conflans");
		maire.setName("Juliette");
		com.setMaire(maire);
		
		comDAO.addCommune(com);
		
		
	}

}
