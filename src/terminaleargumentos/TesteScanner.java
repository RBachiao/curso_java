package terminaleargumentos;

import java.util.Locale;
import java.util.Scanner;

public class TesteScanner {
    public static void main(String[] args) {

        // criando um objeto Scanner
        Scanner dados = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu nome: ");
        String nome = dados.next();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = dados.next();

        System.out.print("Digite sua idade: ");
        int idade = dados.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = dados.nextDouble();

        // imprimindo os dados
        System.out.println("Olá me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " cm");
        dados.close();
    }
}
