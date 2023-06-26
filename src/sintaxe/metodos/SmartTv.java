package sintaxe.metodos;

public class SmartTv {

    //estado inicial, atributo
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //metodos que manipulam o estado
    public void ligar() {
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }
    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }
    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
    }
    public void aumentarCanal() {
        canal++;
    }
    public void diminuirrCanal() {
        canal--;
    }
    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }
}
