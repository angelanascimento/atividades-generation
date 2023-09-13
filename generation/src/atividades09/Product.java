package atividades09;

import java.util.UUID;

public abstract class Product {
	
	private UUID id = UUID.randomUUID();
	private String name;
	private String category;
	private String description;
	private int quantityStock;
	private float price;
	
	public Product(String name, String category, String description, int quantityStock, float price) {
		this.name = name;
		this.category = category;
		this.description = description;
		this.quantityStock = quantityStock;
		this.price = price;
	}
	
	public Product() {
		
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantityStock() {
		return quantityStock;
	}

	public void setQuantityStock(int quantityStock) {
		this.quantityStock = quantityStock;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void buy(int quantity) {
		if(quantity <= this.quantityStock) {
			this.quantityStock -= quantity;
			System.out.println("Compra realizada com sucesso!");
		}
		else if(this.quantityStock < quantity && this.quantityStock != 0) {
			System.out.printf("\nNão é possível concluir sua compra. A quantidade informada excede o limite em estoque: %d\n", this.quantityStock);
		}
		else if(this.quantityStock == 0) {
			System.out.println("Não é possível concluir sua compra. Item esgotado!");
		}
	}
	
	public abstract void view();
	
}
