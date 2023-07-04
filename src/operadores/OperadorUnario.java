package operadores;

public class OperadorUnario {

    public static void main (String [] args) {

        int numero = 5;
        System.out.println(- numero);

        System.out.println(numero);

        numero = - numero;
        System.out.println(numero);

        numero = - numero; //ou numero * -1
        System.out.println(numero);

        numero ++;
        System.out.println(numero);

        //imprimir com o incremeto de +1
        System.out.println(++ numero);

        //imprimir com o incremeto de -1
        System.out.println(-- numero);

        //negar valores booleanos
        boolean variavel = true;
        System.out.println(!variavel);

        System.out.println(variavel);

        //para o valor ser realmente falso preciso reatribuir
        variavel = !variavel;
        System.out.println(variavel);
    }
}
