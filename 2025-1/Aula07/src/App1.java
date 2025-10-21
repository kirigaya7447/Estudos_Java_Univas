import java.util.Scanner;

public class App1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num;
        int lido = 0;
        do {
            System.out.println("Digite um número maior que 0: ");
            num = scan.nextInt();
           if(num >= 0){
                lido = lido + num;
           } 
        } while (num >= 0);

        System.out.println("A soma dos números positivos é: " + lido);
    }
}
