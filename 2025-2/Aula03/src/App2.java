import java.util.Arrays;

public class App2 {
    public static void main(String[] args){
        double notas[] = new double[10];
        Arrays.fill(notas, 0);
        for(double cont : notas){
            System.out.println("Nota: " + cont);
        }
    }
}
