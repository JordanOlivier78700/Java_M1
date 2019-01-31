package test;
import dao.StudentDAO1;
import dao.StudentDAO2;
import metier.Adresse;
import metier.Student1;
import metier.Student2;
import metier.StudentID;

public class Test2 {

	public static void main(String[] args) 
	{
		Student2 stu1 = new Student2();
		StudentDAO2 stuDAO = new StudentDAO2();
		StudentID stuid = new StudentID();
		stuid.setNom("juliette");
		stuid.setPrenom("greant");
		stu1.setIdStu(stuid);
		stu1.setAge(20);
		stu1.setNote(99);
		
		stuDAO.addStudent(stu1);
		
		
	}

}
