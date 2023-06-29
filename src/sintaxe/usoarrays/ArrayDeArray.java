package sintaxe.usoarrays;

public class ArrayDeArray {

	public static void main(String[] args) {
		
		//o arranjo/array será de 1 array com 2 arrays com 3 posições/elementos
		int[][] meuArrei = { { 1,2,3 }, { 4,5,6 } };
		
		// ou 
		// meuArrei = new int[2][3];
		
			System.out.print(meuArrei[1][0]);
	}
}
