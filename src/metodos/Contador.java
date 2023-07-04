package metodos;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int contadorNum = 0;
		int numero;
		int somaNumeros = 0;
		System.out.println("Digite 10 números para serem somados.");
		
		while (contadorNum < 10) {
			System.out.print("Digite o " + (contadorNum + 1) + "º número: ");
			numero = entrada.nextInt();
			somaNumeros += numero;
			contadorNum ++;
		}
		System.out.println("A soma desses " + contadorNum + " números é: " + somaNumeros);
		entrada.close();
	}

}
