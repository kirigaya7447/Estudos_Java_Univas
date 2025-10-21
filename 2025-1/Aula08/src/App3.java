public class App3 {
    public static void main(String[] args) throws Exception {
        int soma = 0;
        for(int cont = 0; cont <= 100; cont += 2){
            System.out.print(soma + " + " +  cont + " = " );
            soma = soma + cont;
            System.out.print(soma + "\n");
        }

        System.out.println("O valor total da soma dos pares de 0 a 100 é " + soma);
    }
}
 