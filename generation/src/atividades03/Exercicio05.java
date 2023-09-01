package atividades03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		int numero, soma = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		do {
			
			System.out.print("Digite um número: ");
			numero = entrada.nextInt();
			
			if(numero > 0) {
				
				soma = soma + numero;
			}
			
		} while(numero != 0);
		
		System.out.printf("=====================================\nA soma dos números positivos é: %d", soma);

	}

}
