package Model;

import java.util.Date;

public class Motocicleta extends Veiculos{
    private float cilindrada;

    public Motocicleta(String placa, String marca, String modelo, Date anoFabricacao, float cilindrada){
        super(placa, marca, modelo, anoFabricacao);
        this.cilindrada = cilindrada;
    }

    public void darPartidaPedal(){
        System.out.println("Pedal");
        System.out.println("Pedal...");
        System.out.println("Pedal..........");
        System.out.println("Pedalll......");
        System.out.println("Ligado!");
    }

    public float getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }
}
