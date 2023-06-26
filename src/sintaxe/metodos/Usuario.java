package sintaxe.metodos;

public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        smartTv.ligar();
        System.out.println("Novo status -> A TV está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> A TV está ligada? " + smartTv.ligada);

        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Novo volume da TV é: " + smartTv.volume);

        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Mudou para o canal: " + smartTv.canal);
    }
}
