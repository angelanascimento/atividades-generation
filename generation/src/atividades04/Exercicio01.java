package atividades04;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		int vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int numero;
		int indice = -1;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o número que você deseja encontrar (1 á 10): ");
		numero = entrada.nextInt();
		
		for(int i = 0; i < vetor.length; i++ ) {

			if(vetor[i] == numero) {
				
				indice = i;
				System.out.printf("O número %d está localizado na posição: %d ", vetor[i], i);
			}
		}
		if(indice == -1 ) {
			System.out.printf("O número %d não foi encontrado!", numero);
		}
	}
}
