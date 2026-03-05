import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) throws Exception {
        Scanner lendo = new Scanner(System.in);
        if(Modulacao01.recebeNum(lendo)){
            System.out.println("Seu número é primo!");
        }
        else{
            System.out.println("Seu número não é primo!");
        }
    }
}
