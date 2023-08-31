package atividades02;

import java.util.Scanner;

public class Exercício06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nome; 
		int cargo;
		double salario;
		
		
		System.out.print("Nome do colaborador: ");
		nome  = entrada.nextLine();
		
		System.out.print("Cargo: " );
		cargo  = entrada.nextInt();
		
		System.out.print("Salário: " );
		salario  = entrada.nextDouble();
		
		
		
		switch(cargo){
	    case 1:
	       System.out.printf("=============================\nNome do colaborador: %s\nCargo: Gerente\nSalário: %.2f\n============================= ", nome, salario + (0.10 * salario));
	        break;
	    case 2:
	    	System.out.printf("=============================\nNome do colaborador: %s\nCargo: Vendedor\nSalário: %.2f\n============================= ", nome, salario + (0.07 * salario));
	        break;
	    case 3:
	    	System.out.printf("=============================\nNome do colaborador: %s\nCargo: Supervisor\nSalário: %.2f\n============================= ", nome, salario + (0.09 * salario));
	        break;
	    case 4:
	    	System.out.printf("=============================\nNome do colaborador: %s\nCargo: Motorista\nSalário: %.2f\\n============================= ", nome, salario + (0.06 * salario));
	        break;
	    case 5:
	    	System.out.printf("=============================\nNome do colaborador: %s\nCargo: Estoquista\nSalário: %.2f\n============================= ", nome, salario + (0.05 * salario));
	        break;
	    case 6:
	    	System.out.printf("=============================\nNome do colaborador: %s\nCargo: Técnico de TI\nSalário: %.2f\n============================= ", nome, salario + (0.08 * salario));
	        break;
	    default:
	    	System.out.printf("Dígite uma opção válida!");
	}

	}

}
