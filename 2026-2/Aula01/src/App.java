import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        //ENTRADA DE DADOS

        System.out.println("Digite a distância total da viagem(em KM):");
        double distancia = leia.nextDouble();

        System.out.println("Digite o preço atual do combustível:");
        double preco = leia.nextDouble();

        System.out.println("Digite a média de consumo por litro do veículo:");
        double consumo = leia.nextDouble();

        System.out.println("Digite a quantidade de pessoas no carro:");
        int pessoas = leia.nextInt();

        //PROCESSAMENTO DE DADOS

        double totalDistancia = distancia / consumo;
        double custoTotal = totalDistancia * preco;
        double custoPessoas = custoTotal / pessoas;

        //SAÍDA

        System.out.println("Distância total: " + totalDistancia);
        System.out.println("Custo total da viagem: " + custoTotal);
        System.out.println("Custo toal por pessoas: " + custoPessoas);
    }
}
