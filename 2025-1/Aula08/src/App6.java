import java.util.Scanner;

public class App6 {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        int num, fat = 1;
        System.out.println("Digite um número, por favor: ");
        num = leia.nextInt();

        if (num == 0) {
            fat = 1;
        } else {
            for (int cont = 1; cont <= num; cont++) {
                fat = fat * cont;
            }
        }
        System.out.println("Fatorial: " + fat);
    }
}
