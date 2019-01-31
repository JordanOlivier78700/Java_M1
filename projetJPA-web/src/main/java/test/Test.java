package test;

import java.util.List;

import javax.persistence.Query;

import dao.StudentDAO;
import metier.Student;

public class Test {

	public static void main(String[] args) 
	{
		Student stu1 = new Student();
		StudentDAO stuDAO = new StudentDAO();
		/*
		stu1.setNom();
		stu1.setPrenom();
		stu1.setAge();
		stu1.setNote();
		
		stuDAO.addStudent(stu1);
		
		List<Student> stulist = stuDAO.readStudent("Olivier", "Jordan");
		for (Student student : stulist) {
			System.out.println(student.toString());
		}
		
		stuDAO.upadeStudent("Toto", "Tata", 20, 14, 1);
		*/
		
		stuDAO.deleteStudent(2);
		
	}

}
