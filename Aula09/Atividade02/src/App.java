import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner bebado = new Scanner(System.in);

        int limite = 0;
        int inicial = 0;

        System.out.println("Digite um número inicial da progressão: ");
        inicial = bebado.nextInt();
        System.out.println("Digite um limite para a progressão: ");
        limite = bebado.nextInt();

        for(int cont = inicial; cont <= limite; cont *= 2){
            System.out.println(cont);
        }
    }
}
