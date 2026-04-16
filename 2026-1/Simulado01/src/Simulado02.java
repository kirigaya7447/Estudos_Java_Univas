import java.util.Scanner;

public class Simulado02 {
    public static int descobrirMaior(int a, int b) {
        if(a - b > 0){
            return a;
        }
        else if (a - b < 0){
            return b;
        }
        else{
        return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int b = sc.nextInt();
        System.out.println("O maior número entre " + a + " e " + b + " é " + descobrirMaior(a, b));
    }
}