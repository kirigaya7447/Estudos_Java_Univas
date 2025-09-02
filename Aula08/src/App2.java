import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = leia.nextInt();
        for(int cont = 0; cont <= 10; cont++){
            System.out.println(num + " * " + cont + " = " + (num*cont));
        }
    }
}
 