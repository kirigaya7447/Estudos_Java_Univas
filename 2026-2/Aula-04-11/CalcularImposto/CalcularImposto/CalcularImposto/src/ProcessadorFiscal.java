public class ProcessadorFiscal {

    public double processarNota(double valorBruto) {
        System.out.println("[Nota simples] Valor processado: R$" + valorBruto);
        return valorBruto;
    }

    public double processarNota(double valorBruto, double desconto) {
        double valorFinal = valorBruto - desconto;
        System.out.println("[Nota com desconto] Bruto: R$" + valorBruto + " | Desconto: R$" + desconto + " Final: R$" + valorFinal);
        return valorFinal;
    }

    public double processarNota(double valorBruto, Imposto tipoImposto) {
        double imposto = tipoImposto.calcularImposto(valorBruto); // POLIMORFISMO DINÂMICO
        double valorFinal = valorBruto + imposto;
        System.out.println("[Nota com "+ tipoImposto.getNome() + "] Bruto: R$ "+  valorBruto + " | Imposto: R$ " + imposto + " | Total: " + valorFinal);
        return valorFinal;
    }
}