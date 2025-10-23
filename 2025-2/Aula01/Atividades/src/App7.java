public class App7 {
    public static void main(String[] args) throws Exception{
        int numb[] = {0, 45, 9877, 12365, 46, 86, 12, 25, 78};

        for(int cont = 0; cont < numb.length; cont++){
            if(numb[cont] % 2 != 1){
                System.out.println("O número " + numb[cont] + " na posição " + cont + " é par!");
            }
        }
    }
}
