import java.util.Arrays;

public class App8 {
    public static void main(String[] args){
        String lua = "avon";
        String gigabyte = "novaa";

        char papagaio[] = lua.toCharArray();
        char alegre[] = gigabyte.toCharArray();

        Arrays.sort(papagaio);
        Arrays.sort(alegre);
        if(Arrays.equals(papagaio, alegre)){
            System.out.println("As palavras são anagramas!");
        }
        else{
            System.out.println("As palavras não são anagramas!");
        }

    }
    
}
