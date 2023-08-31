package atividades01;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		double salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o salário bruto: ");
		salarioBruto = entrada.nextDouble();
		
		System.out.print("Digite o adicional noturno: ");
		adicionalNoturno = entrada.nextDouble();
		
		System.out.print("Digite as horas extras: ");
		horasExtras = entrada.nextDouble();
		
		System.out.print("Digite os descontos: ");
		descontos = entrada.nextDouble();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("Salário Líquido: %.2f", salarioLiquido);

	}

}
