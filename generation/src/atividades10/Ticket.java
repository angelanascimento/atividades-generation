package atividades10;

public class Ticket extends Product {

	private String date;
	private String time;
	private String local; // PODERIA CRIAR UMA CLASSE ENDEREÇO E ATRIBUIR ESSE TIPO NESSA DECLARAÇÃO EX.: private Endereço local;
	private String status;
	
	public Ticket(String name, String category, String description, int quantityStock, float price, String date, String time, String local, String status) {
		super(name, category, description, quantityStock, price);
		this.date = date;
		this.time = time;
		this.local = local;
		this.status = status;
	}

	public Ticket() {
		super();
	}


	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public void view() {
		System.out.println("\n*********************************************");
		System.out.println("Informações do Produto:");
		System.out.printf("\nId: %s\nNome do Produto: %s\nCategoria: %s\nQuatidade em estoque: %d\nPreço: %.2f\n", getId(), getName(), 
				getCategory(), getQuantityStock(), getPrice());
		System.out.println();
		System.out.printf("\nData e Hora: %s às %s\nEndereço: %s\nSTATUS: %s\n", getDate(), getTime(), getLocal(), getStatus());
	}
}
