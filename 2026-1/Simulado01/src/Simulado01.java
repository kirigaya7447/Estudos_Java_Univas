import java.util.Scanner;

public class Simulado01 {
    public static double calcularAreaRetangulo(double base, double altura) {
        return base * altura;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Seu codigo principal
System.out.println("Digite a base do retângulo: ");
double base = sc.nextDouble();
System.out.println("Digite a altura do retângulo: ");
double altura = sc.nextDouble();
System.out.println(calcularAreaRetangulo(base, altura));
    }
}