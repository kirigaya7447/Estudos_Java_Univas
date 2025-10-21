import java.util.Scanner;

public class App3 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String senha;
        String confirmacao;

        do{
        System.out.println("Digite sua senha: ");
        senha = scan.nextLine();
        System.out.println("Confirme sua senha: ");
        confirmacao = scan.nextLine();
    }while(!senha.equals(confirmacao));
    
    System.out.println("Senha criada com sucesso!");
}

}
