import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*MDC (Máximo Divisor Comum): Use um loop while para calcular o Máximo Divisor
        Comum de dois números inteiros digitados pelo usuário, utilizando o algoritmo de
        Euclides. */

        Scanner aprendendo = new Scanner(System.in);
        System.out.println("MDC com algoritmo de Euclides");

        int numAOri, numBOri;
        int numA, numB;
        int resto, quo;
        int medB;

        System.out.println("Digite o primeiro número: ");
        numAOri = aprendendo.nextInt();

        System.out.println("Digite o segundo número: ");
        numBOri = aprendendo.nextInt();

        numA = numAOri;
        numB = numBOri;

         while(numA != 0 && numB != 0){
            resto = numA % numB;
            quo = numA/numB;
            numA = numB * quo + resto;

            medB = numB;

         System.out.println("A: " + numA + "\nB: " + numB + "\n");
            numA = medB;
            numB = resto; 
         System.out.println("A: " + numA + "\nB: " + numB + "\n");
         }

         if(numA != 0){
            System.out.println("O MDC de " + numAOri + " e " + numBOri + " é " + numA);
            System.out.println("Cálculo final:A: " + numA + " B: " + numB);
         }
         else if(numB != 0){
            System.out.println("O MDC de " + numAOri + " e " + numBOri + " é " + numB);
            System.out.println("Cálculo final:A: " + numA + " B: " + numB);
         }
         else{
            System.out.println("Que pamonha aconteceu aqui?");
         }
    }
}
