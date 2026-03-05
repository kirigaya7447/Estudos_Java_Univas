import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do seu saldo: ");
        double saldo = scan.nextInt();
        menu(scan, saldo);

        scan.close();
    }

    private static void menu(Scanner scan, double saldo) {
        int menu = 0;
        do {
            System.out.println("\n----Selecione a opção desejada!----" +
                    "\nValor do saldo: R$" + saldo +
                    "\nOpção 1 - Sacar" +
                    "\nOpção 2 - Depositar" +
                    "\nOpção 9 - Sair\n");
            menu = scan.nextInt();
            if (menu == 1) {
                saldo = realizaSaque(scan, saldo);
            } else if (menu == 2) {
                saldo = realizaDeposito(scan, saldo);
            } else if (menu == 9) {

            } else {
                System.out.println("\n////Opção inválida!\\\\\\\\ \n");
                menu = 0;
            }

        } while (menu != 9);
    }

    private static double realizaSaque(Scanner scan, double saldo) {
        System.out.println("Digite o valor do saque: ");
        int valorSaque = scan.nextInt();

        double novoSaldo = CaixaEletronico.sacar(saldo, valorSaque);

        if (saldo != novoSaldo) {
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Novo valor do saldo: " + novoSaldo);
        } else if (saldo == novoSaldo) {
            System.out.println("Saldo insuficiente!");
            System.out.println("Valor do saldo: " + novoSaldo);
        } else {
            System.out.println("Falha encontrada no sistema!");
        }

        return novoSaldo;
    }

    private static double realizaDeposito(Scanner scan, double saldo) {
        System.out.println("Digite o valor do depósito: ");
        int valorSaque = scan.nextInt();

        double novoSaldo = CaixaEletronico.depositar(saldo, valorSaque);

        if (saldo != novoSaldo) {
            System.out.println("Depósito realizado com sucesso!");
            System.out.println("Novo valor do saldo: " + novoSaldo);
        }

        return novoSaldo;
    }
}