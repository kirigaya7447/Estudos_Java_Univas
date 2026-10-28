package Model;

public class ContaPoupanca extends Conta {
    private int diaAniversario;

    public ContaPoupanca(double saldo, int diaAniversario) {
        super(saldo);
        this.diaAniversario = diaAniversario;
    }

    public int getdiaAniversario() {
        return diaAniversario;
    }

    public void setdiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }
}