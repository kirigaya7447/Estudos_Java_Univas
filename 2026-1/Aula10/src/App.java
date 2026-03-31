public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Fibonacci em recursão: ");
        long inicioMedicao = System.currentTimeMillis();
        System.out.println(fibonacciRecursivo(45));
        long fimMedicao = (System.currentTimeMillis() - inicioMedicao) / 1000;
        System.out.println("Tempo de execução em " + fimMedicao + " segundos");

        System.out.println("Fibonacci em iteração: ");
        inicioMedicao = System.currentTimeMillis();
        System.out.println(fibonacciIterativo(45));
        fimMedicao = (System.currentTimeMillis() - inicioMedicao) / 1000;
        System.out.println("Tempo de execução em " + fimMedicao + " segundos");
    }

    public static long fibonacciRecursivo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursivo(n - 2) + fibonacciRecursivo(n - 1);

    }

    public static int fibonacciIterativo(int n){
        int n1 = 0;
        int n2 = 1;
        int contando = 0;
        for(int cont = 0; cont < n; cont++){
            contando = n1 + n2;
            n2 = n1;
            n1 = contando;
        }
        return n1;
    }
}
