public class Atividade07 {
    public static void main(String[] args) {
        int nums[] = { 10, 5, 40, 5, 22, 10 };
        for (int i = 0; i < nums.length; i++) {
            int contador = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    contador = contador + 1;

                }
            }
            if (contador > 1) {
                System.out.println("Os números iguais são: " + nums[i]);
            }
        }
    }
}
