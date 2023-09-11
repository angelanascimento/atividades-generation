package atividades07;

public class Client {
	
	private String name;
	private String lastName;
	private String dateBirth;
	private String cpf;
	private String occupation;
	
	public Client(String name, String lastName, String dateBirth, String cpf, String occupation) {
		this.name = name;
		this.lastName = lastName;
		this.dateBirth = dateBirth;
		this.cpf = cpf;
		this.occupation = occupation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(String dateBirth) {
		this.dateBirth = dateBirth;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	public void view() {
		System.out.printf("Nome: %s\nSobrenome: %s\nData de Nascimento: %s\nCPF: %s\nProfissão: %s\n", getName(), getLastName(),getDateBirth(), getCpf(), getOccupation());
	}

}
