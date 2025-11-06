public class Atividade02 {
    public static void main(String[] args){
    String usuarios[] = {"Ana", "Bruno", "Carla"};
    String permissoes[] = {"Leitura", "Escrita"};
    for(int cont = 0; cont < usuarios.length; cont++){
        for(int cont1 = 0; cont1 < permissoes.length; cont1++){
            System.out.println(usuarios[cont] + " tem permissão para " + permissoes[cont1]);
        }
    }
}
}