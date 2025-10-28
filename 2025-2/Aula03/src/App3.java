import java.util.Arrays;

public class App3 {
    public static void main(String[] args){
        String listaAlfabetica[] = {"Stephany","Pedro","Matheus","Andrey","Giulia","Bianca","Ana","Dennisson","Paula","Her"};
        Arrays.sort(listaAlfabetica);
        for(String listando : listaAlfabetica){
            System.out.println(listando);
        }
    }
    
}
