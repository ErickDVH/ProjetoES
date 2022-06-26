import javax.swing.*;
import java.awt.event.ActionEvent;

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
        recuarButton.addActionListener(this::recuarButton);
        adicionarButton.addActionListener(this::btnAdicionarClienteActionPerformed);
    }

    private void recuarButton(ActionEvent actionEvent) {
        janelaClientes janelaClientes = new janelaClientes();
        this.setVisible(false);
        janelaClientes.setVisible(true);
    }
    private void btnAdicionarClienteActionPerformed(ActionEvent event){
        janelaClientes janelaClientes = new janelaClientes();
        this.setVisible(false);
        janelaClientes.setVisible(true);
        var nome = textFieldNome.getText();
        if(!isNomeValido(nome)){
            Erros.mostrarErro(this,Erros.NOME_INVALIDO);
            return;
        }
        var nif = textFieldNif.getText();
        if(!isNifValido(nif)){
            Erros.mostrarErro(this,Erros.NIF_INVALIDO);
            return;
        }
        var contacto = textFieldContacto.getText();
        if(!isContactoValido(contacto)){
            Erros.mostrarErro(this,Erros.CONTACTO_INVALIDO);
            return;
        }
        var email = textFieldEmail.getText();
        if(!isEmailValido(email)){
            Erros.mostrarErro(this,Erros.EMAIL_INVALIDO);
            return;
        }
        var morada = textFieldMorada.getText();
        if(!isMoradaValida(morada)){
            Erros.mostrarErro(this,Erros.MORADA_INVALIDO);
            return;
        }

        dispose();
    }
    public static DefaultListModel modelList(){
        DefaultListModel model = new DefaultListModel<>();
        model.addElement("Nome: Dario, Nif:829594939, Contacto: 912286782, Email: dario@hotmail.com, Morada:Leiria ");
        return model;
    }
    private boolean isNomeValido(String nome){
        if(textFieldNome.getText().equals(nome)){
            return true;
        }
        return false;
    }

    private boolean isNifValido(String nif){
        if(textFieldNif.getText().equals(nif)){
            return true;
        }
        return false;
    }

    private boolean isContactoValido(String contacto){
        if(textFieldContacto.getText().equals(contacto)){
            return true;
        }
        return false;
    }

    private boolean isEmailValido(String email){
        if(textFieldEmail.getText().equals(email)){
            return true;
        }
        return false;
    }

    private boolean isMoradaValida(String morada){
        if(textFieldMorada.getText().equals(morada)){
            return true;
        }
        return false;
    }
}
