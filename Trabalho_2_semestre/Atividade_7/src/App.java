public class App {
    public static void main(String[] args) throws Exception {
        /*Sequência de Fibonacci: Crie um programa que use um loop for para exibir os
        primeiros 10 números da sequência de Fibonacci (onde cada número é a
        soma dos dois anteriores). A sequência começa com 0 e 1. */

        System.out.println("Fibonacci:\n");

        int num = 0;
        int num1 = 1;
        int soma = 0;

        for(int cont = 0; cont <= 10; cont++){
            System.out.println(num + " + " + num1 + " =");
            soma = num + num1;
            num = num1;
            num1 = soma;
            System.out.println(soma);
            
        }
    }
}
