import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) throws Exception {
    Scanner le = new Scanner(System.in);
        
    exibirBoasVindas(le);
    }

    public static String recebeNome(Scanner le){
        System.out.print("Digite seu nome: ");
        String nome = le.nextLine();
        return nome;    
    }

    public static void exibirBoasVindas(Scanner le){
        System.out.println("Olá " + (recebeNome(le)) + ", seja muito bem-vindo ao sistema!");
    }
}
