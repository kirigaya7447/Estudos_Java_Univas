public class app5 {
    public static void main(String[] args) {
        String[] matriculadosMusica = { "Ana", "Beto", "Caio", "Maria" };
        String[] matriculadosEsporte = { "Davi", "Beto", "Maria", "Zeca" };
        for (int i = 0; i < matriculadosMusica.length; i++) {
            for (int j = 0; j < matriculadosEsporte.length; j++) {
                if (matriculadosMusica[i].equals(matriculadosEsporte[j])) {
                    System.out.println(
                            "Os Alunos que estãos matriculados em ambas as matérias é: " + matriculadosEsporte[j]);
                }
            }
        }
    }
}
