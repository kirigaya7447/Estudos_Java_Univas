public class CaixaEletronico {
    public static double sacar(double saldo, double valorSaque){
        if(saldo >= valorSaque){
            saldo = saldo - valorSaque;
        }
        return saldo;
    }

    public static double depositar(double saldo, double valorDeposito){
        if(valorDeposito > 0){
            saldo = saldo + valorDeposito;
        }
        return saldo;
    }
}
