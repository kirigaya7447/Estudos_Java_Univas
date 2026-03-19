import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner le = new Scanner(System.in);
        System.out.println("Sequência de fibonacci de N: ");
        int n = le.nextInt();
        System.out.println("Sequência é:" + fibonacci(n)+ "\n");
    }

    public static String fibonacci(int n) {
        if (n == 0) {
            return "0";
        } else if (n == 1) {
            return "1";
        } else if (n >= 2) {
            return (fibonacci(n - 1) + fibonacci(n - 2));
        } else {
            return "Erro!";
        }

    }
}
