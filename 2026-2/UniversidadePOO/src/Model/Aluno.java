package Model;

import java.util.Date;

public class Aluno extends Pessoa {

    private int matricula;
    private String curso;

    public Aluno(String nome, String idade, String registroGeral, int matricula, String curso){
        super(nome, idade, registroGeral);
    this.matricula = matricula;
    this.curso = curso;
    }

    public void entregarTrabalho(){
        System.out.println("Trabalho entregue!");
    }

    @Override
    public String obterDetalhes() {
        return "Nome: " + getNome()
                + "\nIdade: " + getIdade()
                + "\nMatrícula: " + matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
