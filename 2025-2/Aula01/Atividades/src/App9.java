public class App9 {
    public static void main(String[] args) throws Exception{
        String produtos[] =  {"Arroz", "Feijão", "Óleo", "Sal", "Raiva", "Revolta", "Macarrão"};
        int estoque[] =  {5, 8, 20, 3, 45, 96, 4};

        //Produto com baixo estoque: Feijão (8 unidades)
        for(int cont = 0; cont < produtos.length; cont++){
            if(estoque[cont] <= 10){
                System.out.println("ATENÇÃO:\n O produto " + produtos[cont] + " está com o estoque baixo: " + estoque[cont] + " unidades restantes.");
            }
        }
    }
}
