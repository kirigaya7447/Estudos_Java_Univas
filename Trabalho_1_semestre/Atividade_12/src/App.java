import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Número Perfeito: Crie um programa que verifique se um número é "perfeito". Um
        número perfeito é aquele cuja soma de seus divisores (excluindo ele mesmo) é igual
        ao próprio número. Use um loop for para encontrar os divisores e somá-los.
        Exemplo: 6 é perfeito, pois seus divisores são 1, 2 e 3, e 1 + 2 + 3 = 6. */

        Scanner leia = new Scanner(System.in);
        System.out.println("Número perfeito:\n");

        System.out.println("Digite um número: ");
        int num = leia.nextInt();
    }
}
