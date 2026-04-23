package Desafio02;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner leia = new Scanner(System.in);
        Livro l1 = new Livro();

        System.out.println("////CADASTRO DO LIVRO\\\\\\\\");

        System.out.println("Digite o título do livro: ");
        l1.titulo = leia.nextLine();
        
        System.out.println("Digite o nome do autor do livro: ");
        l1.autor = leia.nextLine();

        System.out.println("Digite o ano de publicação do livro: ");
        l1.anoPublicacao = leia.nextInt();

        System.out.println("////CLASSIFICAÇÃO DO LIVRO\\\\\\\\");

        System.out.println("O livro é um " + l1.isClassic(l1));

    }
}
