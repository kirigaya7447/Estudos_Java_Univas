import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //ContagemEntreDoisNumeros
       
        Scanner rosas = new Scanner(System.in);

        System.out.println("Contagem Entre Dois Numeros!\n");
        System.out.print("Digite o número inicial: ");
        int numeroInicial = rosas.nextInt(); 

        System.out.print("Digite o número final: ");
        int numeroFinal = rosas.nextInt();

        if (numeroInicial <= numeroFinal) {
            System.out.println("Contagem entre " + numeroInicial + " e " + numeroFinal + ":");
            for (int i = numeroInicial; i <= numeroFinal; i++) {
                System.out.println(i); 
            }
        } else {
            
            System.out.println("O número inicial não pode ser maior que o número final.");
        }

        rosas.close();
    }
}