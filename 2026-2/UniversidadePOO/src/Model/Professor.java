package Model;

import java.util.Date;

public class Professor extends Pessoa {
    private double salario;
    private String disciplina;

    public Professor(String nome, int idade, String registroGeral, double salario, String disciplina){
        super(nome, idade, registroGeral);
        this.salario = salario;
        this.disciplina = disciplina;
    }

    public void darAula(){
        System.out.println("Iniciando aula");
    }

    @Override
    public String obterDetalhes(){
        return "Nome: " + getNome()
                + "\nIdade: " + getIdade()
                + "\nDisciplina: " + disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
