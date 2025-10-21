import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o ano: ");
        int ano = scan.nextInt();
        System.out.println("digite o mês: ");
        int mes = scan.nextInt();
        while (ano < 0) {
            System.out.println("digite o ano: ");
            ano = scan.nextInt();
            System.out.println("digite o mês: ");
            mes = scan.nextInt();
        }
        while (mes < 1 || mes > 12) {
            System.out.println("digite o ano: ");
            ano = scan.nextInt();
            System.out.println("digite o mês: ");
            mes = scan.nextInt();
        }
    }

}