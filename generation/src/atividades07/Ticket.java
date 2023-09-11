package atividades07;


public class Ticket {
	
	private String category;
	private String name;
	private String time;
	private String address;
	private float price;
	
	public Ticket(String category, String name, String time, String address, float price) {
		this.category = category;
		this.name = name;
		this.time = time;
		this.address = address;
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public void view() {
		System.out.printf("Categoria: %s\nNome: %s\nHorário: %s\nEndereço: %s\nPreço: %.2f\n", getCategory(), getName(), getTime(), getAddress(), getPrice());
	}
	
	
}
