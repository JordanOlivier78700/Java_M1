package test;
import dao.StudentDAO1;
import metier.Adresse;
import metier.Student1;

public class Test1 {

	public static void main(String[] args) 
	{
		Student1 stu1 = new Student1();
		StudentDAO1 stuDAO = new StudentDAO1();
		Adresse adresse =  new  Adresse("rue nomderue","78700","conflans");
		
		stu1.setAge(20);
		stu1.setNom("Cruche");
		stu1.setPrenom("Juliette");
		stu1.setNote(99);
		stu1.setAdresse(adresse);
		
		stuDAO.addStudent(stu1);
		
		
	}

}
