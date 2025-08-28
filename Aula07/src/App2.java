import java.util.Scanner;
import java.util.Random;

public class App2 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Random aleatorio = new Random();
        int numAlea = aleatorio.nextInt(100) + 1;
        System.out.println("Digite o número sorteado: ");
        int numUser = scan.nextInt();
        int tentativas = 0;

        while(numUser != numAlea){
        tentativas += 1;
            if(numUser > numAlea){
                System.out.println("Seu número é maior do que o sorteado!");
            }
            else{
                System.out.println("Seu número é menor do que o sorteado!");
            }
            System.out.println("Tente novamente: ");
            numUser = scan.nextInt();
        }

        tentativas += 1;

        System.out.println("Acertou em " + tentativas + " tentativas!!!!");
    }
}
