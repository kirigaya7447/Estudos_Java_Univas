import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner le = new Scanner(System.in);
        System.out.println("Sequência de fibonacci de N: ");
        int n = le.nextInt();
        System.out.println("Sequência é: " + fibonacci(n) + "\n");
    }

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);

    }
}
