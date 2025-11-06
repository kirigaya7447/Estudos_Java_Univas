public class ComparadorPontuacao {
    public static void main(String[] args) {
        double[] timeA = {8.5, 9.0, 7.0};
        double[] timeB = {7.5, 8.8, 9.5};

        System.out.println("As pontuações de A que são maiores que B são: ");
        for(int i = 0; i<timeA.length; i++){
            for(int j = 0; j<timeB.length; j++){
                if(timeA[i] > timeB[j]){
                    System.out.println(timeA[i] + " > " + timeB[j]);
                } 
            }
        }
    }
}
