package Model;

import java.util.Date;

public class Bolsista extends Aluno {

    private float valorBolsa;

    public Bolsista(String nome, String idade, String registroGeral, int matricula, String curso, float valorBolsa){
        super(nome, idade, registroGeral, matricula, curso);
        this.valorBolsa = valorBolsa;
    }

    public void engatarReduzida(){
        System.out.println("Marcha reduzida acionada!");
    }


    @Override
    public void entregarTrabalho() {
        System.out.println("E obter nota bônus!");

    }

    public float getValorBolsa() {
        return valorBolsa;
    }

    public void setValorBolsa(float valorBolsa) {
        this.valorBolsa = valorBolsa;
    }
}
