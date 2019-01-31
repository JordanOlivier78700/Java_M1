package dao;
import javax.persistence.*;

import metier.Student1;
import metier.Student2;

public class StudentDAO2 
{
	 
	public StudentDAO2() 
	{
		
	}
	
	public void addStudent(Student2 student) //ajout l'étudiant dans la BDD
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
}