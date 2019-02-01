package test;

import java.util.List;

import dao.EleveDAO;
import dao.FormateurDAO;
import metier.Eleve;
import metier.Formateur;
import metier.Identite;

public class Test {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Eleve eleve = new Eleve();
		Formateur formateur =  new Formateur();
		EleveDAO eleveDAO =  new EleveDAO();
		FormateurDAO formateurDAo = new FormateurDAO();
		Identite identity1 =  new Identite("olivier","Juliette",12);
		Identite identity2 =  new Identite("nomProf","marcy",55);
		
		eleve.setIdentite(identity1);
		eleve.setNote(5);
		
		formateur.setIdentite(identity2);
		formateur.setExperience("experience de prof");
		formateur.setEleve(eleve);
		
		eleveDAO.addStudent(eleve);
		formateurDAo.addFormateur(formateur);
		
		/*List<Eleve> stulist = eleveDAO.getEleves();
		for (Eleve student : stulist) {
			System.out.println(student.toString());
		}*/
		
		//eleveDAO.deleteEleve(16);
		
		List<Eleve> stulist = eleveDAO.getElevesByNom("olivier");
		for (Eleve student : stulist) {
			System.out.println(student.toString());
		}
		

	}

}
