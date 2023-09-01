package atividades03;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		int numero;
		float soma = 0, contador = 0;
		
		
		Scanner entrada = new Scanner(System.in);
		
		do {
			
			System.out.print("Digite um número: ");
			numero = entrada.nextInt();
			
			if(numero % 3 == 0) {
				contador++;
				soma = soma + numero; 
			}
			
		} while(numero != 0);
		
		float media = soma / (contador - 1);
		System.out.printf("===================================================\n"
				+ "A média de todos os números múltiplos de 3 é: "+  media);
	}
}
