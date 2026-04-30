package Desafio01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            File caminhoCSV = new File("produtos.csv");
            Scanner leituraArquivo = new Scanner(caminhoCSV);
            Produto[] produto = new Produto[5];//Colocar pro pessoal digitar a quantidade de cadastros

            if (caminhoCSV.exists()) {
                carregarProdutosCSV(produto);
            } else {
                if (criaArquivoCSV(caminhoCSV)) {
                    System.out.println("Arquivo criado com sucesso!");
                }
            }
        } catch (IOException err) {
            System.err.println("Erro na leitura do arquivo: " + err);
        }
    }

    public static boolean criaArquivoCSV(File caminhoCSV) {
        boolean arquivoCriado = false;
        try {
            if (caminhoCSV.createNewFile()) {
                arquivoCriado = true;
            }
        } catch (IOException err) {
            System.err.println("Erro na criação do arquivo: " + err.getMessage());
            arquivoCriado = false;
        }
        return arquivoCriado;
    }

    public static void carregarProdutosCSV(Produto[] produto) {

    }
}
