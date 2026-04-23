package Desafio01;

public class Aluno {
    public String nome;
    public int sala;
    public double nota;

    
    public static String buscarMelhorAluno(Aluno[] sala){
        String melhorAluno = "";
        double melhorNota = 0;
        for(int cont = 0; cont < sala.length; cont++){
            if(sala[cont].nota > melhorNota){
                melhorAluno = sala[cont].nome;
                melhorNota = sala[cont].nota;
            }
        }
        return melhorAluno;
    }
}
