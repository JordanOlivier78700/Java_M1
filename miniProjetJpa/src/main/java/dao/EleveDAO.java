package dao;
import java.util.List;

import javax.persistence.*;

import metier.Eleve;


public class EleveDAO 
{
	 
	public EleveDAO() 
	{
		
	}
	
	public void addStudent(Eleve student) //ajout l'�tudiant dans la BDD
	{ 	
		EntityManagerFactory emf;
		
			//1. Instanciation de la persistence.xml 1 fois, attention jpaProjetPU est le name du PU
			emf = Persistence.createEntityManagerFactory("miniProjetJpa");
	
			//2.Construction d'un entity manager pour effectuer les op�rations CRUD et transaction
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
	public List<Eleve> getEleves() //ajout l'Ã©tudiant dans la BDD
	{ 	
		EntityManagerFactory emf;
		
			//1. Instanciation de la persistence.xml 1 fois, attention jpaProjetPU est le name du PU
			emf = Persistence.createEntityManagerFactory("miniProjetJpa");
	
			//2.Construction d'un entity manager pour effectuer les opÃ©rations CRUD et transaction
			EntityManager em = emf.createEntityManager();
			
			//3. Ouverture d'une transaction:
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			
			Query query = em.createQuery("select new Eleve(id,identite,note) from Eleve e "); 
			List<Eleve> list_etudiant = query.getResultList() ;
			//System.out.println(list_etudiant.toString());

			em.close();
			emf.close();
			return list_etudiant;
		
	}
	
}