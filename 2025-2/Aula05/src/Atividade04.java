public class Atividade04 {
    public static void main(String[] args){
        int matriz[][] =  { {1, 5}, {10, 2} };

        int soma = 0;

        for(int pedro = 0; pedro < matriz.length; pedro++){
            for(int ana = 0; ana < matriz[0].length; ana++){
                soma += matriz[pedro][ana];
            }
        }

        System.out.println("A soma de todos os valores de: ");

        for(int pedro = 0; pedro < matriz.length; pedro++){
            for(int ana = 0; ana < matriz[0].length; ana++){
                System.out.print("| " + matriz[pedro][ana]);
            }
            System.out.println(" |");
        }

        System.out.println("É: " + soma);
    }
}
