public class App {
    public static void main(String[] args) throws Exception {
        int num1 = 1;
        int num2 = 2;
        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));
        System.out.println("Divisão: " + (num1 / num2));
        System.out.println("Módulo: " + (num1 % num2));
        
        int inc1 = -1;
        int inc2 = 0;

        inc1++;

        int result = inc1 + inc2; 

        System.out.println("Incremento ++: " + result);
        
        inc1 = -1;
        inc1--;
        result = inc1 + inc2;

        System.out.println("Incremento --: " + result);
        
        inc1 = -1;
        ++inc1;
        result = inc1 + inc2;

        System.out.println("++Incremento: " + result);

        System.out.println("___________________Média de notas:_______________________");
        double n1 = 9.5;
        double n2 = 10;
        double n3 = 8.6;
        System.out.println("Nota1: " + n1 + ", Nota2: " + n2 + " e Nota3: " + n3);
        double media = (n1 + n2 + n3) / 3; 

        System.out.println("Média final é: " + media);
    }
}
