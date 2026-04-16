import java.util.Scanner;

public class Simulado05 {
    public static int calcularPotencia(int base, int expoente) {
        if(expoente == 0){
            return 1;
        }
        else if(expoente == 1){
        return base;
        }
        
        return base * calcularPotencia(base, expoente - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Leia base e expoente (nesta ordem) e chame a funcao
        System.out.println("Digite a base: ");
        int base = sc.nextInt();
        System.out.println("Digite o expoente: ");
        int expoente = sc.nextInt();
        
        System.out.println("potência de " + base + " elevado a " + expoente + " é " + calcularPotencia(base, expoente));
    }
}