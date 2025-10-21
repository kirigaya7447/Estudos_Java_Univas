import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite um número: ");
        String a = scan.nextLine();
        int contador = 0;
        int cont = 0;

        while (contador < a.length()) {
            int porcaria = Integer.parseInt(String.valueOf(a.charAt(contador)));
            cont = cont + porcaria;
            contador++;
        }
        System.out.println("A soma do número é: " + cont);
    }
}