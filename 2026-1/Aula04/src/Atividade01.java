import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) throws Exception {
        Scanner lendo = new Scanner(System.in);

        System.out.println("O número * 2 é" + (calcularDobro(recebeNum(lendo))));


    }

    public static int recebeNum(Scanner lendo){
        System.out.println("Digite um número: ");
        int num = lendo.nextInt();
        return num;
    }

    public static int calcularDobro(int dobro){
        dobro = dobro * 2;
        return dobro;
    }
}
