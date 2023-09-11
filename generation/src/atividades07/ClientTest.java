package atividades07;

public class ClientTest {

	public static void main(String[] args) {
		
		Client c1 = new Client("João", "Silva Santos", "22/04/1989", "459.897.272-72", "Médico");
		Client c2 = new Client("Maria", "Silva Santos", "14/09/1990", "822.781.543-00", "Médico");
		
		//c1.setName("João");
		
		c1.view();
		System.out.println("=====================================");
		c2.view();

	}

}
