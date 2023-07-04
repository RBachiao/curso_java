package metodos;

import java.util.Scanner;

public class ForExemplo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int contadorNum = 10;
		int numero;
		int somaNumeros = 0;
		for (int i = 0; i < contadorNum; i ++) {
			System.out.print("Insira o " + (i + 1) + "º número para ser somado: ");
			numero = entrada.nextInt();
			somaNumeros += numero;
		}
		System.out.print("A soma de " + contadorNum + " números e " + somaNumeros);
		entrada.close();
	}
}
