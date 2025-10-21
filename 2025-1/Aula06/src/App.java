import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número maior que 0: ");
        int num = scan.nextInt();
        while(num >= 0){
            System.out.println(num);
            num--;
        }
        System.out.println("Lançamento!!!!");
    }
}
