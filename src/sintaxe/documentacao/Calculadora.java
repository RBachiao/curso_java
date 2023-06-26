package sintaxe.documentacao;

/**
* <h1>Calculadora</h1>
* A Calculadora realiza operações de soma ou multiplicação entre números inteiros
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Rodrigo Bachião
* @version 1.0
* @since   26/06/2023
*/
public class Calculadora {
    /**
    * Este método é utilizado para somar ou multiplicar dois números inteiros
    * @param calculo este é o primeiro parâmetro do método
    * @param numeroUm este é o segundo parâmetro do método
    * @param numeroDois este é o terceiro parâmetro do método
    * @return int o resultado do método sendo uma soma ou multiplicação dos dois números.
    */    

public int somaMultiplicacao (int numeroUm, int numeroDois, String calculo) {
    
    int resultado = 0;
    
    if ( calculo == "M") {
        resultado = numeroUm * numeroDois;
    
    }else {
        resultado = numeroUm + numeroDois;
    }
    return resultado;
    }
} 
