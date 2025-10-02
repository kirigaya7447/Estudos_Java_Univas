import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner desseTamanho = new Scanner(System.in);

        int nota = 0;
        int media = 0;
        int cont = 1;

        do {
                System.out.println("Digite a nota " + cont + ": ");
                nota = desseTamanho.nextInt();
            if (nota >= 0 && nota <= 10) {

                media = nota + media;
                cont += 1;

                if (cont == 4) {
                    media = media / cont;

                }
            }
        } while (cont <= 4);

        System.out.println("Sua média final é:" + media);
    }
}