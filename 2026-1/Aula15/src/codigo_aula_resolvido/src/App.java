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
        Scanner leitor = new Scanner(System.in);

        Produto[] estoque = new Produto[50];
        int opcao;
        int totalProdutos = carregarEstoque(estoque);
        do{
            System.out.println("----SISTEMA DE ESTOQUE DE PRODUTOS-----");
            System.out.println("1 - CADASTRAR NOVO PRODUTO");
            System.out.println("2 - LISTAR PRODUTOS NA MEMORIA");
            System.out.println("3 - SALVAR NO ARQUIVO");
            System.out.println("4 - RECARREGAR DO ARQUIVO (DESCARTAR ALTERAÇÕES)");
            System.out.println("0 - SAIR E SALVAR");
            System.out.print("ESCOLHA UMA OPÇÃO: ");
            opcao = leitor.nextInt();
            leitor.nextLine();
            switch (opcao) {
                case 1:
                    if(totalProdutos<estoque.length){
                        estoque[totalProdutos] = new Produto();
                        System.out.print("Nome do Produto: ");
                        estoque[totalProdutos].nome = leitor.nextLine();
                        System.out.print("Preço (R$): ");
                        estoque[totalProdutos].preco = leitor.nextDouble();
                        System.out.print("Quantidade em estoque: ");
                        estoque[totalProdutos].quantidade = leitor.nextInt();
                        totalProdutos++;
                        System.out.println("PRODUTO CADASTRADO COM SUCESSO!");
                    }else{
                        System.out.println("ERRO - LIMITE DO ESTOQUE ATINGIDO");
                    }
                    break;
                case 2:
                    System.out.println("\n---LISTA DE PRODUTOS ---");
                    if(totalProdutos==0){
                        System.out.println("O estoque está vazio.");
                    }else{
                        for(int i=0;i<totalProdutos;i++){
                            System.out.println("Posição: "+i+" | Nome: "+estoque[i].nome+" | Preço: "+estoque[i].preco+" | Quantidade: "+estoque[i].quantidade);
                        }
                    }
                    System.out.println("-----------------------");
                    break;
                case 3:
                    salvarEstoque(estoque, totalProdutos);
                    break;
                case 4:
                    System.out.println("Atenção: Restaurando versão gravada no HD...");
                    totalProdutos = carregarEstoque(estoque);
                    break;
                case 0:
                    System.out.println("Salvando os dados automaticamente antes de sair...");
                    salvarEstoque(estoque, totalProdutos);
                    System.out.println("Sistema encerrado com segurança!");
                    break;
                default:
                    System.out.println("ERRO - Opção inválida!");
                    break;
            }

        }while(opcao!=0);
        leitor.close();
    }
}




