package Entityclasses;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
		
	@Id
	private int id;
	private String Name;
	private double Price;
	public Product() {
		
	}
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		Name = name;
		Price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", Name=" + Name + ", Price=" + Price + "]";
	}
	
	
}
