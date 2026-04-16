package Desafio01;

public class Aluno {
    public int matricula;
    public String nome;
    public double atividade01;
    public double atividade02; 

    public static double mediaAluno(double atividade01, double atividade02){
        return (atividade01 + atividade02) / 2;
    }
}
