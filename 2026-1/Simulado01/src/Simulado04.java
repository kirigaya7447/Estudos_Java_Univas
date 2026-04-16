import java.util.Scanner;

public class Simulado04 {
    public static double calcularINSS(double salarioBruto) {
        if(salarioBruto <= 2000){
        return salarioBruto - (salarioBruto * 0.08);
    }
    else if(salarioBruto > 2000){
        return salarioBruto - (salarioBruto * 0.11);
    }
    else{
        return salarioBruto;
    }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do seu salário bruto: ");
        double salario = sc.nextDouble();
        System.out.println("O valor do seu salário com desconto é " + calcularINSS(salario));
    }
}