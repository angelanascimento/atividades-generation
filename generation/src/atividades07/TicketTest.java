package atividades07;

public class TicketTest {

	public static void main(String[] args) {
	
		Ticket t1 = new Ticket("Filme", "O Auto da Compadecida", "16:50", "Rua Dom Pedro, 278 - Cidade Monções/SP", 55.00f);
		Ticket t2 = new Ticket("Filme", "Guardiões da Galaxia", "13:30", "Rua Dom Pedro, 278 - Cidade Monções/SP", 55.00f);
		
		t1.view();
		System.out.println("======================================================================");
		t2.view();
		
	}

}
