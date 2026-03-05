import java.util.Scanner;
import java.util.Random;

public class Atividade03 {
    public static void main(String[] args) throws Exception {
        Scanner lendo = new Scanner(System.in);
        Random aleatorio = new Random();
        int segredo = aleatorio.nextInt(0, 10);
        String retorno;
        System.out.println(segredo + "!");

        do {
            retorno = Modulacao03.avaliarPalpite(Modulacao03.recebePalpite(lendo), segredo);
            System.out.println(retorno);
        } while (retorno != "Acertou!");
    }
}
