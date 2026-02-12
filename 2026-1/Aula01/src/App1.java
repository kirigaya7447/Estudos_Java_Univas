import java.text.DecimalFormat;
import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");

        double distancia = obterDistancia(leia);

        System.out.println("Digite o preço atual do combustível:");
        double preco = leia.nextDouble();

        System.out.println("Digite a média de consumo por litro do veículo:");
        double consumo = leia.nextDouble();

        System.out.println("Digite a quantidade de pessoas no carro:");
        int pessoas = leia.nextInt();

        // System.out.println(casas.format(distancia));

        double litros = calcularLitros(preco, consumo);

        exibirRelatorio(distancia, preco, litros, pessoas);

        leia.close();
    }

    public static double obterDistancia(Scanner leia) {

        System.out.println("Digite a distância total da viagem(em KM):");
        double distancia = leia.nextDouble();

        return (distancia);

    }

    public static double calcularLitros(double preco, double consumo) {
        double litros = preco * consumo;
        return (litros);
    }

    public static void exibirRelatorio(double distancia, double preco, double litros, double pessoas) {
        System.out.println("RELATÓRIO FINAL:");
        System.out.println("A distância percorrida será de " + distancia + " | Consumo de " + litros);
        System.out.println("E o custo será de " + (distancia*preco));
    }
}
