import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Série Harmônica: Calcule a soma da série harmônica H(n)=1+1/2+1/3+1/4+⋯+1/n.
        Peça ao usuário para digitar o valor de n e use um loop for para calcular e exibir a
        soma. */
        Scanner leia = new Scanner(System.in);
        System.out.println("Série harmônica:\n");

        System.out.println("Digite um número: ");
        double n = leia.nextDouble();
        double soma = 1;

        for(double cont = 1; cont <= n; cont++){
            soma = soma + 1/cont;
        }

        System.out.println("A soma da séria harmônica é: " + soma);
        
    }
}
