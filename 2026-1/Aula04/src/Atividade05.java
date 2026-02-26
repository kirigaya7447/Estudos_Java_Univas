import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) throws Exception {
    Scanner le = new Scanner(System.in);
    System.out.println("O maior número é o " + receberNums(le));
    }

    public static String receberNums(Scanner le){
        System.out.println("Digite o primeiro número: ");
        int a = le.nextInt();
        System.out.println("Digite o próximo número:");
        int b = le.nextInt();

        int maior = descobrirMaior(a, b);
        if(maior - a == b){
        return ("nenhum, pois são iguais!");
        }
        else{
            return String.valueOf(maior);
        }
    }

    public static int descobrirMaior(int a, int b){
        int maior;
        if(a > b){
            maior = a;
        }
        else if(a < b){
            maior = b;
        }
        else{
            maior = a + b;
        }
        return maior;
    }
}
