import java.util.Scanner;

public class Codigo_original{
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String c = leitor.nextLine();

        System.out.print("Digite o valor do produto: ");
        double v = leitor.nextDouble();

        System.out.print("Digite a quantidade: ");
        int q = leitor.nextInt();

        double t = v * q;
        double d = 0;

        if (t > 200.0) {
            d = t * 0.10;
            System.out.println("Oba! O cliente ganhou um desconto de: R$ " + d);
        } else {
            System.out.println("Poxa, sem desconto para essa compra.");
        }

        double tf = t - d;
        double imp = tf * 0.05;
        tf = tf + imp;

        System.out.println("===============================");
        System.out.println("Cliente: " + c);
        System.out.println("Total Bruto: " + t);
        System.out.println("Imposto (5%): " + imp);
        System.out.println("Total a Pagar: " + tf);
        System.out.println("===============================");

        leitor.close();
    }
}
