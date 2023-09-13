package atividades08;

public class Company {
	
	private String razaoSocial;
	private String address;
	private int number;
	private String city;
	private String zipCode;
	private String CNPJ;
	

	public Company(String name, String address, int number, String city, String zipCode, String CNPJ) {
		this.razaoSocial = name;
		this.address = address;
		this.number = number;
		this.city = city;
		this.zipCode = zipCode;
		this.CNPJ = CNPJ;
	}

	public String getName() {
		return razaoSocial;
	}

	public void setName(String name) {
		this.razaoSocial = name;
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
	
	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public void view() {
		System.out.printf("Nome da Empresa: %s\nEndereço: %s, %d - %s CEP: %s\n", getName(), getAddress(), getNumber(), getCity(), getZipCode());
	}
}
