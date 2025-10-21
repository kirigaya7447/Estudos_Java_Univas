import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Soma de Quadrados Pares: Peça ao usuário para digitar um número inteiro n. Use
        um loop for para somar os quadrados de todos os números pares de 1 a n e exiba o
        resultado. */

        Scanner naoCopiem = new Scanner(System.in);
        System.out.println("Quadrados pares");

        System.out.println("Digite um número: ");
        int num = naoCopiem.nextInt();

        int quadrado;
        int quadradoSoma = 0;

        for(int cont = 1; cont <= num; cont++){
            if(cont % 2 == 0){
                quadrado = cont * cont;
                quadradoSoma += quadrado;
            }
        }
        System.out.println("A soma de todos os quadrados pares até " + num + " é " + quadradoSoma);
    }
}
