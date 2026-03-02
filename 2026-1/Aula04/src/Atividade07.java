import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) throws Exception {
    Scanner le = new Scanner(System.in);
        double salario = recebeSalario(le);
        double parcela = recebeParcela(le);
        if(aprovarEmprestimo()){
            System.out.println("Empréstimo aprovado!");
        }
        else{
            System.out.println("Empréstimo negado!");
        }
    }

    public static double recebeSalario(Scanner le){
        System.out.println("Digite o valor do seu salário:")
        double salario = le.nextDouble();
        return salario;
    }

    public static double recebeParcela(Scanner le){
        System.out.println("Digite o valor da parcela a ser verificada:")
        double parcela = le.nextDouble();
        return parcela;
    }

    public static boolean aprovarEmprestimo(double salarioCliente, double parcelaEmprestimo){
        boolean aprovado;
        double porcentagem = (salario * 30) / 100;
        if(parcelaEmprestimo > porcentagem){
            aprovado = false;
        }
        else{
            aprovado = true;
        }
    }
    return aprovado;
}
