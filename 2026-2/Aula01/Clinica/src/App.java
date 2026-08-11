import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception{
        Paciente p = new Paciente();

        p.idPaciente = 1;
        p.nome = "Pedro";
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        p.dataNascimento = df.parse("01/01/2001");
        p.telefone = "35 12456789";
        p.email = "pedro@email.com";

        System.out.println("Paciente " + p.idPaciente);
        System.out.println("Nome: " + p.nome);
        System.out.println("Data de Nascimento: " + p.dataNascimento);
        System.out.println("Telefone: " + p.telefone);
        System.out.println("E-mail: " + p.email);

        p.atualizarContato("email2@teste.com", "35 987654321");
        System.out.println("Após atualização de contatos:");

        System.out.println("Paciente " + p.idPaciente);
        System.out.println("Nome: " + p.nome);
        System.out.println("Data de Nascimento: " + p.dataNascimento);
        System.out.println("Telefone: " + p.telefone);
        System.out.println("E-mail: " + p.email);
    }
}
