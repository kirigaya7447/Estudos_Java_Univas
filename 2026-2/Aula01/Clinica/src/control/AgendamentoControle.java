package control;

import model.Agendamento;
import util.ManipuladorArquivos;
import javax.swing.*;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AgendamentoControle {
    public static void agendarConsulta(int idPaciente, int idMedico, String dataStr, String horaStr, JFrame tela, int idSecretaria) {
        try {
            Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dataStr);
            if (data.before(new Date())) {
                JOptionPane.showMessageDialog(tela, "A data da consulta não pode ser anterior a hoje.");
                return;
            }

            Time hora = Time.valueOf(horaStr + ":00"); // ex: 14:30 -> 14:30:00

            Agendamento a = new Agendamento(ManipuladorArquivos.proximoId("Agendamento"), idPaciente, idMedico, data, hora, "Pendente");
            SecretariaControle.obterSecretaria(idSecretaria).cadastrarAgendamento(a);
            JOptionPane.showMessageDialog(tela, "Consulta agendada com sucesso.");
            tela.dispose();
            new view.menus.MenuSecretaria(idSecretaria);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(tela, "Erro ao agendar: verifique a data e hora.");
        }
    }
}
