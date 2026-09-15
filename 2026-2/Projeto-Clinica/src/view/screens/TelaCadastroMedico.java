package view.screens;

import javax.swing.*;
import java.awt.*;
import control.*;

public class TelaCadastroMedico extends JFrame {

    public TelaCadastroMedico() {
        setTitle("Cadastrar Médico");
        setSize(350, 250);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridLayout(4, 2, 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel lblNome = new JLabel("Nome:");
        JTextField txtNome = new JTextField();

        JLabel lblEspecialidade = new JLabel("Especialidade:");
        JTextField txtEspecialidade = new JTextField();

        JLabel lblCrm = new JLabel("CRM:");
        JTextField txtCrm = new JTextField();

        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.addActionListener(e -> {
            String nome = txtNome.getText().trim();
            String especialidade = txtEspecialidade.getText().trim();
            String crm = txtCrm.getText().trim();

            MedicoControle.cadastrarMedico(nome, especialidade, crm, this);
        });

        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(e -> {
            dispose();
            new view.menus.MenuClinica();
        });

        painel.add(lblNome);
        painel.add(txtNome);

        painel.add(lblEspecialidade);
        painel.add(txtEspecialidade);

        painel.add(lblCrm);
        painel.add(txtCrm);

        painel.add(btnVoltar);
        painel.add(btnSalvar);

        add(painel);
        setVisible(true);
    }
}
