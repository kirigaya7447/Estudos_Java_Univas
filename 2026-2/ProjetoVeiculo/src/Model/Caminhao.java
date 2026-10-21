package Model;

import java.util.Date;

public class Caminhao extends Veiculos{

    private float capacidadeCarga;

    public Caminhao(String placa, String marca, String modelo, Date anoFabricacao, float capacidadeCarga){
        super(placa, marca, modelo, anoFabricacao);
        this.capacidadeCarga = capacidadeCarga;
    }

    public void engatarReduzida(){
        System.out.println("Marcha reduzida acionada!");
    }

    public float getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(float capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
}
