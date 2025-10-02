import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner umCiclo = new Scanner(System.in);
        System.out.println("Digite um número simples:");
        int num = umCiclo.nextInt();
        System.out.print("Digite um número grande que contenha este número acima várias vezes: ");
        String grandao = umCiclo.next();

        int contador = 0;
        int contaGrandao = 0;
        while(contador <= grandao.length() - 1){
            if(num == Character.getNumericValue(grandao.charAt(contador))){
                contaGrandao += 1;
            }
            contador += 1;
        }

        System.out.println("Quantidade de vezes: " + contaGrandao);
    }
}
