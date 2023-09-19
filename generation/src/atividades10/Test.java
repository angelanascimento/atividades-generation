package atividades10;

import java.util.Scanner;


public class Test {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Ticket t1 = new Ticket();
		
		String name, category, description, date, time, local, status;
		int quantityStock;
		float price;
		
		try {
			System.out.print("Digite o nome do filme: ");
			name = input.nextLine();
			
			System.out.print("Digite a categoria: ");
			category = input.nextLine();
			
			System.out.print("Digite a descrição do filme: ");
			description = input.nextLine();
			
			System.out.print("Digite a quantidade de ingressos em estoque: ");
			quantityStock = input.nextInt();
			
			System.out.print("Digite o preço do ingresso: ");
			price = input.nextFloat();
			
			System.out.print("Digite a data do filme: ");
			date = input.nextLine();

			System.out.print("\nDigite o horário do filme: ");
			time = input.nextLine();
			
			System.out.print("Digite o endereço do evento: ");
			local = input.nextLine();
			
			System.out.print("Digite o status do evento: ");
			status = input.nextLine();
			
			t1.setName(name);
			t1.setCategory(category);
			t1.setDescription(description);
			t1.setQuantityStock(quantityStock);
			t1.setPrice(price);
			t1.setDate(date);
			t1.setTime(time);
			t1.setLocal(local);
			t1.setStatus(status);

			t1.view();
			
		}catch(Exception e) {

			System.err.println("\nO valor digitado não é válido!");
		}

	}

}
