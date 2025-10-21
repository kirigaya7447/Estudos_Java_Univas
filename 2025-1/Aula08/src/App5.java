import java.util.Scanner;

public class App5 {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número");
        double num = leia.nextInt();
        double contador = 0;

        boolean primo = false;

        for (double lab = 2; lab <= num; lab++) {
            if (num % lab == 0) {
                contador += 1;
                System.out.println("Número pode ser dividido por " + lab);
            }
        }

        if(contador == 1){
        System.out.println("Número é primo!");
        }
        else{
        System.out.println("Número não é primo!");
        }
    }
}
