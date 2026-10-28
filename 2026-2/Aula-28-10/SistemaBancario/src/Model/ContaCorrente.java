package Model;

public class ContaCorrente extends Conta {

    protected double limiteCredito;

    public ContaCorrente(double saldo, double limiteCredito) {
        super(saldo);
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo + limiteCredito) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}