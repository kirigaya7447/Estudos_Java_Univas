import java.util.Date;

public class Paciente {
    private int idPaciente;
    private String nome;
    private Date dataNascimento;
    private String telefone;
    private String email;

    public Paciente(int idPaciente, String nome, Date dataNascimento, String telefone, String email){
        this.idPaciente = idPaciente;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
    }

    public void atualizarContato(String email, String telefone){
        this.email = email;
        this.telefone = telefone;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "ID: " + idPaciente + "Nome: " + nome + "Data de Nascimento: " + dataNascimento + "Telefone: " + telefone + "E-mail:" + email;
    }
}
