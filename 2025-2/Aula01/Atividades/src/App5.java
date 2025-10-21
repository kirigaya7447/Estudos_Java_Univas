public class App5 {
    public static void main(String[] args) throws Exception {
        double notasAluno[] = {8.5, 7.0, 9.5, 5.0};
        double total = 0;
        for(int cont = 0; cont < 4; cont++){
            total += notasAluno[cont];
        }
        double media = total / 4;
        System.out.println("Sua média total é " + media);
        }
}
