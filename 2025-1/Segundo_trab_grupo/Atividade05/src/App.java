import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Número de Palindromo: Peça ao usuário para digitar um número inteiro
        positivo. Usando um loop while e operações matemáticas, verifique se o
        número é um palíndromo (ou seja, se lido da esquerda para a direita ou da
        direita para a esquerda, é o mesmo). Exiba o resultado da verificação. */

        Scanner leia = new Scanner(System.in);
        int contaAcertos = 0;
        int cont = 0;
        int contNum = 0;

        System.out.println("Digite um número: ");
        int num = leia.nextInt();
        int numNew = num;
        String numPalavra = String.valueOf(num); 

        while(numNew % 10 > 0){
            numNew = numNew / 10;
            contNum += 1;
        }

        while(cont < contNum){
            int sentido = 0;
            int contrario = contNum - 1;
            if(numPalavra.charAt(sentido) == numPalavra.charAt(contrario)){
                System.out.println(numPalavra.charAt(sentido) + " = " + numPalavra.charAt(contrario));
                contaAcertos += 1;
            }
            sentido += 1;
            contrario -= 1;
            
            cont++;
        }

        if(contaAcertos == contNum){
            System.out.println("O número " + num + " é um palíndromo!");
        }
        
    }
}
