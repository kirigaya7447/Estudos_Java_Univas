import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        String pin;

        do {
            System.out.print("Digite o PIN de 4 dígitos: ");
            pin = scanner.nextLine();

        
        

            if (!pin.equals("1234")) {
                System.out.println("PIN incorreto. Tente novamente.");
            }

        } while (!pin.equals("1234"));  // Continua pedindo enquanto o PIN não for "1234"

       
        System.out.println("PIN correto! Acesso permitido.");

        
        scanner.close();
    }
}


