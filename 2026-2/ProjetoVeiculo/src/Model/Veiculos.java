package Model;

import java.util.Date;

public abstract class Veiculos {
    private String placa;
    private String marca;
    private String modelo;
    private Date anoFabricacao;

    public Veiculos(String placa, String marca,
    String modelo,
    Date anoFabricacao){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public void agendarServico(){
        System.out.println("Veículo " + modelo + " - Placa " + placa + " - Agendado para manutenção");
    }

    public final void frear(){
        System.out.println("Freios acionados!");
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Date anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}
