import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner festa = new Scanner(System.in);
        char letras = 'a';
        int contador = 0;
        while(letras != '.'){
            System.out.println("Digite um único caractere: ");
            letras = festa.next().charAt(0);

            if(letras != '.'){
                contador += 1;
            }

            System.out.println("Última letra ou caractere digitado: " + letras);
        }

        System.out.println("Quantidade total de caracteres: " + contador);
    }
}
