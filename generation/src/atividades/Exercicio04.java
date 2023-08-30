package atividades;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		float n1, n2, n3, n4, diferenca;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o 1º número: ");
		n1 = entrada.nextFloat();
		
		System.out.print("Digite o 2º número: ");
		n2 = entrada.nextFloat();
		
		System.out.print("Digite o 3º número: ");
		n3 = entrada.nextFloat();
		
		System.out.print("Digite o 4º número: ");
		n4 = entrada.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.println(diferenca);
		

	}

}
