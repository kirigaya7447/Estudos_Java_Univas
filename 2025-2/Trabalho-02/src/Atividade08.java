public class Atividade08 {
    public static void main(String[] args){
        int estoque[] = {10, 20, 30, 40, 50};
        int pedido[] = {20, 40, 10, 5};
        int contador = 0;

        for(int cont = 0; cont < estoque.length; cont++){
            for(int cont1 = 0; cont1 < pedido.length; cont1++){
                if(estoque[cont] == pedido[cont1]){
                    contador += 1;
                }
            }
        }

        if(contador == pedido.length){
            System.out.println("O seu pedido está preparado para ser atendido!");
        }
        else{
            System.out.println("Sinto muito! Mas seu pedido não poderá ser atendido!");
        }
    }
}
