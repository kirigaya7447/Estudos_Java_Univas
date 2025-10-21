import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("escreva um número: ");
        String a = scan.nextLine();
        int b = 0;
        int contador = 0;

        while (b < a.length()) {
            if (a.charAt(b) % 2 == 0) {
                System.out.println(a.charAt(b));
                contador++;
            }
            b++;
        }
        System.out.println("os números pares são: " + contador);
    }
}