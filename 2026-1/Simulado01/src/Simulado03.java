import java.util.Scanner;

public class Simulado03 {
    public static boolean aprovarEmprestimo(double salario, double parcela) {
        if(parcela <= (0.30 * salario)){
        return true;
        }
        else{
        return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu salário: ");
        double salario = sc.nextDouble();
        System.out.println("Digite a parcela do empréstimo: ");
        double parcela = sc.nextDouble();
        
        if(aprovarEmprestimo(salario, parcela)){
        System.out.println("Seu empréstimo foi aprovado!");
        }
        else{
        System.out.println("Seu empréstimo foi negado!");
        }
    }
}