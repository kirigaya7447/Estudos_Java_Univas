package Model;

public abstract class Conta {

    protected double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Depósito inválido: o valor deve ser positivo.");
            return;
        }
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Saldo: R$" + this.saldo);
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Saque inválido: o valor deve ser positivo.");
            return;
        }
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente para sacar R$" + valor + ".");
            return;
        }
        this.saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado. Saldo: R$" + this.saldo);
    }

    public double getSaldo() {
        return this.saldo;
    }
}