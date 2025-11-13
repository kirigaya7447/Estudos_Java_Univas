public class Atividade04 {
    public static void main(String[] args) {
        String[] nomes = { "Ana", "Antonio", "Beatriz", "Carlos" };
        String[] letras = { "A", "B" };
        for (int i = 0; i < nomes.length; i++) {
            for (int j = 0; j < letras.length; j++) {
                if (nomes[i].startsWith(letras[j])) {
                    System.out.println(nomes[i] + " começa com " + letras[j]);
                }
            }
        }
    }
}
