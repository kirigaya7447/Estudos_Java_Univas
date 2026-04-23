package Desafio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner leia = new Scanner(System.in);
        Aluno[] turma = new Aluno[5];

        System.out.println("CADASTRO DE ALUNOS\n");
        for(int cont = 0; cont < turma.length; cont++){
            turma[cont] = new Aluno();
            System.out.println("Nome do aluno " + (cont + 1) + ": ");
            turma[cont].nome = leia.nextLine();
            System.out.println("Nota do aluno " + (cont + 1) + ":");
            turma[cont].nota = leia.nextDouble();
            leia.nextLine();
        }

        System.out.println("O melhor aluno é: " + Aluno.buscarMelhorAluno(turma));
        leia.close();
    }
}
