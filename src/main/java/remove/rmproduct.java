package remove;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Entityclasses.Product;

public class rmproduct {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate_many_to_one_uni");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	
	Product p=em.find(Product.class,2);
	
	et.begin();
	em.remove(p);
	et.commit();
	}
}
