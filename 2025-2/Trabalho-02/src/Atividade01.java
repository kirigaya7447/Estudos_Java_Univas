public class Atividade01 {
    public static void main(String[] args) {
        String[] nomes = { "João", "Maria", "Carlos" };
        String[] sobrenomes = { "Silva", "Santos" };
        for (int i = 0; i < nomes.length; i++) {
            for (int j = 0; j < sobrenomes.length; j++) {
                System.out.println(nomes[i] + " " + sobrenomes[j]);
            }
        }
    }
}