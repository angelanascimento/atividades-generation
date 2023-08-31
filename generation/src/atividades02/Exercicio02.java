package atividades02;

import java.util.Scanner;

public class Exercicio02 {
	
	/*Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre na tela
	 *uma mensagem indicando se este número é par ou ímpar e se o número é positivo ou negativo. 
	 *Veja os exemplos abaixo:*/

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = entrada.nextInt();
		
		if(numero % 2 == 0) {
			
			if(numero >= 0) {
				System.out.printf("O Número %d é par e positivo!", numero);
			}
			else{
				System.out.printf("O Número %d  é par e negativo!", numero);
			}
		}
		else {
			
			if(numero < 0) {
				System.out.printf("O Número %d é impar e negativo!", numero);
			}
			else{
				System.out.printf("O Número %d é impar e positivo!", numero);
			}
		}
	}

}
