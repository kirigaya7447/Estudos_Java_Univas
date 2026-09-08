package model;

import util.ManipuladorArquivos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    public void atualizarContato(String email, String telefone){
        this.email = email;
        this.telefone = telefone;
        ManipuladorArquivos.atualizarObjeto("Paciente", idPaciente, this, 5);
    }

    public List<Agendamento> listarAgendamentos(){
        List<Agendamento> todos = ManipuladorArquivos.lerAgendamentos();
        List<Agendamento> meus = new ArrayList<>();
        for(Agendamento ag : todos){
            if(ag.getIdPaciente() = this.idPaciente){
                meus.add(ag);
            }
        }
        return meus;
    }

    public boolean cancelarAgendamento(int idAgendamento){
        List<Agendamento> agendamentos = ManipuladorArquivos.lerAgendamentos();
        Agendamento encontrou = null;

        for(Agendamento ag : agendamentos){
            if(ag.getIdAgendamento() == idAgendamento && ag.getIdAgendamento() == this.idPaciente) {
                ag.setStatus("Cancelado");
                encontrou = ag;
                break;
            }
        }
        if(encontrou != null){
            ManipuladorArquivos.atualizarObjeto("Agendamento", encontrou.getIdAgendamento(), encontrou, 6);
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString(){
        return "ID: " + idPaciente + "\nNome: " + nome + "\nData de Nascimento: " + dataNascimento + "\nTelefone: " + telefone + "\nE-mail: " + email;
    }

    public String toCSV(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return String.join(";", Integer.toString(idPaciente), nome, sdf.format(dataNascimento), telefone, email);
    }
}
