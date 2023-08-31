package atividades02;

import java.text.Normalizer;
import java.util.Scanner;

public class Exercicio04 {

	/*Escreva um algoritmo em Java, que leia 3 palavras (String), que definem as características de um tipo de animal possível 
	 * segundo o diagrama abaixo, que deve ser lido da esquerda para a direita.*/
	

	public static void main(String[] args) {
		
		String palavra01, palavra02, palavra03;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("1ª palavra: ");
		palavra01 = entrada.nextLine();
		
		System.out.print("2ª palavra: ");
		palavra02 = entrada.nextLine();
		
		System.out.print("3ª palavra: ");
		palavra03 = entrada.nextLine();
		
		if(palavra01.equalsIgnoreCase("vertebrado")) {
			
			if(palavra02.equalsIgnoreCase("ave")) {
				
				if(palavra03.equalsIgnoreCase("carnívoro")) {
					
					System.out.println("[Águia]");
				}
				else if(palavra03.equalsIgnoreCase("onívoro")) {
					
					System.out.println("[Pomba]");
				}
				else {
					System.out.println("Não encontrado! Por favor, digite uma opção válida.");
				}
			}
			else if(palavra02.equalsIgnoreCase("mamífero")) {
				
				if(palavra03.equalsIgnoreCase("onívoro")) {
					
					System.out.println("[Homem]");
				}
				else if(palavra03.equalsIgnoreCase("herbívoro")) {
					System.out.println("[Vaca]");
				}
				else {
					System.out.println("Não encontrado! Por favor, digite uma opção válida.");
				}
			}
			else {
				System.out.println("Não encontrado! Por favor, digite uma opção válida.");
			}
		}
		else if(palavra01.equalsIgnoreCase("invertebrado")) {
			
			if(palavra02.equalsIgnoreCase("inseto")) {
				
				if(palavra03.equalsIgnoreCase("hematófago")) {
					
					System.out.println("[Pulga]");
				}
				else if(palavra03.equalsIgnoreCase("herbívoro")) {
					
					System.out.println("[Largata]");
				}
				else {
					System.out.println("Não encontrado! Por favor, digite uma opção válida.");
				}
			}
			else if(palavra02.equalsIgnoreCase("anelídeo")) {
				
				if(palavra03.equalsIgnoreCase("hematófago")) {
					
					System.out.println("[Sanguessuga]");
				}
				else if(palavra03.equalsIgnoreCase("onívoro")) {
					
					System.out.println("[Minhoca]");
				}
				else {
					System.out.println("Não encontrado! Por favor, digite uma opção válida.");
				}
			}
			else {
				System.out.println("Não encontrado! Por favor, digite uma opção válida.");
			}
		}
		else {
			System.out.println("Não encontrado! Por favor, digite uma opção válida..");
		}

	}
	
}
