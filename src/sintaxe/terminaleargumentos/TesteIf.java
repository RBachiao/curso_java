package sintaxe.terminaleargumentos;
import java.util.Scanner;

public class TesteIf {
    public static void main(String[] args) {
        
        Scanner numero = new Scanner(System.in);
        int[] dados = new int[5];

        for ( int i = 0; i < dados.length; i ++ ) {
            System.out.print("Digite um número: ");
            
            dados[i] = numero.nextInt();

        }
        for ( int i = 0; i < dados.length; i ++ ) {
            System.out.print(dados[i] + " ");
        }
        System.out.println(" ");
        numero.close();

        int aux = 0;
        
        for ( int i = 0; i < dados.length; i ++ ) {

            for ( int j = i; j < dados.length; j ++ ) {
                
                if( dados[j] < dados[i] ) {
                    System.out.println("i " + i + " = " + dados[i] + " ");
                    System.out.println("j " + j + " = " + dados[j] + " ");
                    System.out.println(" ");
                    
                    aux = dados[i];
                    dados[i] = dados[j];
                    dados[j] = aux;
                } 
                else {
			        
		        }
            }
        }
        for ( int i = 0; i < dados.length; i ++ ) {
            System.out.print(dados[i] + " ");
        }
    }
}
