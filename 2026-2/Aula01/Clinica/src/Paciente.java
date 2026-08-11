import java.util.Date;

public class Paciente {
    int idPaciente;
     String nome;
     Date dataNascimento;
     String telefone;
     String email;

    /*public Paciente(int idPaciente, String nome, String dataNascimento, String telefone, String email){
        this.idPaciente = idPaciente;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
    }*/

    public void atualizarContato(String email, String telefone){
        this.email = email;
        this.telefone = telefone;
    }
}
