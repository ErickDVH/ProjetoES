package vista;

import modelo.DadosApp;
import modelo.Veiculo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class JanelaCriarVeiculo extends JFrame{
    private JPanel painelPrincipal;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton cancelarButton;
    private JButton adicionarButton;
    private JTextField txtLocal;
    private JTextField txtMatricula;
    private JTextField txtMarca;
    private JTextField txtModelo;
    private JTextField txtPreco;
    private JTextField txtCor;
    private JTextField txtJantes;
    private Veiculo veiculo;


    public JanelaCriarVeiculo(Frame parent, boolean modal){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(painelPrincipal);
        pack();
        setVisible(true);

        cancelarButton.addActionListener(this::cancelarButtonActionPerformed);
        adicionarButton.addActionListener(this::adicionarButtonActionPerformed);
    }

    private void cancelarButtonActionPerformed(ActionEvent e){
        fechar();
    }
    private void adicionarButtonActionPerformed(ActionEvent e){

        var matricula = txtMatricula.getText();
        var marca = txtMarca.getText();
        var modelo = txtModelo.getText();
        var preco = Integer.parseInt(txtPreco.getText());
        var cor = txtCor.getText();
        var jantes = Integer.parseInt(txtJantes.getText());
        var local = txtLocal.getText();

        Veiculo veiculo = new Veiculo(matricula, marca, modelo, preco, cor, jantes, local);
        DadosApp.INSTANCE.adicionarVeiculo(veiculo);
        fechar();
    }

    public static Veiculo mostrarJanelaCriarVeiculo(Frame parent){
        var detalhes = new JanelaCriarVeiculo(parent, true);
        var veiculo = detalhes.getVeiculo();
        return detalhes.getVeiculo();
    }


    public Veiculo getVeiculo() {return veiculo;}

    private void fechar(){
        this.dispose();
    }
}
