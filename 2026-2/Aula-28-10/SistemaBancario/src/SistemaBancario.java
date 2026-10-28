import Model.*;

public class SistemaBancario {
    /* Método LSP: Aceita qualquer objeto que seja do tipo
    Conta (ou herde de Conta)*/
    public static void exibirStatusConta(Conta contaGenerica)
    {
        System.out.println("\n--- Status da Conta ---");
        /* Verifica o tipo da instância (para fins de
        demonstração)*/
        System.out.println("Tipo: " +
                contaGenerica.getClass().getSimpleName());
        System.out.println("Saldo Atual: R$" +
                contaGenerica.getSaldo());
    }

    public static void main(String[] args) {
        /* As classes ContaCorrente, ContaPoupanca e Cliente
        devem ser criadas*/
        // de forma que esta seção funcione corretamente!
        ContaCorrente cc = new ContaCorrente(800.00, 200.00);
        ContaPoupanca cp = new ContaPoupanca(1500.00, 5);
        // TESTE DE COMPOSIÇÃO (Cliente TEM UMA Conta)
        Cliente clienteCC = new Cliente("Maria Silva", cc);
        System.out.println("Teste de Herança e Sobrescrita ");
        // Saque normal (deve funcionar)
        cc.sacar(100.00);
        /* Saque que usa o limite (Deve usar a lógica
        sobrescrita de ContaCorrente)*/
        cc.sacar(1000.00);
        // Depósito na Poupança (Método herdado)
        cp.depositar(500.00);
        // --------------------------------------------------
        // APLICAÇÃO DO LSP
        // --------------------------------------------------
        System.out.println("\n--- Teste de Princípio LSP ---");
        /* O método recebe o tipo Conta, mas aceita
        ContaCorrente (Subtipo)*/
        exibirStatusConta(cc);
        /* O método recebe o tipo Conta, mas aceita
        ContaPoupanca (Outro Subtipo)*/
        exibirStatusConta(cp);
        System.out.println("O sistema tratou as classes especializadas de forma uniforme.");
    }

}
