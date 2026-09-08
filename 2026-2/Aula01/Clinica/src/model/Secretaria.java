package model;

import util.ManipuladorArquivos;

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

    public void cadastrarPaciente(Paciente paciente){
        ManipuladorArquivos.atualizarObjeto("Paciente", paciente, 5);
    }

    public void atualizarContatoPaciente(int idPaciente, String novoTelefone, String novoEmail){
        Paciente paciente = PacienteControle.obterPaciente(idPaciente);
        paciente.atualizarContato(novoTelefone, novoEmail);
        ManipuladorArquivos.atualizarObjeto("Paciente", idPaciente, paciente, 6);
    }

    public void cadastrarAgendamento(Agendamento agendamento){
        ManipuladorArquivos.salvarObjeto("Agendamento", agendamento, 6);
    }

    @Override
    public String toString(){
        return "ID:" + idSecretaria + "Nome: " + nome + "Turno: " + turno;
    }

    public String toCSV(){
        return String.join(";", Integer.toString(idSecretaria), nome, turno);
    }
}
