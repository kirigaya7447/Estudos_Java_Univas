import java.util.Scanner;

public class App2 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite números maiores que 0, quando um negativo for " +
        "digitado, a soma será feita e o resultado exibido!");

        int num = 0;
        int soma = 0;

        while(num >= 0){
            soma = soma + num;
            System.out.println("Digite um número: ");
            num = scan.nextInt();
        }
        System.out.println("O resultado final é: " + soma);
    }
}
