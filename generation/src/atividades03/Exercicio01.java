package atividades03;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		int menor, maior;
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Digite o primeiro número do intervalo: ");
		menor = entrada.nextInt();
		
		System.out.print("Digite o segundo número do intervalo: ");
		maior = entrada.nextInt();
		
		
		if(menor > maior) {
			System.out.println("=============================\n* Intervalo inválido! *");
			System.out.println("=============================\nExemplo:\nPrimeiro número: 8 [menor]\n"
					+ "Segundo número: 26 [maior]\n=============================");
		}
		else {
			System.out.println("=============================\nNo Intervalo entre 10 e 100:"
					+ "\n=============================");
			for(int i = menor; i <= maior; i++) {
				
				if(i % 3 == 0 && i % 5 == 0) {
					
					System.out.printf("%d é múltiplo de 3 e 5\n", i);
				}
			}
		}
	}
}
