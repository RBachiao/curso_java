package usoarrays;

public class ArrayForIf {

	public static void main(String[] args) {
		// tudoPar é um array, nesse caso um conjunto de inteiros
		int[] tudoPar = new int[5];
		
		// length é uma variável de um objeto, nesse caso do tudoPar que é um array/objeto
		for ( int i = 0; i < tudoPar.length; i ++ ) {
		
			if(i < ( tudoPar.length - 1)) {
				//tudoPar indice i = 2
				tudoPar[i] = 2;
				System.out.print(tudoPar[i] + " - ");
			}
			else {
				tudoPar[i] = 2;
				System.out.print(tudoPar[i]);
			}
		}
	}
}
