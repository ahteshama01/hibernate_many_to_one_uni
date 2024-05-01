package merge;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Entityclasses.Product;
import Entityclasses.Review;

public class Merge {
	
	
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate_many_to_one_uni");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		//adding new data 
		Product p=new Product(2,"Samsung",75000);
		
		Review r=em.find(Review.class, 103);
		Review r1=em.find(Review.class, 104);
		
		r.setProduct(p);
		r1.setProduct(p);
		
		et.begin();
		em.persist(p);
		em.merge(r);
		em.merge(r1);
		et.commit();
	}
}
