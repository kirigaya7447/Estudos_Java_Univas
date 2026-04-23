package Desafio02;

public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;
    
    public static String isClassic(Livro livro){
        if(livro.anoPublicacao < 2000){
            return "Clássico";
        }
        else{
            return "Comtemporâneo";
        }
    }
}
