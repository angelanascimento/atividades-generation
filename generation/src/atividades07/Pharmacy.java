package atividades07;

public class Pharmacy {
	
	private String name;
	private String address;
	private int number;
	private String city;
	private String zipCode;
	
	public Pharmacy(String name, String address, int number, String city, String zipCode) {
		this.name = name;
		this.address = address;
		this.number = number;
		this.city = city;
		this.zipCode = zipCode;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public void view() {
		System.out.printf("Nome da Farmácia: %s\nEndereço: %s, %d - %s CEP: %s\n", getName(), getAddress(), getNumber(), getCity(), getZipCode());
	}
	
	
}
