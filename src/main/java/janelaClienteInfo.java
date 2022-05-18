import javax.swing.*;
import java.awt.event.ActionEvent;

public class janelaClienteInfo extends JFrame{
    private JanelaClientes janelaClientes;
    private JPanel clienteInfo;
    private JButton veiculoButton;
    private JButton transacaoButton;
    private JButton eventosButton;
    private JButton pecasButton;
    private JButton clientesButton;
    private JButton estatisticasButton;
    private JButton reparacoesButton;
    private JLabel filial;
    private JButton alterarButton;
    private JButton recuarButton;
    private JButton verHistoricoDeTransacoesButton;
    private JButton verHistoricoDeReparacoesButton;

    public janelaClienteInfo(){
        setContentPane(clienteInfo);
        pack();
        setVisible(true);
        recuarButton.addActionListener(this::recuarButton);
    }

    private void recuarButton(ActionEvent actionEvent) {
        System.exit(0);
    }
}
