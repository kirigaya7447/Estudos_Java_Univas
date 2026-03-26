import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        System.out.println("Olá, seja bem vindo ao site da loja!");
        System.out.println("Digite o valor da compra: ");
        double valorCompra = leia.nextDouble();
        System.out.println("Digite agora o seu tipo de cliente:" + 
                            "\n1 - Comum" +
                            "\n2 - VIP" +
                            "\n3 - Funcionário");
        int tipoCliente = leia.nextInt();

        System.out.println("////RECIBO////" +
                          "\nPara o tipo de cliente " + tipoCliente +
                            "\nO seu valor é de " + calcularValorFinal(valorCompra, tipoCliente));
    }

    public static double calcularValorFinal(double valorCompra, int tipoCliente){
        if(tipoCliente == 1){
            return valorCompra;
        }
        else if(tipoCliente == 2){
            if(valorCompra > 500){
            return valorCompra - (valorCompra * 0.1);}
            return valorCompra;
        }
        else if(tipoCliente == 3){
            return valorCompra - (valorCompra * 0.2);
        }
        else{
            return valorCompra;
        }
    }
}
