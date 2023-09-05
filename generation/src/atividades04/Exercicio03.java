package atividades04;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int matriz [][] = new int[3][3];
		int somaPrincipal = 0; int somaDiagonal = 0;
		String matrizPrincipal = "", matrizSecundaria = "";
		Scanner entrada = new Scanner(System.in);
		
		for(int ii = 0; ii < 3; ii++) {
			
			for(int i = 0; i < 3; i++) {
				
				System.out.printf("Digite o valor da linha %d  coluna %d: ", ii, i );
				matriz[ii][i] = entrada.nextInt();
			}
			
			matrizPrincipal += matriz[ii][ii] + " " ;
			matrizSecundaria += matriz[ii][matriz.length - 1 - ii] + " ";
			
			somaPrincipal += matriz[ii][ii];
			somaDiagonal += matriz[ii][matriz.length - 1 - ii];
		}
		
		System.out.println("================================================");
		System.out.printf("Elementos da Diagonal Principal: %s", matrizPrincipal);
		System.out.printf("\nElementos da Diagonal Secundária: %s", matrizSecundaria);
		System.out.printf("\nSoma dos Elementos da Diagonal Principal: %d", somaPrincipal);
		System.out.printf("\nSoma dos Elementos da Diagonal Secundária: %d", somaDiagonal);

	}

}
