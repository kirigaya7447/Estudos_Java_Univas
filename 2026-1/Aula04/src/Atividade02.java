import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) throws Exception {
    Scanner le = new Scanner(System.in);

        System.out.println("A área do Retângulo é: " + (calcularAreaRetangulo(recebeBase(le), recebeAltura(le))));

        
        
    }

    public static double recebeBase(Scanner le){
        System.out.println("Digite o comprimento da base:");
        double base = le.nextDouble();
        return base;
    }

    public static double recebeAltura(Scanner le){
        System.out.println("Digite a altura:");
        double altura = le.nextDouble();
        return altura;
    }

    public static double calcularAreaRetangulo(double base, double altura){
        double area = base * altura;
        return area;
    }
}
