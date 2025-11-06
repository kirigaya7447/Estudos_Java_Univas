import java.util.Arrays;

public class ex9 {
    public static void main(String[] args) {
        int[] dadoparavetor = {5, 2, 8, 1, 4};
        int aux; 

        for (int i = 0; i < dadoparavetor.length - 1; i++) {
            for (int j = i + 1; j < dadoparavetor.length; j++) {
                if (dadoparavetor[i] > dadoparavetor[j]) {
                    aux = dadoparavetor[i];
                    dadoparavetor[i] = dadoparavetor[j];
                    dadoparavetor[j] = aux;
                }
            }
        }
        System.out.println("Vetor ordenado: " + Arrays.toString(dadoparavetor));
    }
}
