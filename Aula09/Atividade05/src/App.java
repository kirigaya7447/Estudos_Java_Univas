import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner crente = new Scanner(System.in);
        int ano = 0;
        int mes = 0;
        int dia = 0;
        do{
            System.out.println("Digite seu ano de nascimento: ");
            ano = crente.nextInt();
        } while(ano > 2024);
        do{
            System.out.println("Digite seu mês de nascimento: ");
            mes = crente.nextInt();
        } while(mes > 12);
        do{
            System.out.println("Digite seu dia de nascimento: ");
            dia = crente.nextInt();
        } while(dia > 31);
        
        System.out.println("Sua data de nascimento completa é \n " + dia + " - " + mes + " - " + ano);
    }
}
