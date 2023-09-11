package atividades07;

public class GameTest {

	public static void main(String[] args) {
		
		Product p1 = new Product("The Last Of Us", "Jogos", 22, 250.00f);
		Product p2 = new Product("Escape from Tarkov", "Jogos", 85, 745.00f);
		
		p1.view();
		System.out.println("==================================");
		p2.view();
	}

}
