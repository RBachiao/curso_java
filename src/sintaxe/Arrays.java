package revisao;

public class ExemploArray {

	public static void main(String[] args) {
		// tipo primitivo não tem método. Contém apenas o valor que coloquei
		// como array é sempre um objeto, ele tem métodos
		// [ ] identifica que é um array
		// meuBuque é um array [] do tipo String
		// pode ter notação String meuBuque[]
		// contrutor é um array do tipo String com tamanho de 6 posições [6]
		String[] meuBuque = new String[5];
		// meuBuque indice 0 é Rosa
		meuBuque[0] = "Rosa";
		meuBuque[1] = "Girassol";
		meuBuque[2] = "Margarida";
		meuBuque[3] = "Jasmim";
		meuBuque[4] = "Cravo";
		
		System.out.println("Meu buque na 3ª posição é: " + meuBuque[2]);
		
		// ou
		String[] meuJardim = { "Lirio", "Crisantemo", "Dama da Noite", "Tulipa", "Violeta" };
		
		System.out.println("Meu jardim na 3ª posição é: " + meuJardim[2]);
		
		int[] meusNumeros = new int[4];
		meusNumeros[0] = 1;
		meusNumeros[1] = 2;
		meusNumeros[2] = 3;
		meusNumeros[3] = 4;
		
		System.out.println("Meu número na 3ª posição é: " + meusNumeros[2]);
		
		double[] meusNum = new double[3];
		meusNum[0] = 1;
		meusNum[1] = 2;		
		
		System.out.println("Meu número na 1ª posição é " + meusNum[0] + " e na 3ª posição é " + meusNum[2]);
		
		boolean[] meusTf = new boolean[3];
		meusTf[1] = true;
		meusTf[2] = false;		
		
		System.out.println("Meu boleano na 1ª posição é " + meusTf[0] + " e na 2ª posição é " + meusTf[1] + " e na 3ª posição é " + meusTf[2]);
		
	}

}
