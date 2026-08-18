public class Clinica {
    private int idClinica;
    private String nomeClinica;
    private String endereco;
    private String telefone;

    public Clinica(int idClinica, String nomeClinica, String enedereco, String telefone){
        this.idClinica = idClinica;
        this.nomeClinica = nomeClinica;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public int getIdClinica() {
        return idClinica;
    }

    public void setIdClinica(int idClinica) {
        this.idClinica = idClinica;
    }

    public String getNomeClinica() {
        return nomeClinica;
    }

    public void setNomeClinica(String nomeClinica) {
        this.nomeClinica = nomeClinica;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString(){
        return "ID: " + idClinica + "Nome: " + nomeClinica + "Endereço: " + endereco + "Telefone: " + telefone;
    }
}
