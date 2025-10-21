import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        System.out.println("digite números para soma: ");
        int num = scan.nextInt();
        int soma = 0;

        while (num <= 100) {
            System.out.println("digite números para soma: ");
            soma = scan.nextInt();
            num = num + soma;
            System.out.println("a soma é: " + num + " e o último número digitado, é: " + soma);
        }
        System.out.println("a soma é: " + num);
    }
}