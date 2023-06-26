package sintaxe.metodos.projetocarro;

public class PersonalizarCarro {
    public static void main(String[] args) throws Exception {

    Carro carro = new Carro();

        System.out.println("Qual a cor do carro? " + carro.cor);
        System.out.println("Qual o modelo do carro? " + carro.modelo);
        System.out.println("Qual a capacidade do tanque do carro? " + carro.capacidadeTanque);

        carro.mudarCor();
        System.out.println("Qual a nova cor do carro? " + carro.cor);

        carro.mudarModelo();
        System.out.println("Qual o novo modelo do carro? " + carro.modelo);

        carro.mudarCapacidadeTanque();
        System.out.println("Qual a nova capacidade do tanque do carro? " + carro.capacidadeTanque);

        carro.custoCombustivelTanque(4.99);
        System.out.println("O custo para encher o tanque é de R$ " + carro.totalValorTanque);
    }
}
