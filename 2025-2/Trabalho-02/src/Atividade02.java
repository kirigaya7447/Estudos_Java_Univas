public class app2 {
    public static void main(String[] args) {
        int[] acessoSetorA = { 101, 102, 105, 108 };
        int[] acessoSetorB = { 105, 101, 109, 110 };
        for (int i = 0; i < acessoSetorA.length; i++) {
            for (int j = 0; j < acessoSetorB.length; j++) {
                if (acessoSetorA[i] == acessoSetorB[j] && i != j)
                    System.out.println(acessoSetorA[i]);
            }
        }
    }
}