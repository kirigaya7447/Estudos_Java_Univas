import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
public class App {
    public static int carregarEstoque(Produto[] estoque) {
        int cont = 0;
        try {
            Scanner leitor = new Scanner(new File("estoque.csv"));
            while (leitor.hasNextLine() && cont < estoque.length) {
                String linha = leitor.nextLine();
                String[] dados = linha.split(";"); 
                
                estoque[cont] = new Produto(); 
                estoque[cont].nome = dados[0];
                estoque[cont].preco = Double.parseDouble(dados[1]);
                estoque[cont].quantidade = Integer.parseInt(dados[2]);
                cont++;
            }
            leitor.close();
        } catch (Exception e) {
            System.out.println("Erro ao carregar dados.");
        }
        return cont; // Retorna quantos foram lidos
    }
    public static void salvarEstoque(Produto[] estoque, int total) {
        try {
            FileWriter arquivo = new FileWriter("estoque.csv");
            PrintWriter gravador = new PrintWriter(arquivo);
            
            for (int i = 0; i < total; i++) {
                // Converte o objeto para o formato CSV
                String linha = estoque[i].nome + ";" + 
                            estoque[i].preco + ";" + 
                            estoque[i].quantidade;
                gravador.println(linha);
            }
            
            gravador.close();
            System.out.println("Arquivo salvo com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao salvar: " + e.getMessage());
        }
    }
    public static void main(String[] args) throws Exception {
    }
}




