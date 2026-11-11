public class TestePolimorfismoCompleto {
    public static void main(String[] args) {
        // --- PREPARAÇÃO ---
        ProcessadorFiscal processador = new ProcessadorFiscal();
        double valorDaNota = 1000.00;
        // Objetos para a Sobrescrita
        Imposto icms = new ICMS();
        Imposto ipi = new IPI();
        System.out.println("==================================================");
        System.out.println(" TESTE DE POLIMORFISMO GERAL");
        System.out.println("==================================================");
        // --- SEÇÃO 1: TESTE DE SOBRECARGA (OVERLOAD) ---
        // Decisão feita em Tempo de Compilação
        System.out.println("### 1. SOBRECARGA (OVERLOAD) - MESMO NOME, ASSINATURAS DIFERENTES ###");
        // Chama a versão 1 (apenas valorBruto)
        processador.processarNota(valorDaNota);
        // Chama a versão 2 (valorBruto, desconto)
        processador.processarNota(valorDaNota, 50.00);
        // Chama a versão 3 (valorBruto, tipoImposto)
        processador.processarNota(valorDaNota, icms);
        // --- SEÇÃO 2: TESTE DE SOBRESCRITA (OVERRIDE) ---
        // Decisão feita em Tempo de Execução (Polimorfismo Dinâmico)
        System.out.println("\n### 2. SOBRESCRITA (OVERRIDE) - DECISÃO DINÂMICA ###");
        // Chamada Polimórfica (Usando o Processador 3 novamente, mas com outro objeto)
        // Passando ICMS (Comportamento de 18%)
        processador.processarNota(valorDaNota, icms);
        // Passando IPI (Comportamento de 10% + 50 fixos)
        processador.processarNota(valorDaNota, ipi);
        System.out.println("==================================================");
        System.out.println("CONCLUÍDO: As duas formas de Polimorfismo funcionaram!");
    }
}