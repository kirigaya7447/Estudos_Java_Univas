package Estudos_Java_Univas.Aula07;
import java.util.Scanner;

public class App4 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String confirma;

        do{
        System.out.println("Você me ama?");
        confirma = scan.nextLine();
        if(confirma.equals("Sim") || confirma.equals("sim")){
            System.out.println("De verdade?");
            confirma = scan.nextLine();
            if(confirma.equals("Sim") || confirma.equals("sim")){
                System.out.println("Mentiroso!!!!");
            }
        }
    }while(confirma.equals("Nao"));
}
}
