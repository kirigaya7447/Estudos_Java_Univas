public class Atividade03 {
    public static void main(String[] args) {
        int a[] = { 10, 25, 30, 42 };
        int b[] = { 15, 20, 25, 30, 50 };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.println("Os números iguais são: " + a[i]);
                }
            }
        }
    }
}