public class App {
    public static void main(String[] args) throws Exception {
        int num = -5;
        if(num > 0){
            System.out.println("Número " + num + " é positivo!");
        }
        else if(num < 0){
            System.out.println("Número " + num + " é negativo!");
        }
        else{
            System.out.println("Número " + num + " é 0!");
        }

        System.out.println("_____________________________________________________________________");
        
        if(num % 2 == 0){
            System.out.println("Número é par!");
        }
        else{
            System.out.println("Número é ímpar!");
        }
    }
}
