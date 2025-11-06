public class Atividade08 {
    public static void main(String[] args){
        int[] vetorA = {1, 2, 3, 4, 5};
        int[] vetorB = {2, 4, 6, 8};
        boolean encontrada = false;
        for(int cont = 0; cont < vetorA.length; cont++){
            for(int cont1 = 0; cont1 < vetorB.length; cont1++){
                if(vetorA[cont] == vetorB[cont1]){
                    encontrada = true;
                }
            }
            if(!encontrada){
                System.out.println("O número " + vetorA[cont] + " não está presente no vetorB!");
            }
            else{
                encontrada = false;
            }
        }
    }
}