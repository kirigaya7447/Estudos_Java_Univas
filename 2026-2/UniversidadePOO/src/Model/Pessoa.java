package Model;

import java.util.Date;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String registroGeral;

    public Pessoa(String nome, int idade, String registroGeral){
        this.nome = nome;
        this.idade = idade;
        this.registroGeral = registroGeral;
    }

    public abstract String obterDetalhes();

    public final void identificarBiometria(){
        System.out.println("Validação de biometria em andamento!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getModelo() {
        return registroGeral;
    }

    public void setModelo(String registroGeral) {
        this.registroGeral = registroGeral;
    }
}
