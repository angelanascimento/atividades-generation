package atividades02;

import java.util.Scanner;

public class Exercicio05 {

	/*Com base na tabela abaixo, escreva um algoritmo em Java que leia o código de um 
	 * item (número inteiro de 1 a 6) e a quantidade comprada deste item (número inteiro). 
	 * A seguir, mostre na tela o valor total da conta e o nome do produto que foi comprado.*/
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int produto, quantidade;
		
		
		System.out.print("Digite o código do produto: (de 1 à 6) ");
		produto  = entrada.nextInt();
		System.out.print("Digite a quantidade: " );
		quantidade  = entrada.nextInt();
		
		
		switch(produto){
	    case 1:
	    	
	       System.out.printf("Produto: Cachorro Quente\n Valor Total: R$ %.2f ", 10.00 * quantidade);
	    
	        break;
	    case 2:
	    	System.out.printf("Produto: X-Salada\n Valor Total: R$ %.2f ", 15.00 * quantidade);
	        break;
	    case 3:
	    	System.out.printf("Produto: X-Bacon\n Valor Total: R$ %.2f ", 18.00 * quantidade);
	        break;
	    case 4:
	    	System.out.printf("Produto: Bauru\n Valor Total: R$ %.2f ", 12.00 * quantidade);
	        break;
	    case 5:
	    	System.out.printf("Produto: Refrigerante\n Valor Total: R$ %.2f ", 8.00 * quantidade);
	        break;
	    case 6:
	    	System.out.printf("Produto: Suco de laranja\n Valor Total: R$ %.2f ", 13.00 * quantidade);
	        break;
	    default:
	    	System.out.printf("Dígite uma opção válida!");
	}
		
		

	}

	
}
