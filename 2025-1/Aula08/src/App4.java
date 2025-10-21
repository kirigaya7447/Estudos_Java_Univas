import java.util.Scanner;

public class App4 {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite uma base: ");
        int bas = leia.nextInt();
         int num = bas;
        System.out.println("Agora digite um expoente: ");
        int exp = leia.nextInt();
        for(int cont = 1; cont < exp; cont++){
            num = num * bas;
        }
            System.out.println(bas + " ^ " + exp + " = " + num);
    }
}
 