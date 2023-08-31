package atividades02;

import java.util.Scanner;

public class Exercicio01 {
	
	/*Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na tela 
	 se a soma de A + B é maior, menor ou igual a C.*/

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("Digite o número A: ");
		a = entrada.nextInt();
		
		System.out.print("Digite o número B: ");
		b = entrada.nextInt();
		
		System.out.print("Digite o número C: ");
		c = entrada.nextInt();
		
		
		if((a + b) > c ) {
			
			System.out.println("A Soma de A + B é Maior do que C");
		}
		else if((a + b) < c) {
			System.out.println("A Soma de A + B é Menor do que C");
		}
		else {
			System.out.println("A Soma de A + B é Igual a C");
		}
		
	}

}
