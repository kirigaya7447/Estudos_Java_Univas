import java.util.Scanner;

public class Codigo_refatorado {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        // INICIAR VARIÁVEIS BASE://
        String cliente = recebeCliente(leitor);
        double valorProduto = recebeValorProduto(leitor);
        int quantidadeProduto = recebeQuantidadeProduto(leitor);

        // CÁLCULOS://
        double valorTotal = valorProduto * quantidadeProduto;
        double desconto = calculaDesconto(valorTotal);

        exibeDesconto(desconto);

        double valorFinal = valorTotal - desconto;
        double valorImposto = valorFinal * 0.05;
        valorFinal = defineValorFinalComImposto(valorFinal, valorImposto);

        resultadoFinal(cliente, valorTotal, valorImposto, valorFinal);

        leitor.close();
    }

    public static String recebeCliente(Scanner leitor) {
        System.out.print("Digite o nome do cliente: ");
        String cliente = leitor.nextLine();
        return cliente;
    }

    public static double recebeValorProduto(Scanner leitor) {
        System.out.print("Digite o valor do produto: ");
        double valorProduto = leitor.nextDouble();
        return valorProduto;
    }

    public static int recebeQuantidadeProduto(Scanner leitor) {
        System.out.print("Digite a quantidade: ");
        int quantidadeProduto = leitor.nextInt();
        return quantidadeProduto;
    }

    public static double calculaDesconto(double valorTotal) {
        double desconto = 0;
        if (valorTotal > 200.0) {
            desconto = valorTotal * 0.10;
            return desconto;
        } else {
            desconto = 0;
            return desconto;
        }
    }

    public static void exibeDesconto(double desconto) {
        if (desconto > 0) {
            System.out.println("Oba! O cliente ganhou um desconto de: R$ " + desconto);
        } else {
            System.out.println("Poxa, sem desconto para essa compra.");
        }
    }

    public static double defineValorFinalComImposto(double valorFinal, double valorImposto) {
        valorFinal = valorFinal + valorImposto;
        return valorFinal;
    }

    public static void resultadoFinal(String cliente, double valorTotal, double valorImposto, double valorFinal) {
        System.out.println("===============================");
        System.out.println("Cliente: " + cliente);
        System.out.println("Total Bruto: " + valorTotal);
        System.out.println("Imposto (5%): " + valorImposto);
        System.out.println("Total a Pagar: " + valorFinal);
        System.out.println("===============================");
    }
}
