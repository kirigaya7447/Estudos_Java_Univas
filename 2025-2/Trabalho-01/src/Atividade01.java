public class ex1 {
    public static void main(String[] args) {
        int[] vetorA = {2, 5};
        int[] vetorB = {10, 20, 30};
        for (int i = 0; i < vetorA.length; i++) {
            for (int j = 0; j < vetorB.length; j++) {
                int resul = vetorA[i] * vetorB[j];
                System.out.println(vetorA[i] + " * " + vetorB[j] + " = " + resul);
            }
        }
    }
}
