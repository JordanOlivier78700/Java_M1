package dao;
import java.util.List;

import javax.persistence.*;

import metier.Student;

public class StudentDAO 
{
	 
	public StudentDAO() 
	{
		
	}
	
	public void addStudent(Student student) //ajout l'étudiant dans la BDD
	{ 	
		EntityManagerFactory emf;
		
			//1. Instanciation de la persistence.xml 1 fois, attention jpaProjetPU est le name du PU
			emf = Persistence.createEntityManagerFactory("projetJPA-web Maven Webapp");
	
			//2.Construction d'un entity manager pour effectuer les opérations CRUD et transaction
			EntityManager em = emf.createEntityManager();
			
			//3. Ouverture d'une transaction:
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			
			try
			{
				//4. persistence de mon object student
				em.persist(student);//le traitement se fera toujours dans une transaction
				
				//5. commit de la transaction : validation du traitement
				tx.commit();
			}
			catch(Exception e) 
			{
				//Annuler les traitements
				if (tx != null)
				{
					tx.rollback(); //annuler la transaction s'il y a une exception
					e.printStackTrace(); //print
				}
			}
			finally
			{ 
				//6. dans tous les cas on ferme
				 em.close();
				 emf.close();
			}
		}
	
	public List<Student> readStudent(String nom, String prenom) //ajout l'étudiant dans la BDD
	{ 	
		EntityManagerFactory emf;
		
			//1. Instanciation de la persistence.xml 1 fois, attention jpaProjetPU est le name du PU
			emf = Persistence.createEntityManagerFactory("projetJPA-web Maven Webapp");
	
			//2.Construction d'un entity manager pour effectuer les opérations CRUD et transaction
			EntityManager em = emf.createEntityManager();
			
			//3. Ouverture d'une transaction:
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			
			Query query = em.createQuery("select new Student(nom,prenom,age,note) from Student e " +	"where e.nom=?1 and e.prenom=?2"); 
			query.setParameter(1, nom) ;
			query.setParameter(2, prenom) ;
			List<Student> list_etudiant = query.getResultList() ;
			//System.out.println(list_etudiant.toString());

			em.close();
			emf.close();
			return list_etudiant;
		
	}
	public void upadeStudent(String nom, String prenom, int age, int note, int id)
	{
		//Permet de mettre a jour un etudiant 
		//1. Instanciation de la persistence.xml 1 fois, attention jpaProjetPU est le name du PU
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetJPA-web Maven Webapp");
		
		//2.Construction d'un entity manager pour effectuer les op�rations CRUD et transaction
		EntityManager em = emf.createEntityManager();
		
		//3. Ouverture d'une transaction:
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		
		
		try
		{
			
			Student st = em.find(Student.class, id);
			st.setNom(nom);
			st.setPrenom(prenom);
			st.setAge(age);
			st.setNote(note);
			
			em.persist(st);
			
			//5. commit de la transaction : validation du traitement
			tx.commit();
		}
		catch(Exception e) 
		{
			//Annuler les traitements
			if (tx != null)
			{
				tx.rollback(); //annuler la transaction s'il y a une exception
				e.printStackTrace(); //print
			}
		}
		finally
		{ 
			//6. dans tous les cas on ferme
				 em.close();
				 emf.close();
		}
	}
	public void deleteStudent(int id)
	{
		//Appelle � la m�thode remove() 
		//1. Instanciation de la persistence.xml 1 fois, attention jpaProjetPU est le name du PU
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetJPA-web Maven Webapp");
			
		//2.Construction d'un entity manager pour effectuer les op�rations CRUD et transaction
		EntityManager em = emf.createEntityManager();
		
		Student student = em.find(Student.class, id);
		em.getTransaction().begin();
		em.remove(student);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
