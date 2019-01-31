package metier;
import java.io.Serializable;
import java.util.Scanner;

import javax.persistence.*;

@Entity
public class Student2 implements Serializable
{
	@EmbeddedId
	StudentID idStu;
	int note;
	int age;

	public Student2()
	{
	}
	



	public StudentID getIdStu() {
		return idStu;
	}




	public void setIdStu(StudentID idStu) {
		this.idStu = idStu;
	}




	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}
	public void setNote() {
		System.out.println("Entrez la note : ");
		Scanner sc = new Scanner(System.in);
		this.note = sc.nextInt();
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void setAge() {
		System.out.println("Entrez l'age : ");
		Scanner sc = new Scanner(System.in);
		this.age = sc.nextInt();
	}

	
}
