package atividades02;

import java.util.Scanner;

public class Exercicio03 {
	
	/*Para doar sangue é necessário ter entre 18 e 69 anos de idade. Pessoas com idade 
	 * entre 60 e 69 anos, só podem doar se não for a sua primeira doação. Escreva um 
	 * Algoritmo em Java que obtenha via teclado o nome do doador (String), a idade (inteiro) 
	 * do doador e se é a primeira doação (boolean). De acordo com as Regras para a doação, 
	 * mostre na tela se o doador está Apto ou Não Apto para doar sangue. Veja os exemplos 
	 * abaixo:*/
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		System.out.print("Nome do doador: ");
		nome = entrada.nextLine();
		
		System.out.print("Idade do doador: ");
		idade = entrada.nextInt();
		
		System.out.print("Primeira doação de sangue? [true] ou [false]:");
		primeiraDoacao = entrada.nextBoolean();
		
		if(idade >= 18 && idade <= 69) {
			
			if((idade >= 60 && idade <= 69) && primeiraDoacao == true) {
				System.out.printf("%s não está apto(a) para doar sangue!", nome);
			}
			else {
				System.out.printf("%s está apto(a) para doar sangue!", nome);
			}
		}
		else {
			System.out.printf("%s não está apto(a) para doar sangue!", nome);
		}
	
	}
	
}
