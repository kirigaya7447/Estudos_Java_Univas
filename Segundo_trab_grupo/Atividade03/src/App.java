import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Soma do Maior e Menor: Peça ao usuário para digitar 5 números inteiros. Use
        um loop for para ler os números e, ao final, exiba a soma do maior e do
        menor número digitado. */

        Scanner leia = new Scanner(System.in);
        int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;
        int maior = 0;
        int menor = 0;

        for(int cont = 1; cont <= 5; cont++){
            System.out.println("Digite um número: ");
            if(cont == 1){
                num1 = leia.nextInt();
            }
            else if(cont == 2){
                num2 = leia.nextInt();
            }
            else if(cont == 3){
                num3 = leia.nextInt();
            }
            else if(cont == 4){
                num4 = leia.nextInt();
            }
            else{
                num5 = leia.nextInt();
            }

        }

        //maior
        if(num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5){
            maior = num1;
        }
        else if(num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5){
            maior = num2;
        }
        else if(num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5){
            maior = num3;
        }
        else if(num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5){
            maior = num4;
        }
        else{
            maior = num5;
        }

        //menor
        if(num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5){
            menor = num1;
        }
        else if(num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5){
            menor = num2;
        }
        else if(num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5){
            menor = num3;
        }
        else if(num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5){
            menor = num4;
        }
        else{
            menor = num5;
        }

        int soma = maior + menor;

        System.out.println("A soma do maior pelo menor é: " + soma);

    }
}
