package sintaxe.usoarrays;

public class ArrayForEach {

	public static void main(String[] args) {
		// tudoPar é um array, nesse caso um conjunto de inteiros
		int[] tudoPar = new int[5];
		
		for ( int i = 0; i < tudoPar.length; i ++ ) {

			tudoPar[i] = 2;
		}
		int cont = 0;
		// para cada elemento de tudoPar faça valor receber esse elemento e, nesse caso, imprima o valor do elemento
		// valor recebe o elemento de cada posição cada vez que roda o for
		for ( int valor : tudoPar ) {
			
			if(cont < ( tudoPar.length - 1)) {
				cont ++;
				System.out.print(valor + " - ");
			}
			else {
				System.out.print(valor);
			}
		}
	}
}
