import java.util.Scanner;

public class SistemaFolha {
   public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(System.in);
      int cont = 0;
      do {
         System.out.println("----SISTEMA DE FOLHA DE PAGAMENTO----\n" +
               "1 - Processar lote de funcionários\n" +
               "2 - Sair do sistema\n" +
               "Escolha uma opção:");
         cont = scanner.nextInt();

         if (cont == 1) {
            System.out.println("Quantos funcionários deseja processar neste lote?");
            int func = scanner.nextInt();

            for (int i = 1; i <= func; i++) {
               scanner.nextLine();
               System.out.println("Nome do funcionário " + i + ": ");
               String nome = scanner.nextLine();

               System.out.println("Idade do funcionário " + i + ": ");
               int idade = scanner.nextInt();

               System.out.println("Salário bruto do funcionário " + i + ": ");
               double salarioBruto = scanner.nextDouble();

               double inss = RH_Utilitarios.calcularINSS(salarioBruto);
               double ir = RH_Utilitarios.calcularImpostoRenda(salarioBruto);
               double planoSaude = RH_Utilitarios.calcularPlanoSaude(idade);
               double salarioLiquido = RH_Utilitarios.calcularSalarioLiquido(salarioBruto, inss, ir, planoSaude);
               String verificarCategoria = RH_Utilitarios.verificarCategoria(salarioLiquido);

               System.out.println("----HOLERITE----\n");
               System.out.println("Nome: " + nome);
               System.out.println("Idade: " + idade);
               System.out.println("Salário Bruto: " + salarioBruto);
               System.out.println("Imposto de Renda: " + ir);
               System.out.println("Plano de Saúde: " + planoSaude);
               System.out.println("Salário Líquido: " + salarioLiquido);
               System.out.println("Categoria: " + verificarCategoria);
            }
         }
      } while (cont != 2);
      System.out.println("System exchanged use time!");
      scanner.close();
   }
}
