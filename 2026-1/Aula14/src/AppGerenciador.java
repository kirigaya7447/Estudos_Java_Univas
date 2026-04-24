import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class AppGerenciador{
    public static void main(String[] args){
        Scanner lendo = new Scanner(System.in);
        File pasta = new File("sistema_vendas");

        System.out.println("||||||Seja bem vindo ao sistema de manipulação de diretórios!||||||\n");

        int opcao = 0;
        do{
        opcao = exibeMenu(lendo, opcao);
        direcionaMenu(opcao, pasta);

        } while(opcao != 0);
        System.out.println("Sistema finalizado!");
        lendo.close();
    }

    public static int exibeMenu(Scanner lendo, int opcao){
            System.out.println("\nDigite a opção desejada conforme a lista:\n" +
            "1 - Criar a pasta sistema_vendas\n" +
            "2 - Criar o arquivo logs.txt dentro da pasta\n" +
            "3 - Exibir o tamanho e o caminho absoluto do arquivo\n" +
            "4 - Excluir o arquivo\n" +
            "5 - Excluir a pasta\n" +
            "0 - Sair do sistema" +
            "Opção selecionada:");
            opcao = lendo.nextInt();
            return opcao;
    }

    public static void direcionaMenu(int opcao, File pasta){
        if(opcao == 1){
            criarPasta(pasta);
        }
        else if(opcao == 2){
            pasta = criarArqLogs();
        }
        else if(opcao == 3){
            exibeTamanho(pasta);
            exibeCaminho(pasta);
        }
        else if(opcao == 4){
        File novoArquivo = new File("sistema_vendas/logs.txt");
            excluirArquivo(novoArquivo);
            
        }
        else if(opcao == 5){
            excluirPasta(pasta);
        }
        else if(opcao == 0){

        }
        else{
            System.out.println("Opção inválida!");
        }
    }
    
    public static void criarPasta(File pasta){
        if(!pasta.exists()){
            if(pasta.mkdir()){
                System.out.println("Pasta criada com sucesso!");
            }
            else{
                System.out.println("Erro na criação!");
            }
        }
    }

    public static File criarArqLogs(){
        try{
        File novoArquivo = new File("sistema_vendas/logs.txt");

        if(!novoArquivo.exists()){
        if(novoArquivo.createNewFile()){
            System.out.println("Arquivo criado com sucesso!");
        }
    else{
        novoArquivo = new File("sistemas_vendas");
        System.out.println("Erro na criação!");
    }}

        return novoArquivo;
}
catch(IOException err){
    System.out.println("Erro na criação: " + err.getMessage());
    return null;
}
    }

    public static void exibeTamanho(File pasta){
        System.out.println("O tamanho do arquivo é " + pasta.length());
    }

    public static void exibeCaminho(File pasta){
        System.out.println("O caminho absoluto do arquivo é " + pasta.getAbsolutePath());
    }

    public static void excluirArquivo(File arquivo){
        if(arquivo.delete()){
        System.out.println("Arquivo excluído com sucesso!");}
        else{
            System.out.println("Falha na exclusão do arquivo!");
        }
    }

    public static void excluirPasta(File pasta){
        if(pasta.delete()){
        System.out.println("Pasta excluída com sucesso!");}
        else{
            System.out.println("Falha na exclusão da pasta(Não está vazia)!");
            System.out.println("Por favor execute o item 4 antes de prosseguir com este!");
        }
    }
}