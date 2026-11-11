public class ICMS extends Imposto {

    private double aliquota = 0.18;

    public ICMS() {
        super("ICMS");
    }

    @Override
    public double calcularImposto(double valorBase) {
        return valorBase * aliquota;
    }

    public double getAliquota(){
        return aliquota;
    }

    public void setAliquota(double aliquota){
        this.aliquota = aliquota;
    }
}