package atividades02;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float valor;
		int operacao;
		float saldo = 1000.00f;
		
		System.out.print("Operação: " );
		operacao  = entrada.nextInt();
	
		switch(operacao){
	    case 1:
	    	System.out.printf("\nOperação - Saldo\nSaldo: %.2f", saldo);
	        break;
	    case 2:
	    	System.out.print("Valor: ");
			valor  = entrada.nextFloat();
			
	    	if(valor > saldo) {
	    		System.out.println("\nOperação - Saque\nSaldo Insuficiente!");
	    	}
	    	else {
	    		System.out.printf("\nOperação - Saque\nNovo Saldo:  %.2f", saldo = saldo - valor );
	    	}
	        break;
	    case 3:
	    	System.out.print("Valor: ");
			valor  = entrada.nextFloat();
		
			System.out.printf("\nOperação - Depósito\nSaldo: %.2f", saldo = saldo + valor);
	        break;
	    default:
	    	System.out.printf("\nOperação Inválida!");
		}
	}

}
