package control;

import model.*;
import util.ManipuladorArquivos;

import javax.swing.*;
import java.util.List;

public class SecretariaControle {
    public static void cadastrarSecretaria(String nome, String turno, JFrame tela){
        if(nome.isEmpty() || turno.isEmpty()){
            JOptionPane.showMessageDialog(tela, "Preencha todos os campos");
            return;
        }

        int id = ManipuladorArquivos.proximoId("Secretaria");
        Secretaria s = new Secretaria(id, nome, turno);
        ClinicaControle.obterClinica().cadastrarSecretaria(s);

        JOptionPane.showMessageDialog(tela, "Secretaria cadastrada com sucesso!");
        tela.dispose();
        new view.menus.MenuClinica();
    }

    public static Secretaria obterSecretaria(int idSecretaria){
        List<Secretaria> secretarias = ManipuladorArquivos.lerSecretarias();
        Secretaria secretaria = secretarias.stream()
                .filter(s -> s.getIdSecretaria() == idSecretaria)
                .findFirst()
                .orElse(null);
        return secretaria;
    }
}
