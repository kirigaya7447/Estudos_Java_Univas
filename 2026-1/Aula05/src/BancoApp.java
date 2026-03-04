import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do seu saldo: ");
        double saldo = scan.nextInt();
        int menu = 0;
        while (menu != 9) {
            menu = menu(scan, saldo);
        }
    }

    private static int menu(Scanner scan, double saldo){
        System.out.println("Selecione a opção desejada!" +
        "\nOpção 1 - Sacar" + 
        "\nOpção 2 - Depositar"+
        "\nOpção 9 - Sair");
        int menu = scan.nextInt();
        if(menu == 1){
            realizaSaque(scan, saldo);
        }
        else if(menu == 2){
            realizaDeposito(scan, saldo);
        }
        else if(menu == 9){
            menu = menu;
        }
        else{
            System.out.println("Opção inválida!");
            menu = 0;
        }

        return menu;
    }

    private static void realizaSaque(Scanner scan, double saldo) {
        System.out.println("Digite o valor do saque: ");
        int valorSaque = scan.nextInt();

        double novoSaldo = CaixaEletronico.sacar(saldo, valorSaque);
        
        if(saldo != novoSaldo){
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Novo valor do saldo: " + novoSaldo);
        }
    }

    private static void realizaDeposito(Scanner scan, double saldo) {
        System.out.println("Digite o valor do depósito: ");
        int valorSaque = scan.nextInt();

        double novoSaldo = CaixaEletronico.depositar(saldo, valorSaque);

        if(saldo != novoSaldo){
            System.out.println("Depósito realizado com sucesso!");
            System.out.println("Novo valor do saldo: " + novoSaldo);
        }
    }
}
