package sintaxe.classe;
public class MinhaClasse {

// void que não vai me retornar nada, só vai executar. 
// Método main, parâmetro String, o array que é args e o corpo {}.

public static void main (String [] args) {

    String primeiroNome = "Rodrigo";

    String segundoNome = "Bachião";

    //variável que é a chamada de um método, nomeCompleto, que exige duas variáveis. Método exige parâmetros

    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

    String anoNascimento = "1988";

    String idade = "35";

    anoNascimento = "2000";

    String dados = dados ( anoNascimento, idade);

    System.out.println( nomeCompleto);

    System.out.println( dados);
}    

//Método nomeCompleto que recebe dois parâmetros primeiroNome e segundoNome.

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do método NomeCompleto " + primeiroNome.concat(" ").concat(segundoNome);

}

public static String dados (String anoNascimento, String idade) {
    return "Resultado do método dados Nasceu em " + anoNascimento + " e tem " + idade + " anos";
}

}

    
}
