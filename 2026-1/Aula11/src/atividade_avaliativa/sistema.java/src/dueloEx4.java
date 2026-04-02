import java.util.Scanner;

public class dueloEx4 {
    public static int somarImparesIterativo(int n) {
        int soma = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                soma = i + soma;
            }
        }
        return soma;
    }

    public static int somarImparesRecursivo(int n) {
        if (n <= 0) {
            return 0;
        }

        if (n % 2 != 0) {
            return n + somarImparesRecursivo(n - 1);
        } else {
            return somarImparesRecursivo(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = scanner.nextInt();

        System.out.println("Iterativo: " + somarImparesIterativo(n) + " Recursivo: " + somarImparesRecursivo(n));
    }
}
