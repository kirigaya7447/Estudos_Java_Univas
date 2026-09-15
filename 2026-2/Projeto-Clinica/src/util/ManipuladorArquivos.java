package util;

import java.io.*;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import model.*;

import javax.swing.*;

public class ManipuladorArquivos {
    private static final String DIRETORIO = "dados";

    public static void salvarObjeto(String nomeClasse, Object objeto, int camposEsperados){
        String linhaCSV = "";

        if(objeto instanceof Paciente p){
            linhaCSV = p.toCSV();
        }
        else if(objeto instanceof Medico m){
            linhaCSV = m.toCSV();
        }
        else if(objeto instanceof Clinica c){
            linhaCSV = c.toCSV();
        }
        else if(objeto instanceof Secretaria s){
            linhaCSV = s.toCSV();
        }
        else if(objeto instanceof Agendamento a){
            linhaCSV = a.toCSV();
        }

        salvar(nomeClasse, linhaCSV, camposEsperados);
    }

    public static void atualizarObjeto(String nomeClasse, int id, Object novoObjeto, int camposEsperados){
        List<String[]> lista = ler(nomeClasse, camposEsperados);

        for(int cont = 0; cont < lista.size(); cont++){
            if(lista.get(cont)[0].equals(Integer.toString(id))) {
                String novaLinha = "";

                if (novoObjeto instanceof Paciente p) {
                    novaLinha = p.toCSV();
                } else if (novoObjeto instanceof Medico m) {
                    novaLinha = m.toCSV();
                } else if (novoObjeto instanceof Clinica c) {
                    novaLinha = c.toCSV();
                } else if (novoObjeto instanceof Secretaria s) {
                    novaLinha = s.toCSV();
                } else if (novoObjeto instanceof Agendamento a) {
                    novaLinha = a.toCSV();
                }

                lista.set(cont, novaLinha.split(";"));
                break;
            }
        }
        salvarLista(nomeClasse,lista);
    }

    public static void salvar(String nomeClasse, String linhaCSV, int camposEsperados){
        try{
            File dir = new File(DIRETORIO);
            if(!dir.exists()) dir.mkdir();
            FileWriter fw = new FileWriter(new File(dir, nomeClasse + ".csv"), true);
            fw.write(linhaCSV + "\n");
            fw.close();
        } catch(IOException err){
            JOptionPane.showMessageDialog(null, "Erro no salvamento principal: " + err.getMessage());
        }
    }

    public static List<String[]> ler(String nomeClasse, int camposEsperados){
        List<String[]> linhas = new ArrayList<>();
        File arq = new File(DIRETORIO, nomeClasse + ".csv");
        if(!arq.exists()) return linhas;
        try(BufferedReader br = new BufferedReader(new FileReader(arq))){
            String linha;
            while((linha = br.readLine()) != null){
                String[] partes = linha.split(";");
                if(camposEsperados > 0){
                    if(partes.length == camposEsperados){
                        linhas.add(partes);
                    }
                    else{
                        linhas.add(partes);
                    }
                }
            }
        } catch(IOException err){
            JOptionPane.showMessageDialog(null, "Erro na leitura: " + err.getMessage());
        }

        return linhas;
    }

    public static void salvarLista(String nomeClasse, List<String[]> lista){
        try{
            FileWriter fw = new FileWriter(new File(DIRETORIO, nomeClasse + ".csv"), false);
            for(String[] campos : lista){
                fw.write(String.join(";", campos) + "\n");
            }
            fw.close();
        } catch(IOException err){
            JOptionPane.showMessageDialog(null, "Erro ao sobrescrever o arquivo: " + err.getMessage());
        }
    }

    public static int proximoId(String nomeClasse){
        List<String[]> lista = ler(nomeClasse, -1);
        int maiorId = 0;

        for(String[] campos : lista){
            try{
                int id = Integer.parseInt(campos[0]);
                if(id > maiorId) maiorId = id;
            } catch(NumberFormatException err){
                JOptionPane.showMessageDialog(null, "Erro ao gerar novo id: " + err.getMessage());
            }
        }
        return maiorId + 1;
    }

    public static List<Paciente> lerPacientes(){
        List<Paciente> lista = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for (String[] campos : ler("Paciente", 5)) {
            try {
                int id = Integer.parseInt(campos[0]);
                String nome = campos[1];
                Date dataNascimento = sdf.parse(campos[2]);
                String telefone = campos[3];
                String email = campos[4];
                lista.add(new Paciente(id, nome, dataNascimento, telefone, email));
            } catch (Exception e) {
                System.err.println("Erro ao ler paciente: " + Arrays.toString(campos));
            }
        }
        return lista;
    }

    public static List<Medico> lerMedicos(){
        List<Medico> lista = new ArrayList<>();
        for (String[] campos : ler("Medico", 4)) {
            try {
                int idMedico = Integer.parseInt(campos[0]);
                String nome = campos[1];
                String especialidade = campos[2];
                String crm = campos[3];
                lista.add(new Medico(idMedico, nome, especialidade, crm));
            } catch (Exception e) {
                System.err.println("Erro ao ler médico: " + Arrays.toString(campos));
            }
        }
        return lista;
    }

    public static List<Clinica> lerClinicas(){
        List<Clinica> lista = new ArrayList<>();
        for (String[] campos : ler("Clinica", 4)) {
            try {
                int idClinica = Integer.parseInt(campos[0]);
                String nomeClinica = campos[1];
                String endereco = campos[2];
                String telefone = campos[3];
                lista.add(new Clinica(idClinica, nomeClinica, endereco, telefone));
            } catch (Exception e) {
                System.err.println("Erro ao ler clínica: " + Arrays.toString(campos));
            }
        }
        return lista;
    }

    public static List<Secretaria> lerSecretarias(){
        List<Secretaria> lista = new ArrayList<>();
        for (String[] campos : ler("Secretaria", 3)) {
            try {
                int idSecretaria = Integer.parseInt(campos[0]);
                String nome = campos[1];
                String turno = campos[2];
                lista.add(new Secretaria(idSecretaria, nome, turno));
            } catch (Exception e) {
                System.err.println("Erro ao ler secretaria: " + Arrays.toString(campos));
            }
        }
        return lista;
    }

    public static List<Agendamento> lerAgendamentos(){
        List<Agendamento> lista = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for (String[] campos : ler("Agendamento", 6)) {
            try {
                int idAgendamento = Integer.parseInt(campos[0]);
                int idPaciente = Integer.parseInt(campos[1]);
                int idMedico = Integer.parseInt(campos[2]);
                Date data = sdf.parse(campos[3]);
                Time hora = Time.valueOf(campos[4]);
                String status = campos[5];
                lista.add(new Agendamento(idAgendamento, idPaciente, idMedico, data, hora, status));
            } catch (Exception e) {
                System.err.println("Erro ao ler agendamento: " + Arrays.toString(campos));
            }
        }
        return lista;
    }
}

