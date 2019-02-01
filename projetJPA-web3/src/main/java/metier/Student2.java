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
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((idStu == null) ? 0 : idStu.hashCode());
		result = prime * result + note;
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student2 other = (Student2) obj;
		if (age != other.age)
			return false;
		if (idStu == null) {
			if (other.idStu != null)
				return false;
		} else if (!idStu.equals(other.idStu))
			return false;
		if (note != other.note)
			return false;
		return true;
	}




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
