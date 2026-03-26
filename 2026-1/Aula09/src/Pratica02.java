import java.util.Scanner;
public class Pratica02 {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int base = leia.nextInt();
        System.out.println("Digite o expoente: ");
        int expoente = leia.nextInt();
        System.out.println(calcularPotencia(base, expoente));
    }

    public static int somaDigitos(int num){
        if(num == 0){
            return 0;
        }
        int ultDigito = 
        return somaDigitos(num / 10) + somaDigitos(num % 10);
    }
}
