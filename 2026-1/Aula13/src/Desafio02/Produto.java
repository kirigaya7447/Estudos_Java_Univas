package Desafio02;

public class Produto {
    public String nome;
    public double preco;

    public static void aplicarInflacao(Produto[] estoque, double percentual){
        for(int cont = 0; cont < estoque.length; cont++){
            estoque[cont].preco = estoque[cont].preco + (estoque[cont].preco * (percentual / 100));
        }
    }
}
