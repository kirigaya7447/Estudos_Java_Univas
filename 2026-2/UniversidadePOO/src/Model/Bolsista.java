package Model;

import java.util.Date;

public class Bolsista extends Aluno {

    private double valorBolsa;

    public Bolsista(String nome, int idade, String registroGeral, int matricula, String curso, double valorBolsa){
        super(nome, idade, registroGeral, matricula, curso);
        this.valorBolsa = valorBolsa;
    }

    @Override
    public void entregarTrabalho() {
        System.out.println("Trabalho entregue!");
        System.out.println("E obter nota bônus!");

    }

    @Override
    public String obterDetalhes(){
        return "Nome: " + getNome()
                + "\nIdade: " + getIdade()
                + "\nValor da Bolsa: " + valorBolsa;
    }

    public double getValorBolsa() {
        return valorBolsa;
    }

    public void setValorBolsa(double valorBolsa) {
        this.valorBolsa = valorBolsa;
    }
}
