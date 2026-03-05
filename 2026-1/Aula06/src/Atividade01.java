import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) throws Exception {
        Scanner lendo = new Scanner(System.in);
        recebeNum(lendo);
    }

    private static int recebeNum(Scanner lendo) {
        System.out.println("Digite um número para verificar se ele é primo:");
        int num = lendo.nextInt();
        return (boolean primo = Modulacao01.validaPrimo());
    }
}
