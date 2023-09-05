package atividades06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Queue<String> clientes = new LinkedList<String>();
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
				System.out.print("Digite o nome da pessoa que deseja adicionar: ");
				nome = entrada.next(); 
				clientes.add(nome);
				System.out.println("=========================================================");
				System.out.printf("Cliente %s foi adicionado(a) a fila\n", nome);
				System.out.println("=========================================================");
			}
			else if(opcao == 2) {
				System.out.println(clientes);
			}
			else if(opcao == 3) {
				if(clientes.isEmpty()) {
					System.out.println("===================================");
					System.out.println("A Fila está vazia!");
					System.out.println("===================================");
				}
				else {
					System.out.print("Digite o nome da pessoa que deseja remover: ");
					nome = entrada.next();
					clientes.remove(nome);
					System.out.println("=========================================================");
					System.out.printf("Cliente %s foi removido(a) da fila\n", nome);
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
