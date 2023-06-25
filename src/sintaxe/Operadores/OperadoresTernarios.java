package sintaxe.operadores;

public class OperadoresTernarios {
    public static void main (String [] args) {
    
    //forma resumida para definir uma condição e escolher por um dentre dois valores

    int a, b, c;
    
    a = 5;
    b = 6;
    c = 5;

    String resultado = "";
    if (a == b)
        resultado = "Verdadeiro";
    else
        resultado = "Falso";

    System.out.println(resultado);
    
    String condicao = a == c ? "Verdadeiro" : "Falso";

    System.out.println(condicao);
    }
}
