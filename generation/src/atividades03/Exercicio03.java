package atividades03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int idade;
		int menor = 0;
		int maior = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Digite uma idade: "  );
		idade = entrada.nextInt();
		
		while(idade != -1) {
			
			if(idade < 21) {
				menor++;
			}
			else if(idade > 50) {
				maior++;
			}
			
			System.out.printf("Digite uma idade: "  );
			idade = entrada.nextInt();
		}
		
		System.out.printf("========================================\nTotal de pessoas menores de 21 anos: %d\n", menor);
		System.out.printf("Total de pessoas maiores de 50 anos: %d\n========================================", maior);
	}

}


