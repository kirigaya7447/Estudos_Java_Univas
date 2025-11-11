public class Atividade09 {
    public static void main(String[] args){
        String nomes[] = {"Carla", "Ana", "Zeca", "Beto", "Maria"};
        String aux;

        System.out.println("Array desorganizado:");
        for(int cont = 0; cont < nomes.length; cont++){
            System.out.println(nomes[cont]);
        }

        for(int cont = 0; cont < nomes.length; cont++){
            for(int cont1 = 0; cont1 < nomes.length; cont1++){
                if(nomes[cont].compareTo(nomes[cont1]) < 0){
                    aux = nomes[cont];
                    nomes[cont] = nomes[cont1];
                    nomes[cont1] = aux;
                }
            }
        }
        
        System.out.println("\nArray organizado alfabeticamente:");
        for(int cont = 0; cont < nomes.length; cont++){
            System.out.println(nomes[cont]);
        }
    }
}
