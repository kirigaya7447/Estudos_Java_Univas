import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("----Calculadora----");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");
            System.out.println("Digite algum dos números: ");
            escolha = scanner.nextInt();

            System.out.println("digite o primeiro número: ");
            double a = scanner.nextDouble();
            System.out.println("digite o segundo número: ");
            double b = scanner.nextDouble();

            if (escolha == 1) {
                System.out.println(Calculadora.soma(a, b));
            } else if (escolha == 2) {
                System.out.println(Calculadora.subtracao(a, b));
            } else if (escolha == 3) {
                System.out.println(Calculadora.multiplicacao(a, b));
            } else if (escolha == 4) {
                System.out.println(Calculadora.divisao(a, b));
            }
        } while (1 <= escolha && escolha < 4);
    }
}
