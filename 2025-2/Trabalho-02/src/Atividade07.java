public class Atividade07 {
    public static void main(String[] args){
        String palavras[] = {"Java", "C#", "Python", "Java", "PHP", "C#"};

        for(int cont = 0; cont < palavras.length; cont++){
            for(int cont1 = 0; cont1 < palavras.length; cont1++){
                if(palavras[cont].equals(palavras[cont1]) && cont != cont1){
                    System.out.println("A palavra " + palavras[cont] + "(" + cont + ")é igual a " + palavras[cont1] + "("+ cont1 +")");
                }
            }
        }
    }
}
