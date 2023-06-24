package sintaxe.tiposevariaveis;

//variável que é uma CONSTANTE

public class TiposVariaveis {
    
    public static void main (String [] args) {

    int numero = 5;

    numero = 10;

    System.out.println(numero);

    // final garante que minha variável seja constante. E por convenção o nome deve ser em caixa alta

    final double VALOR_DE_PI = 3.14;

    System.out.println(VALOR_DE_PI);
    }
}
