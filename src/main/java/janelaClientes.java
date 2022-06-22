import javax.swing.*;
import java.awt.event.ActionEvent;

public class janelaClientes extends JFrame{
    private JButton veiculosButton;
    private JButton clientesButton;
    private JButton reparacoesButton;
    private JButton transacaoButton;
    private JButton eventosButton;
    private JButton pecasButton;
    private JButton estatisticasButton;
    private JButton adicionarClienteButton;
    private JButton seleccionarButton;
    private JButton recuarButton;
    private JPanel panelClientes;
    private JLabel listaClientes;

    public janelaClientes(){
        setContentPane(panelClientes);
        pack();
        adicionarClienteButton.addActionListener(this::adicionarClienteButton);
        seleccionarButton.addActionListener(this::seleccionarButton);
        recuarButton.addActionListener(this::recuarButton);
        eventosButton.addActionListener(this::eventosButton);
    }

    private void eventosButton(ActionEvent event) {
        janelaEventos janelaEventos = new janelaEventos();
        this.setVisible(false);
        janelaEventos.setVisible(true);
    }

    private void recuarButton(ActionEvent actionEvent) {
        System.exit(0);
    }

    private void seleccionarButton(ActionEvent actionEvent) {
        janelaClienteInfo janelaClienteInfo = new janelaClienteInfo();
        this.setVisible(false);
        janelaClienteInfo.setVisible(true);
    }

    private void adicionarClienteButton(ActionEvent actionEvent) {
        janelaAdicionarCliente janelaClientes = new janelaAdicionarCliente();
        this.setVisible(false);
        janelaClientes.setVisible(true);
    }

    public static void main(String[] args) {
        new janelaClientes().setVisible(true);
    }
}
