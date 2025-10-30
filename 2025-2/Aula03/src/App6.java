public class App6 {
    public static void main(String[] args){
        int valores[] = {1, 2, 3, 4, 5};
        for(int cont : valores){
            cont *= 2;
        }
        for(int cont : valores){
            System.out.println(cont);
        }
    //Exercício para demonstrar que o foreach não altera os dados

    for(int canseiDoCont = 0; canseiDoCont < valores.length; canseiDoCont++){
        valores[canseiDoCont] *= 2;
    }

    for(int canseiDoCont = 0; canseiDoCont < valores.length; canseiDoCont++){
        System.out.println(valores[canseiDoCont]);
    }
    }
}
