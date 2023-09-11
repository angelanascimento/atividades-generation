package atividades05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Set<Integer> numeros = new HashSet<Integer>();
		//Iterator<Integer> valor = numeros.iterator();
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			
			System.out.printf("Digite o %dº número: ", i + 1);
			numeros.add(entrada.nextInt());
		}

		System.out.println("\nListar dados do Set:");
		//Iterator<Integer> valor = numeros.iterator();
		
		/*while(valor.hasNext()) {
			System.out.printf( valor.next() + " ");
		}*/
		
		for(Iterator valor = numeros.iterator(); valor.hasNext();) {
			System.out.printf( valor.next() + " ");
		}
	}
}
