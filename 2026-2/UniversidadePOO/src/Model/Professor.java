package Model;

import java.util.Date;

public class Professor extends Pessoa {
    private float salario;
    private String disciplina;

    public Professor(String nome, String idade, String registroGeral, float salario, String disciplina){
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

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
