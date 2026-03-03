import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) throws Exception {
    Scanner le = new Scanner(System.in);
        System.out.println("Hello, World!");
    }

    public static String formatarSegundos(int segundos){
        int horas = segundos / 3600;
        segundos = segundos % 3600;
        int minutos = segundos * 60;
        return horas + " horas, " + minutos + " minutos e" + segundos + " segundos";

    }
}
