import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int base = leia.nextInt();
        System.out.println("Digite o expoente: ");
        int expoente = leia.nextInt();
        System.out.println(calcularPotencia(base, expoente));
    }

    public static int calcularPotencia(int base, int expoente){
        if(expoente == 0){
            System.out.println("Teve *1");
            return 1;
        }
        return base * calcularPotencia(base, expoente - 1);
    }
}
