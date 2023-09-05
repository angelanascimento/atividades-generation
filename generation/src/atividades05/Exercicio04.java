package atividades05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Exercicio04 {

	public static void main(String[] args) {
		
			
			HashSet<Integer> numeros = new HashSet<Integer>();
			Scanner entrada = new Scanner(System.in);
			int numero;
			
			numeros.add(2);
			numeros.add(5);
			numeros.add(1);
			numeros.add(3);
			numeros.add(4);
			numeros.add(9);
			numeros.add(7);
			numeros.add(8);
			numeros.add(10);
			numeros.add(6);
			
			System.out.printf("Digite o número que você deseja encontrar: ");
			numero = entrada.nextInt();
			
			if(numeros.contains(numero)) {
				System.out.printf("\nO número %d foi encontrado!", numero);
			}
			else {
				System.out.printf("\nO número %d não foi encontrado!", numero);
			}

	}

}


