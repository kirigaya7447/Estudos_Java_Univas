import java.util.Arrays;

public class App7 {
    public static void main(String[] args){
        int vecna[] = {5, 2, 8, 1, 10, 4, 6};

        int quaseMeio = vecna.length;
        Arrays.sort(vecna);

        for(int myke : vecna){
            System.out.println(myke);
        }

        System.out.println("+______________________________________+\n");

        if(quaseMeio % 2 == 0){
            quaseMeio = quaseMeio / 2;
            double media = (vecna[quaseMeio - 1] + vecna[quaseMeio]) / 2;
            System.out.println("A média é: " + media);
        }
        else{
            int media = vecna[quaseMeio / 2];
            System.out.println("A média é: " + media);
        }
    }
    
}
