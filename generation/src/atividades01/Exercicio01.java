package atividades01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		double salario, abono, novoSalario;

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu salário: ");
		salario = entrada.nextDouble();
		
		System.out.print("Digite o valor do abono: ");
		abono = entrada.nextDouble();
		
		novoSalario = salario + abono;
		
		System.out.println(novoSalario);
		
	}

}
