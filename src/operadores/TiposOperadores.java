package operadores;

public class TiposOperadores {
    public static void main (String [] args) {
    
    // operador de atribuição é o =
    // char só permite um caracter entre aspas simples
    char sexo = 'M';

    System.out.println(sexo);

    // o operador de adição pode ser usado para fazer a concatenação de uma String

    String nomeCompleto = "LINGUAGEM " + " JAVA";

    System.out.println(nomeCompleto);

    String concatenacao = "";

    //enquanto o próximo valor for numerérico, + funciona como operador de atribuição soma
    //quando passa a ser texto funciona como concatenação, resultandoo em 31

    concatenacao = 1+1+1+"1";
    System.out.println(concatenacao);

    //quando passa a ser texto funciona como concatenação o restante do processo, 
    //deixa de realizar operação de soma, resultando em "1111"
    concatenacao = 1+"1"+1+"1";
    System.out.println(concatenacao);

    concatenacao = "1"+1+1+1;
    System.out.println(concatenacao);

    //nesse caso tenho aspecto/expressão de evidência,
    //primeiro realiza a operação de soma e depois realiza a concatenação, resultando em "13"
    concatenacao = "1"+(1+1+1);
    System.out.println(concatenacao);
    }
}
