package test;
import dao.StudentDAO;
import metier.Student;

public class Test {

	public static void main(String[] args) 
	{
		Student stu1 = new Student();
		StudentDAO stuDAO = new StudentDAO();
		
		stu1.setNom();
		stu1.setPrenom();
		stu1.setAge();
		stu1.setNote();
		
		stuDAO.addStudent(stu1);
		
		
	}

}
