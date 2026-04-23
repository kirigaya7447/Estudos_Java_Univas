package Desafio01;

public class Aluno {
    public int matricula;
    public String nome;
    public double atividade01;
    public double atividade02; 

    public static double mediaAluno(Aluno aluno){
        return (aluno.atividade01 + aluno.atividade02) / 2;
    }
}
