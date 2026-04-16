package Desafio01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        Aluno a1 = new Aluno();

        System.out.println("//CADASTRO\\\\");

        System.out.println("Digite o nome do aluno: ");
        a1.nome = leia.nextLine();

        System.out.println("Digite a nota da primeira atividade: ");
        a1.atividade01 = leia.nextDouble();

        System.out.println("Digite a nota da segunda atividade: ");
        a1.atividade02 = leia.nextDouble();

        System.out.println("//MÉDIA\\\\");

        System.out.println("A média do aluno " + a1.nome + " é " + a1.mediaAluno(a1.atividade01, a1.atividade02));

        System.out.println("//APROVAÇÃO\\\\");

        if(alunoAprovado(a1.mediaAluno(a1.atividade01, a1.atividade02))){
        System.out.println("Aluno está aprovado!");
        }
        else{
        System.out.println("Aluno está reprovado!");
        }
    }

    public static boolean alunoAprovado(double media){
        if(media >= 70){
            return true;
        }
        else{
            return false;
        }
    }
}
