package atividades02;

import java.util.Scanner;

public class Exercicio07 {
	
	/*Com base na tabela abaixo, escreva um algoritmo em Java, que simule uma Calculadora simples. O programa deverá 
	 * ler dois números float: numero1 e numero2, e na sequência ler o Código da operação matemática (número inteiro 
	 * de 1 a 4). A seguir, mostre na tela o resultado da operação entre os 2 números. Caso a operação seja diferente 
	 * do intervalo 1 a 4, mostre a mensagem Operação Inválida!*/

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float numero1, numero2;
		int operacao;
		
		
		System.out.print("Digite o 1º número: ");
		numero1  = entrada.nextFloat();
		
		System.out.print("Digite o 2º número: " );
		numero2  = entrada.nextFloat();
		
		System.out.print("Operação: " );
		operacao  = entrada.nextInt();
		
		
		switch(operacao){
	    case 1:
	    	float soma = numero1 + numero2;
	    	 System.out.printf("%.1f + %.1f = %.1f", numero1, numero2, soma);
	        break;
	    case 2:
	    	float subtracao = numero1 - numero2;
	    	 System.out.printf("%.1f - %.1f = %.1f", numero1, numero2, subtracao);
	        break;
	    case 3:
	    	float multiplicacao = numero1 * numero2;
	    	 System.out.printf("%.1f * %.1f = %.1f", numero1, numero2, multiplicacao);
	        break;
	    case 4:
	    	float divisao = numero1 / numero2;
	    	 System.out.printf("%.1f / %.1f = %.1f", numero1, numero2, divisao);
	        break;
	    default:
	        // Opcional -  Executa alguma ação caso todas as condições acima forem falsas
		}
		
	}

}
