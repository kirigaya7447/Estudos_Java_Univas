public class Atividade06 {
    public static void main(String[] args){
        double orcamentos[] = {1000.00, 1500.00};
        double custosProjetos[] = {950.00, 1200.00, 1600.00};

        for(int cont = 0; cont < orcamentos.length; cont++){
            for(int cont1 = 0; cont1 < custosProjetos.length; cont1++){
                if(orcamentos[cont] > custosProjetos[cont1]){
                    System.out.println("O orçamento " + orcamentos[cont] + " é suficiente para o custo " + custosProjetos[cont1]);
                }
                else if(orcamentos[cont] == custosProjetos[cont1]){
                    System.out.println("O orçamento " + orcamentos[cont] + " é igual ao custo " + custosProjetos[cont1]);
                }
            }
        }
    }
}
