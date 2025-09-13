import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
    Scanner scanner = new Scanner(System.in);
    String usuario;
    do {
    System.out.print("Digite seu nome de usuário: ");
    usuario = scanner.nextLine();
    
    if (usuario.isEmpty()) {
    System.out.println("O nome de usuário não pode ser vazio. Tente novamente.");
            }
    } while (usuario.isEmpty());

    System.out.println("Nome de usuário registrado: " + usuario);

   
    }
}
