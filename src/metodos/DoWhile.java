package metodos;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
			
		Scanner entrada = new Scanner(System.in);
		int contadorNum = 0;
		int numero;
		int somaNumeros = 0;
		do {
			System.out.print("Insira um número para ser somado: ");
			numero = entrada.nextInt();
			somaNumeros += numero;
			contadorNum ++;
			
		}	while(contadorNum < 10);
		System.out.println("A soma desses " + contadorNum + " números é: " + somaNumeros);
		entrada.close();
	}
}
