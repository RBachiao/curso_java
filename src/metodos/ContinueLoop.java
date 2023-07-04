package metodos;
import java.util.Scanner;

public class ContinueLoop {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int contadorNum = 10;
		int numero = 0;
		for (int i = 0; i < contadorNum; i ++) {
			System.out.print("Insira um número para saber se é impar: ");
			numero = entrada.nextInt();
			if (numero % 2 == 0) {
				continue;
			}
			System.out.println("Este número é impar");
		}
		entrada.close();
	}
}
