public abstract class Imposto {

    private String nome;

    protected Imposto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public abstract double calcularImposto(double valorBase);
}