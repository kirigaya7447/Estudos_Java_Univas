public class ClientesEspeciais {
    public static void main(String[] args) {
        String[] clientesVIP = {"Maria", "Jose", "Paulo", "Ana"};
        String[] clientesDevedores = {"Ana", "Luis", "Jose", "Marta"};

        System.out.println("Os clientes especiais são: ");
        for(int i = 0; i<clientesVIP.length; i++){
            for(int j = 0; j<clientesDevedores.length; j++){
                if(clientesVIP[i].equals(clientesDevedores[j])){
                    System.out.print(clientesVIP[i] + " ");
                }
            }
        }
    }
}
