import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner pulo = new Scanner(System.in);
        int num = 0;
        do{
            System.out.println("To cansado de apertar enter " + num + " vezes!");
            pulo.nextLine();
            num += 1;
        }while(num <= 1000);

        System.out.println("Você é idiota???????????????????????????????");
    }
}
