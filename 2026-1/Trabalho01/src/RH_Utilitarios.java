public class RH_Utilitarios {
    public static double calcularINSS(double salarioBruto) {
        double inssCalculado;
        double desconto;
        if (salarioBruto <= 2000) {
            desconto = salarioBruto * 0.08;
            inssCalculado = salarioBruto - desconto;
        } else {
            desconto = salarioBruto * 0.11;
            inssCalculado = salarioBruto - desconto;
        }

        return inssCalculado;
    }

    public static double calcularImpostoRenda(double salarioBruto) {
        double ir;
        if (salarioBruto <= 2500) {
            ir = 0;
        } else if (salarioBruto > 2500.01 && salarioBruto <= 5000) {
            ir = salarioBruto * 0.1;
        } else {
            ir = salarioBruto * 0.2;
        }

        return ir;
    }

    public static double calcularPlanoSaude(int idade) {
        double desconto;
        if (idade < 30) {
            desconto = 100;
        } else if (idade >= 30 && idade < 50) {
            desconto = 200;
        } else {
            desconto = 300;
        }

        return desconto;
    }

    public static double calcularSalarioLiquido(double salarioBruto, double inss, double ir, double planoSaude) {
        double salarioSubtraido;
        salarioSubtraido = salarioBruto - inss - ir - planoSaude;
        return salarioSubtraido;
    }

    public static String verificarCategoria(double salarioLiquido) {
        String categoria;
        if (salarioLiquido < 1500) {
            categoria = "Estagiário";
        } else if (salarioLiquido >= 1500 && salarioLiquido < 3000) {
            categoria = "Júnior";
        } else {
            categoria = "Pleno/Sênior";
        }
        return categoria;
    }
}
