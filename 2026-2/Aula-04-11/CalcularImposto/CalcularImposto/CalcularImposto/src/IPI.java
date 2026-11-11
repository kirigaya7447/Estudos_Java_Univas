public class IPI extends Imposto {

    private double aliquota = 0.10;
    private double valorFixoProduto = 50.00;

    public IPI() {
        super("IPI");
    }

    @Override
    public double calcularImposto(double valorBase) {
        double baseAjustada = valorBase * aliquota ;
        return baseAjustada + valorFixoProduto;
    }

    public double getAliquota(){
        return aliquota;
    }

    public void setAliquota(double aliquota){
        this.aliquota = aliquota;
    }

    public double valorFixoProduto(){
        return valorFixoProduto;
    }

    public void setValorFixoProduto(double valorFixoProduto){
        this.valorFixoProduto = valorFixoProduto;
    }
}