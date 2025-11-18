public class Atividade02 {
    public static void main(String[] args) throws Exception {
        int linha = 2;
        int coluna = 2;
        int matrizPronta[][] = {
            {1,2,3,},
            {4,5,6},
            {7,8,9}};

        for(int cont = 0; cont < matrizPronta.length; cont++){
            for(int cont1 = 0; cont1 < matrizPronta[0].length; cont1++){
                System.out.print(" | " + matrizPronta[cont][cont1]);
            }
            System.out.print(" |\n");
        }
    }
}
