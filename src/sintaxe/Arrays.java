package revisao;

public class ExemploArray {

	public static void main(String[] args) {
		// array de tipo primitivo não tem método. Contém apenas o valor que coloquei
		// o array é sempre um objeto]
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
		
		System.out.println("Meu buque na posição 2 é: " + meuBuque[2]);
		
		// ou
		String[] meuJardim = { "Lirio", "Crisantemo", "Dama da Noite", "Tulipa", "Violeta" };
		
		System.out.println("Meu jardim na posição 2 é: " + meuJardim[2]);
		

	}

}
