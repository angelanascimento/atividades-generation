package atividades03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int numero;
		int par = 0;
		int impar = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.printf("Digite o %dº número: ", i );
			numero = entrada.nextInt();
			
			if(numero % 2 == 0) {
				par = par + 1;
			}
			else {
				impar = impar + 1;
			}
		}
		
		System.out.printf("==============================\nTotal de números pares: %d\n", par);
		System.out.printf("Total de números impares: %d\n==============================", impar);
	}

}
