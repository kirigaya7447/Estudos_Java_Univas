import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) throws Exception {
    Scanner le = new Scanner(System.in);
        System.out.println(recebeIdade(le));
    }

    public static String recebeIdade(Scanner le){
        System.out.println("Digite sua idade:")
        int idade = le.nextInt();
        if(isMaiorDeIdade(idade)){
            return "É maior de idade!"
        }
        else{
            return "Não é maior de idade!";
        }
    }

    public static boolean isMaiorDeIdade(int idade){
        boolean eMaior;
        if(idade >= 18){
            eMaior = true;
        }
        else if{
            eMaior = false;
        }

        return eMaior;
    }
}
