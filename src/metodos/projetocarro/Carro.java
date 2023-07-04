package metodos.projetocarro;

public class Carro {

    //atributo. Estado inicial, como carro vem de fábrica
    String cor = "Branco";
    String modelo = "Gol 1.0";
    int capacidadeTanque = 65;
    double totalValorTanque = 0;
    
    //metodos que manipulam o estado
    public void mudarCor() {
        cor = "Preto";
    }
    public void mudarModelo() {
        modelo = "Gol 1.6";
    }
    public void mudarCapacidadeTanque() {
        capacidadeTanque = 70;
    }
    public void custoCombustivelTanque (double valorCombustivel) {
        totalValorTanque = (capacidadeTanque * valorCombustivel);
    }
}
