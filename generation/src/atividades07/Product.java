package atividades07;

import java.util.UUID;

public class Product {
	
	private UUID id = UUID.randomUUID();
	private String name;
	private String category;
	private int quantity;
	private float price;
	
	
	public Product(String name, String category, int quantity, float price) {
		this.name = name;
		this.category = category;
		this.quantity = quantity;
		this.price = price;
	}
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	} 
	
	public void view() {
		System.out.printf("Id: %s\nNome do Produto: %s\nCategoria: %s\nQuatidade: %d\nPreço: %.2f\n", getId(), getName(), getCategory(), getQuantity(), getPrice());
	}
	
}
