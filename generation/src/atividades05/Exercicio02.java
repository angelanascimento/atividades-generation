package atividades05;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		Scanner entrada = new Scanner(System.in);
		int numero;
		
		lista.add(2);
		lista.add(5);
		lista.add(1);
		lista.add(3);
		lista.add(4);
		lista.add(9);
		lista.add(7);
		lista.add(8);
		lista.add(10);
		lista.add(6);
		
		System.out.print("Digite o número que você deseja encontrar: ");
		numero = entrada.nextInt();
		
		if(lista.indexOf(numero) != -1) {
			System.out.printf("\nO número %d está localizado na posição: %d", numero, lista.indexOf(numero));
		}
		else {
			System.out.printf("\nO número %d não foi encontrado!", numero);
		}

	}

}
