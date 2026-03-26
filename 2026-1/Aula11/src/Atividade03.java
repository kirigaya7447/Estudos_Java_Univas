import java.util.Scanner;
public class Atividade03 {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int num = leia.nextInt();
        System.out.println("Digite a quantidade de vezes a ser multiplicado: ");
        int mult = leia.nextInt();
        System.out.println(multiplicarRecursivo(num, mult));
    }
    public static double multiplicarRecursivo(int a, int b){
        if(b < 1){
            return 0;
        }
        return a + multiplicarRecursivo(a, b - 1);
    }
}