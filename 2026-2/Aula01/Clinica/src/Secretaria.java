public class Secretaria {
    private int idSecretaria;
    private String nome;
    private String turno;

    public Secretaria(int idSecretaria, String nome, String turno){
        this.idSecretaria = idSecretaria;
        this.nome = nome;
        this.turno = turno;
    }

    public int getIdSecretaria() {
        return idSecretaria;
    }

    public void setIdSecretaria(int idSecretaria) {
        this.idSecretaria = idSecretaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString(){
        return "ID:" + idSecretaria + "Nome: " + nome + "Turno: " + turno;
    }
}
