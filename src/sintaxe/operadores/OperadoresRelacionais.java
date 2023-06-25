package sintaxe.operadores;

public class OperadoresRelacionais {
    public static void main (String [] args) {
    
    int d, e, f;
    d = 1;
    e = 2;
    f = 1;

    boolean simNao = d == e;
    System.out.println("d = 1 é igual a e = 2? " + simNao);

    simNao = d != e;
    System.out.println("d = 1 é diferente de e = 2? " + simNao);

    simNao = d == f;
    System.out.println("d = 1 é igual a f = 1? " + simNao);

    //quando duas strings iguais, nomeUm e nomeDois são criadas ao mesmo tempo, 
    //elas ocupam o mesmo espaço na memória, por isso, será true, já que == compara
    //espaços na memória quando é Strings
    String nomeUm = "Rodrigo";
    String nomeDois = "Rodrigo";
    System.out.println(nomeUm == nomeDois);

    //nesse caso o valor das Strings são iguais, mas como nomeTres foi criada depois
    //ela ocupa um espaço na memória diferente de nomeUm, por isso, a comparação será false.
    String nomeTres = new String("Rodrigo");
    System.out.println(nomeUm == nomeTres);

    //equals compara os valores/conteúdos das Strings. Nesse caso a comparação será true.
    System.out.println(nomeUm.equals(nomeTres));

    }
}
