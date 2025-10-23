public class App6 {
    public static void main(String[] args) throws Exception{
        int contagem[] = new int[5];
        contagem[0] = 1;
        contagem[1] = 2;
        contagem[2] = 3;
        contagem[3] = 4;
        contagem[4] = 5;

        for(int cont = 4; cont >= 0; cont--){
            System.out.println("Posição " + cont + " vale " + contagem[cont]);
        }
    }
}
