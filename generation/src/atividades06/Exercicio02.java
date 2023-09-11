package atividades06;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Stack<String> livros = new Stack<String>();
		Scanner entrada = new Scanner(System.in);
		int opcao;
		String nome;
		
		System.out.println("\n**** OPÇÕES: ****\n");
		System.out.println("[1]: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.");
		System.out.println("[2]: Listar todos os Clientes na fila.");
		System.out.println("[3]: Chamar (retirar) uma pessoa da fila.");
		System.out.println("[0]: O programa deve ser finalizado.");
		System.out.println("\n=================================================================================");
		
		do{
			System.out.print("\nDigite uma das opções: ");
			opcao = entrada.nextInt();
			
			if(opcao == 1) {
				System.out.print("Digite o nome do livro que deseja adicionar: ");
				entrada.nextLine();
				nome = entrada.nextLine();
				livros.push(nome);
				
				System.out.println("=========================================================");
				System.out.printf("O livro %s foi adicionado(a)!\n", nome);
				System.out.println("=========================================================");
			}
			else if(opcao == 2) {
				System.out.println(livros);
			}
			else if(opcao == 3) {
				if(livros.isEmpty()) {
					System.out.println("===================================");
					System.out.println("A lista está vazia!");
					System.out.println("===================================");
				}
				else {
					livros.pop();
					System.out.println("=========================================================");
					System.out.println("Um Livro foi retirado da pilha!");
					System.out.println("=========================================================");
				}
			}
			else if(opcao < 0 || opcao > 3) {
				System.out.println("==========================================================");
				System.out.println("* Opção inválida! Por favor, digite uma das opções acima *");
				System.out.println("==========================================================");
			}
			
		}while(opcao != 0);
				
		System.out.println("Programa Finalizado!");

	}

}
