public class App {
    public static void main(String[] args) throws Exception {
        
        int soma = 0;
        int num = 1;
        while (num <= 20) {

            if (num % 3 == 0 || num % 5 == 0) {
            
                soma += num;

                

            }
            num++;
        }
        
        System.out.println("A soma dos múltiplos de 3 ou 5 entre 1 e 20 é: " + soma);


        
    }
}
