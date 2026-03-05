import java.util.Scanner;

public class Modulacao01 {

    public static boolean recebeNum(Scanner lendo) {
        System.out.println("Digite um número para verificar se ele é primo:");
        int num = lendo.nextInt();
        return validaPrimo(num);
    }

    public static boolean validaPrimo(int num) {
        boolean primo = true;
        for (int cont = 2; cont < num; cont++) {
            if (num % cont == 0) {
                primo = false;
            }
        }
        return primo;
    }
}
