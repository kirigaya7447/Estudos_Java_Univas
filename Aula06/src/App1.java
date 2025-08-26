import java.util.Scanner;;

public class App1 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        boolean verdade = true;
        int nota;
        while(verdade){
            System.out.println("Digite uma nota maior que 0 e menor que 10: ");
                nota = scan.nextInt();
                if(nota > 0 && nota < 10){
                    System.out.println("Nota válida!");
                    verdade = false;
                }
                else{
                    System.out.println("Nota inválida!");
                }
        }
    }
}
