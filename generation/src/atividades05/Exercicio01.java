package atividades05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		ArrayList<String> cor = new ArrayList<String>();
		
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			
			System.out.printf("Digite a %dª cor: ", i + 1);
			cor.add(entrada.nextLine());
			
		}
		
		System.out.print("=========================================================");
		System.out.print("\nListar todas as cores: ");
		for(int i = 0; i < 5; i++) {
			System.out.printf(cor.get(i) + " ");
		}
		
		System.out.print("\nOrdenar as cores: ");
		for(int i = 0; i < 5; i++) {
			
			Collections.sort(cor);
			System.out.printf(cor.get(i) + " ");
		}
	}

}
