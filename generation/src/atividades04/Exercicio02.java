package atividades04;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int numero[] = new int[10];
		int soma = 0;
		float media;
		String impares = "", pares = "";
		Scanner entrada = new Scanner(System.in);

		for(int i = 0; i < numero.length; i++) {
			
			System.out.printf("Digite o  %dº número: ", i + 1);
			numero[i] = entrada.nextInt();
			
			soma = soma + numero[i];
			
			if(i % 2 != 0) {
				impares += numero[i] + " ";
			}
			if(numero[i] % 2 == 0) {
				pares += numero[i] + " ";
			}
		}
		media = soma / 10f;
		System.out.println("=============================================");
		System.out.printf("Elementos nos índices ímpares: " + impares);
		System.out.printf("\nElementos pares: " + pares);
		System.out.printf("\nSoma: %d", soma);
		System.out.printf("\nMédia: %.2f", media);
	}

}
