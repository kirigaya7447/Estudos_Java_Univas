import java.util.Scanner;

public class Modulacao02 {

    public static int recebeQuantidade(Scanner lendo) {
        System.out.println("Digite a quantidade de alunos na turma: ");
        int quantidadeAlunos = lendo.nextInt();
        return quantidadeAlunos;
    }

    public static double calcularMedia(double n1, double n2) {
        return ((n1 + n2) / 2);
    }
}
