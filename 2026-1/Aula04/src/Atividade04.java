import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) throws Exception {
    Scanner le = new Scanner(System.in);
        System.out.println("O número é " + (recebeNum(le)));
    }

    public static String recebeNum(Scanner le){
        System.out.println("Digite o número para testar a paridade:");
        int num = le.nextInt();
        return verificarParidade(num);
    }

    public static String verificarParidade(int num){
            String paridade;
        if(num % 2 == 0){
            paridade = "Par";
        }
        else{
            paridade = "Ímpar";
        }
        return paridade;
    }
}
