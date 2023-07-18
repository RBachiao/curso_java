package usoarrays;

import java.util.Scanner;

public class ArrayDeArray {

	public static void main(String[] args) {

		//o arranjo/array será de 1 array com 3 arrays com 2 posições/elementos
		//3 linhas e 2 colunas
		Scanner entrada = new Scanner(System.in);
		
		int[][] meuArrei = new int[3][2];
		
		// ou 
		// meuArrei = new int[3][2];
		
		for (int i = 0; i < meuArrei.length; i++) {
			
			for (int j = 0; j < meuArrei[i].length; j++) {
				
				System.out.println("Entre com um valor para a " +  (i+1) + "ª linha e " +
						(j+1) + "ª coluna: ");
				
				meuArrei[i][j] = entrada.nextInt();
			}
		} entrada.close();

		for (int i = 0; i < meuArrei.length; i++) {
			
			for (int j = 0; j < meuArrei[i].length; j++) {
				
				System.out.print(meuArrei[i][j] + " ");
			}
			System.out.println();
		}
	}
}
