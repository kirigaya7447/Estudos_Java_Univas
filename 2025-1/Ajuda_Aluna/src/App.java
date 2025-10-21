import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner borboleta = new Scanner(System.in);
        int joia;
        System.out.println("Digite um número: ");
        joia = borboleta.nextInt();

        if (joia >= 1) {
            System.out.println("Este número é positivo!");
        } else if (joia < 0) {
            System.out.println("Este número é negativo!");
        } else if (joia == 0) {
            System.out.println("Este número é neutro!");
        }

        System.out.println("\n___________________\n");

        System.out.println("Escreva outro número: ");
        joia = borboleta.nextInt();

        if (joia % 2 == 1) {
            System.out.println("Número é ímpar!");
        } else {
            System.out.println("Número é par!");
        }

        System.out.println("\n___________________\n");
        System.out.println("digite sua idade: ");
        joia = borboleta.nextInt();
        if (joia < 12) {
            System.out.println("Você é uma criança, cultive seus sonhos!");
        } else if (joia >= 12 && joia <= 17) {
            System.out.println("voçê e um adolescente! Aproveite os amigos e as paixões!");
        } else if (joia >= 18) {
            System.out.println("Você já é um adulto! Liberdade não é a mesma da adolescência"
                    + "e você sabe que ainda não entende seus problemas");
        }
    }

}