package Model;

import java.util.Date;

public abstract class Pessoa {
    private String nome;
    private String idade;
    private String registroGeral;

    public Pessoa(String nome, String idade, String registroGeral){
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

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getModelo() {
        return registroGeral;
    }

    public void setModelo(String registroGeral) {
        this.registroGeral = registroGeral;
    }
}
