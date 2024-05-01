package fetch;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Entityclasses.Product;
import Entityclasses.Review;

public class fetch {
		public static void main(String[] args) {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate_many_to_one_uni");
			EntityManager em=emf.createEntityManager();
			
			
			Review r=em.find(Review.class, 101);
			Product p=r.getProduct();
			
			System.out.println(p);
			System.out.println(r);
			
		}
}
