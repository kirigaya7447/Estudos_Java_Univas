import java.util.Scanner;
public class App{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int idade = 18;
        double altura = 1.72;
        String nome = "Denisson";
        boolean estuda = true;
        System.out.println(nome + " possui " + idade + " anos! E tem de altura: " + altura + " ");
        System.out.println("E estuda? " + estuda);
    }
}