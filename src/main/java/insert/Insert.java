package insert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Entityclasses.Product;
import Entityclasses.Review;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate_many_to_one_uni");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
//		Product p1=new Product(1,"iphone",80000);
//		Review r1=new Review(101,4.2,"Good Product",p1);
//		Review r2=new Review(102,3.2,"Avg. Product",p1);
//		
//		Product p2=new Product(2,"Samsung",75000);
//		Review r3=new Review(103,4.7,"Excellent Product",p2);
//		Review r4=new Review(104,1.2,"Not Good Product",p2);
		
		Product p3=new Product(3,"Nokia",56000);
		Review r5=new Review(105,3.8,"Good Product",p3);
		Review r6=new Review(106,2.2,"bad Product & not valuable for price",p3);
		
		et.begin();
		//em.persist(p1);
		//em.persist(p2);
		em.persist(p3);
		//em.persist(r1);
		//em.persist(r2);
		//em.persist(r3);
		//em.persist(r4);
		em.persist(r5);
		em.persist(r6);
		et.commit();
		
		
		
	}
}
