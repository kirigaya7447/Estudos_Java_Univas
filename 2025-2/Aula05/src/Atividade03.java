public class Atividade03 {
    public static void main(String[] args){
        String tabuleiro[][] = new String[3][4];
        int contador  = 0;

        for(int cont = 0; cont < tabuleiro.length; cont++){
            for(int cont1 = 0; cont1 < tabuleiro[0].length; cont1++){
                tabuleiro[cont][cont1] = "-";
        }
        }

        for(int cont = 0; cont < tabuleiro.length; cont++){
            for(int cont1 = 0; cont1 < tabuleiro[0].length; cont1++){
                System.out.print("| " + tabuleiro[cont][cont1]);
        }
        System.out.println("|");
        }

        for(int cont = 0; cont < tabuleiro.length; cont++){
            for(int cont1 = 0; cont1 < tabuleiro[0].length; cont1++){
                if(tabuleiro[cont][cont1].equals("-")){
                    contador += 1;
                }
        }
        }

        if((tabuleiro.length * tabuleiro[0].length) == (contador)){
            System.out.println("A matriz está totalmente vazia!");
        }
        else{
            System.out.println("A matriz possui dados!");
        }
    }
}
