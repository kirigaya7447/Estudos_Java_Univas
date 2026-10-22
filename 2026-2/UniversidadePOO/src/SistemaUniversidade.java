import Model.*;

public class SistemaUniversidade {

    public static void main(String args[]){
        //String nome, int idade, String registroGeral, int matricula, String curso
        Aluno a1 = new Aluno("Joao", 19, "22214745", 159, "Sistemas");

        //String nome, int idade, String registroGeral, double salario, String disciplina
        Professor p1 = new Professor("André", 45, "654987", 6480.00, "Sistemas");

        //String nome, int idade, String registroGeral, int matricula, String curso, double valorBolsa
        Bolsista b1 = new Bolsista("Caio", 21, "654987621", 357, "Sistemas", 1412.58);

        System.out.println("--------Apresentação Aluno------");
        System.out.println("\n" + a1.obterDetalhes());
        a1.entregarTrabalho();
        a1.identificarBiometria();

        System.out.println("\n-------Apresentação Professor------");
        System.out.println("\n" + p1.obterDetalhes());
        p1.darAula();
        p1.identificarBiometria();

        System.out.println("\n-------Apresentação Bolsista------");
        System.out.println("\n" + b1.obterDetalhes());
        b1.entregarTrabalho();
        b1.identificarBiometria();

        System.out.println("\n---------------------------------\n");
    }
}
