import javax.swing.*;
import java.awt.event.ActionEvent;

public class JanelaClientes extends JFrame{
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

    public JanelaClientes(){
        setContentPane(panelClientes);
        pack();
        adicionarClienteButton.addActionListener(this::adicionarClienteButton);
        seleccionarButton.addActionListener(this::seleccionarButton);
        recuarButton.addActionListener(this::recuarButton);
    }

    private void recuarButton(ActionEvent actionEvent) {
        System.exit(0);
    }

    private void seleccionarButton(ActionEvent actionEvent) {
        janelaClienteInfo janelaClienteInfo = new janelaClienteInfo();
        janelaClienteInfo.setVisible(true);
    }

    private void adicionarClienteButton(ActionEvent actionEvent) {
        janelaAdicionarCliente janelaClientes = new janelaAdicionarCliente();
        janelaClientes.setVisible(true);
    }

    public static void main(String[] args) {
        new JanelaClientes().setVisible(true);
    }
}
