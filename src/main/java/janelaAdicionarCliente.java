import javax.swing.*;

public class janelaAdicionarCliente extends JFrame{

    private JPanel panelAdicionar;
    private JButton veiculoButton;
    private JButton transacaoButton;
    private JButton eventoButton;
    private JButton pecasButton;
    private JButton clientesButton;
    private JButton estatisticasButton;
    private JButton reparacoesButton;
    private JLabel filial;
    private JLabel cliente;
    private JLabel nome;
    private JTextField textFieldNome;
    private JLabel nif;
    private JTextField textFieldNif;
    private JLabel contacto;
    private JTextField textFieldContacto;
    private JLabel email;
    private JTextField textFieldEmail;
    private JLabel morada;
    private JTextField textFieldMorada;
    private JButton recuarButton;
    private JButton adicionarButton;

    public janelaAdicionarCliente(){
        setContentPane(panelAdicionar);
        pack();
        setVisible(true);
    }
}
