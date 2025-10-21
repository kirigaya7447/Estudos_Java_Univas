import java.util.Scanner;

/*Peça ao usuário que digite um número inteiro. Use um
loop while para contar quantos dígitos o número possui e exiba o resultado. */
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite um número: ");
        int a = scan.nextInt();
        int cont = 0;
        int contador = 0;

        while (a > 0) {
            cont = a % 10;
            contador = contador + 1;
            a = a / 10;
        }
        System.out.println("O número possui " + contador + " dígito(s).");
    }

}