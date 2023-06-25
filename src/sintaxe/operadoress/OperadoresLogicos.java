package sintaxe.operadoress;

public class OperadoresLogicos {
    public static void main (String [] args) {

        boolean condicao1 = true;

        boolean condicao2 = true;

        // && compara se as duas são true.
        if(condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }

        // || compara de uma delas é true, ou uma ou outra, por isso vai apresentar
        if(condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira");
        }
        // como 7 > 4 também é true, então, as duas são condições verdadeiras.
        if(condicao1 && ( 7 > 4 )) {
            System.out.println("As duas condições são verdadeiras");
        }
        System.out.println("Fim");
    }
}
