package Desafio02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        Produto[] produto = new Produto[4];
        
        for(int cont = 0; cont < produto.length; cont++){
            produto[cont] = new Produto();
            System.out.println("Digite o nome do produto " + (cont + 1) + " :");
            produto[cont].nome = leia.nextLine();
            System.out.println("Digite o valor do preço " + (cont + 1) + " :");
            produto[cont].preco = leia.nextDouble();
            leia.nextLine();
        }
        
            System.out.println("Digite a taxa de inflação (Ex: 20, 30): ");
            double inflacao = leia.nextDouble();

            Produto.aplicarInflacao(produto, inflacao);

            for(int cont = 0; cont < produto.length; cont++){
                System.out.println("O produto " + produto[cont].nome + " foi reajustado para " + produto[cont].preco);
            }

            leia.close();
    }
}
