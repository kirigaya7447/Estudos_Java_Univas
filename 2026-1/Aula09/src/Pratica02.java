import java.util.Scanner;
public class Pratica02 {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int num = leia.nextInt();
        System.out.println(somaDigitos(num));
    }

    public static int somaDigitos(int num){
        if(num == 0){
            return 0;
        }
        System.out.println("O num: " + (num));
        System.out.println("Último: " + (num % 10));
        System.out.println("Primeiros: " + (num / 10));
        return num % 10 + somaDigitos(num / 10);
    }
}
