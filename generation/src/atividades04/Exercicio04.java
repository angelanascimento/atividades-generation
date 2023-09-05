package atividades04;

import java.util.Scanner;

public class Exercicio04 {

	
	public static void main(String[] args) {
		
		float nota[][] = new float[2][4];
		float medias[] = new float[2];
		Scanner entrada = new Scanner(System.in);
		
		for(int ii = 0; ii < 2; ii++) {
			
			for(int i = 0; i < 4; i++) {
			
			System.out.printf("Digite a nota do %d º aluno refrente ao %d bimentre: ", ii + 1, i + 1 );	
			nota[ii][i] = entrada.nextFloat();
			
			medias[ii]  = medias[ii] +  nota[ii][i];
			}
		}
		
		/*for(int c = 0; c < medias.length; c++) {
			System.out.print(medias[c]);
		}*/
		
		System.out.println("==================================================================");
		
		for(float resultado : medias) {
			System.out.printf(" | %.1f", resultado / 4);
		}
			
	}
}
