import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) throws Exception {
    Scanner le = new Scanner(System.in);
        System.out.println(recebeConsumo(le));
    }

    public static String recebeConsumo(Scanner le){
        System.out.println("Digite a quantia de consumo de água no mês(em metros cúbicos):");
        double consumo = le.nextDouble();
        double consumoTotal = calcularContaAgua(consumo);
        if(consumoTotal != 0){
        return "A conta de água do mês será de R$" + consumoTotal;
        }
        else{
        return "Insira um valor válido!";
        }
    }

    public static double calcularContaAgua(double consumo){
        double consumoTotal;
        if(consumo > 0 && consumo <= 10){
            consumoTotal = 35 + consumo;
        }
        else if(consumo > 10 && consumo <= 20){
            consumoTotal = consumo * 5;
        }
        else if(consumo > 20){
            consumoTotal = consumo * 7;
        }
        else{
            System.out.println("Informação inválida!");
            consumoTotal = 0;
        }
        return consumoTotal;
    }
}
