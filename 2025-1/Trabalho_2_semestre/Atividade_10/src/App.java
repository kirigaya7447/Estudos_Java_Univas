import java.util.Scanner;

public class app4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("escreva uma palavra: ");
        String a = scan.nextLine();

        for (int i = a.length() - 1; i >= 0; i--) {
            System.out.println(a.charAt(i));
        }
    }
}