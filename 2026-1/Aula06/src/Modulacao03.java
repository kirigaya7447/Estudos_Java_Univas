import java.util.Scanner;

public class Modulacao03 {

    public static int recebePalpite(Scanner lendo){
        System.out.println(("Digite um número para tentar acertar:"));
        int palpite = lendo.nextInt();
        return palpite;
    }

    public static String avaliarPalpite(int palpite, int segredo){
        if(palpite == segredo){
            return "Acertou!";
        }
        else if(palpite > segredo){
            return "Chute Alto!";
        }
        else{
            return "Chute Baixo!";
        }
    }
}
