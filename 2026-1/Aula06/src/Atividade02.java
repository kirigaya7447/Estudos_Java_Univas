import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) throws Exception {
        Scanner lendo = new Scanner(System.in);
        int quantidade = Modulacao02.recebeQuantidade(lendo);

        for(int cont = 1; cont <= quantidade; cont++){
            System.out.println("Digite a primeira nota do aluno " + cont);
            double n1 = lendo.nextDouble();
            System.out.println("Digite a segunda nota do aluno " + cont);
            double n2 = lendo.nextDouble();

            System.out.println("\n||||A média do aluno " + cont + " é " + Modulacao02.calcularMedia(n1, n2) + "||||\n");
        }


    }

}
