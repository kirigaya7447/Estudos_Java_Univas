package Model;

import java.util.Date;

public class Carro extends Veiculos{

    private int numPortas;

    public Carro(String placa, String marca, String modelo, Date anoFabricacao, int numPortas){
        super(placa, marca, modelo, anoFabricacao);
    this.numPortas = numPortas;
    }

    public void ligarArCondicionado(){
        System.out.println("Ar condicionado ligado!");
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
}
