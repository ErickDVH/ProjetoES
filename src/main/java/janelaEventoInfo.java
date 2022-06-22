import javax.swing.*;
import java.awt.event.ActionEvent;

public class janelaEventoInfo extends JFrame{
    private JPanel eventoInfo;
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
    private JButton verVeiculosButton;
    private JButton cancelarButton;

    public janelaEventoInfo(){
        setContentPane(eventoInfo);
        pack();
        setVisible(true);
        recuarButton.addActionListener(this::recuarButton);
    }

    private void recuarButton(ActionEvent actionEvent) {
        janelaEventos janelaEventos = new janelaEventos();
        this.setVisible(false);
        janelaEventos.setVisible(true);
    }
}
