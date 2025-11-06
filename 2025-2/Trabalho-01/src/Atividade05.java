public class VerficadorDivisibilidade {
    public static void main(String[] args) {
        int[] numeros = {10, 15, 20, 25};
        int[] divisores = {2, 5};

        for(int i = 0; i<divisores.length; i++){
            for(int j = 0; j<numeros.length; j++){
                if(numeros[j]%divisores[i] == 0){
                    System.out.println(numeros[j] + " é divisivel por " + divisores[i]);
                } 
            }
        }
    }
}
