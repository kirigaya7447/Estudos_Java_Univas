import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner leia = new Scanner(System.in);
        System.out.println("digite uma palavra: ");
        String palavra = leia.nextLine();


        int contadorVogais = 0;

        for (int i = 0; i < palavra.length(); i++) {
        char letra = palavra.charAt(i); 

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
        letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
        contadorVogais++;

            }
        }
        System.out.println(contadorVogais);
    }
}
