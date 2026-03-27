import java.util.Scanner;
public class Atividade05 {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número para contar os dígitos: ");
        int num = leia.nextInt();
        System.out.println(contarDigitos(num));
    }

    public static int contarDigitos(int num){
        if(num < 1){
            return 0;
        }
        return num / 10 + contarDigitos((num % 10));
    }
}
