package sintaxe.terminaleargumentos;

public class SobreMim {
    // para executar via terminal colocando os argumentos da minha arrays
    // comando: cd C:\Users\rodri\Desktop\Java\curso_java\bin\sintaxe\terminaleargumentos'
    // comando: java SobreMim Rodrigo Bachiao 35 1.78 (depois da classe são os parametros que 
    // meu programa aguarda de acordo com suas respectivas posições)
    // Olá me chamo 
    // Tenho 35 anos
    // Minha altura é 1,78 cm
    public static void main(String[] args) {

        // os argumentos começam com indice 0
        String nome = args [0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " cm");
    }
}
