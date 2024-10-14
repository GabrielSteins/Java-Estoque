/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author 202304392651
 */
// MovimentacaoView.java

import Controller.MovimentacaoController;
import Modelo.Ferramenta;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovimentacaoView extends JFrame {
    private JTextField txtNome;
    private JTextField txtQuantidade;
    private JRadioButton rbAdicionar;
    private JRadioButton rbRemover;
    private JButton btnConfirmar;
    private MovimentacaoController movimentacaoController;

    public MovimentacaoView() {
        movimentacaoController = new MovimentacaoController();

        setTitle("Movimentação de Estoque");
        setSize(300, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblNome = new JLabel("Nome da Ferramenta:");
        lblNome.setBounds(10, 10, 150, 25);
        add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(150, 10, 120, 25);
        add(txtNome);

        JLabel lblQuantidade = new JLabel("Quantidade:");
        lblQuantidade.setBounds(10, 50, 150, 25);
        add(lblQuantidade);

        txtQuantidade = new JTextField();
        txtQuantidade.setBounds(150, 50, 120, 25);
        add(txtQuantidade);

        rbAdicionar = new JRadioButton("Adicionar");
        rbAdicionar.setBounds(10, 90, 100, 25);
        rbAdicionar.setSelected(true);
        add(rbAdicionar);

        rbRemover = new JRadioButton("Remover");
        rbRemover.setBounds(120, 90, 100, 25);
        add(rbRemover);

        ButtonGroup group = new ButtonGroup();
        group.add(rbAdicionar);
        group.add(rbRemover);

        btnConfirmar = new JButton("Confirmar");
        btnConfirmar.setBounds(90, 130, 100, 25);
        add(btnConfirmar);

        btnConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText();
                int quantidade = Integer.parseInt(txtQuantidade.getText());
                Ferramenta ferramenta = new Ferramenta(nome, null, 0); // apenas para o nome

                if (rbAdicionar.isSelected()) {
                    movimentacaoController.movimentarEstoque(ferramenta, quantidade, true);
                } else {
                    movimentacaoController.movimentarEstoque(ferramenta, quantidade, false);
                }

                JOptionPane.showMessageDialog(null, "Movimentação realizada com sucesso!");
                dispose();
            }
        });
    }
}

