package atividades03;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		int idade, sexo, categoria, HM40 = 0, MF30 = 0, MFF = 0, PB = 0, HB = 0, back, full, front, mobile;
		
		String continuar;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a Idade: ");
		idade = entrada.nextInt();
		
		System.out.print("Digite o Sexo: ");
		sexo = entrada.nextInt();
		
		System.out.print("Digite a Categoria: ");
		categoria = entrada.nextInt();
		
		System.out.print("Deseja continuar (S/N): ");
		continuar = entrada.next();
		
		while(continuar.equalsIgnoreCase("S")) {
			
			if(sexo == 1) {

				if(categoria == 3 ) {
					
					if(idade > 40) {
						HM40++;
					}
				}
			}
			else if(sexo == 2) {
				
				if(categoria == 4) {
					
					if(idade < 30) {
						
						MF30++;
					}
				}
				else if(categoria == 2) {
					MFF++;
				}
			}
			else if(sexo == 3) {
				
				if(categoria == 1) {
					
					PB++;
				}
			}
			else {
				System.out.println("Opção inválida!");
			}
			
			System.out.print("Digite a Idade: ");
			idade = entrada.nextInt();
			
			System.out.print("Digite o Sexo: ");
			sexo = entrada.nextInt();
			
			System.out.print("Digite a Categoria: ");
			categoria = entrada.nextInt();
			
			System.out.print("Deseja continuar (S/N): ");
			continuar = entrada.next();
			
		}
		System.out.println("===============================================================================");
		System.out.printf("O número de pessoas desenvolvedoras Backend: %d\n", PB);
		System.out.printf("O número de mulheres desenvolvedoras Frontend: %d\n", MFF );
		System.out.printf("O número de homens desenvolvedores Mobile maiores de 40 anos: %d\n", HM40);
		System.out.printf("O número de mulheres desenvolvedoras FullStack menores de 30 anos: %d\n", MF30);

	}

}
