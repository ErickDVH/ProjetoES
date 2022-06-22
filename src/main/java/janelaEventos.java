import javax.swing.*;
import java.awt.event.ActionEvent;

public class janelaEventos extends JFrame{
    private JPanel panelEventos;
    private JButton veiculosButton;
    private JButton clientesButton;
    private JButton reparacoesButton;
    private JButton transacaoButton;
    private JButton eventosButton;
    private JButton pecasButton;
    private JButton estatisticasButton;
    private JButton adicionarEventoButton;
    private JButton seleccionarButton;
    private JButton recuarButton;
    private JLabel listaClientes;

    public janelaEventos(){
        setContentPane(panelEventos);
        pack();
        adicionarEventoButton.addActionListener(this::adicionarEventoButton);
        seleccionarButton.addActionListener(this::seleccionarButton);
        recuarButton.addActionListener(this::recuarButton);
        clientesButton.addActionListener(this::clientesButton);
    }

    private void clientesButton(ActionEvent event) {
        janelaClientes janelaClientes = new janelaClientes();
        this.setVisible(false);
        janelaClientes.setVisible(true);
    }

    private void recuarButton(ActionEvent actionEvent) {
        System.exit(0);
    }

    private void seleccionarButton(ActionEvent actionEvent) {
        janelaEventoInfo janelaEventoInfo = new janelaEventoInfo();
        this.setVisible(false);
        janelaEventoInfo.setVisible(true);
    }

    private void adicionarEventoButton(ActionEvent actionEvent) {
        janelaAdicionarEvento janelaEventos = new janelaAdicionarEvento();
        this.setVisible(false);
        janelaEventos.setVisible(true);
    }

    public static void main(String[] args) {
        new janelaEventos().setVisible(true);
    }
}
