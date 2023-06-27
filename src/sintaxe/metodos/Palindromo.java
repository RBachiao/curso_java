package sintaxe.metodos;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		// A classe Scanner tem como objetivo separar a entrada dos textos em blocos
		// O objeto System.in é o que faz a leitura do que se escreve no teclado.
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com uma palavra: ");
		//Principais métodos da classe
		//nextTipoDado() é a chamada do método para retornar o valor especificado na entrada de dados
		//next(): localiza e retorna a informação seguinte deste objeto Scanner.
		//close(): fecha o Scanner.
		//nextLine(): avança para a próxima linha, mostrando também qual é a atual.
		//nextInt(): faz a verificação do token de entrada seguinte como um int.
		//nextFloat(): aponta o próximo símbolo de entrada como flutuação.
		//Radix(): faz retornar o índice atual deste objeto Scanner.
		
		String palavra = entrada.next();
		int primeiraPosicao = 0;
		int ultimaPosicao = palavra.length() -1;
		boolean ehPalindromo = true;
		
		while (primeiraPosicao < ultimaPosicao) {
			// charAt método da classe String que pede a posicao do caracter
			if(palavra.charAt(primeiraPosicao) != palavra.charAt(ultimaPosicao)) {
				ehPalindromo = false;
				break;
			}
			primeiraPosicao ++;
			ultimaPosicao --;
		}
		if(ehPalindromo) {
			System.out.println("E um palindromo");
		}
		else {
			System.out.println("Não e um palindromo");
		}

	}

}
