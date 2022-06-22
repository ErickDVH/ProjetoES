import javax.swing.*;
import java.awt.event.ActionEvent;

public class janelaAdicionarEvento extends JFrame{
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
    private JLabel inicio;
    private JTextField textFieldInicio;
    private JLabel fim;
    private JTextField textFieldFim;
    private JLabel veiculos;
    private JTextField textFieldVeiculos;
    private JLabel local;
    private JTextField textFieldLocal;
    private JButton recuarButton;
    private JButton criarButton;
    private JButton adicionarVeiculosButton;

    public janelaAdicionarEvento(){
        setContentPane(panelAdicionar);
        pack();
        setVisible(true);
        recuarButton.addActionListener(this::recuarButton);
        criarButton.addActionListener(this::btnAdicionarEventoActionPerformed);
    }
    private void btnAdicionarEventoActionPerformed(ActionEvent event){
        janelaEventos janelaEventos = new janelaEventos();
        this.setVisible(false);
        janelaEventos.setVisible(true);
        var nome = textFieldNome.getText();
        if(!isNomeValido(nome)){
            Erros.mostrarErro(this,Erros.NOME_INVALIDO);
            return;
        }
        var inicio = textFieldInicio.getText();
        if(!isInicioValido(inicio)){
            Erros.mostrarErro(this,Erros.INICIO_INVALID0);
            return;
        }
        var fim = textFieldFim.getText();
        if(!isFimValido(fim)){
            Erros.mostrarErro(this,Erros.FIM_INVALIDO);
            return;
        }
        var veiculos = textFieldVeiculos.getText();
        if(!isVeiculosValido(veiculos)){
            Erros.mostrarErro(this,Erros.VEICULOS_INVALIDOS);
            return;
        }
        var local = textFieldLocal.getText();
        if(!isLocalValido(local)){
            Erros.mostrarErro(this,Erros.LOCAL_INVALIDO);
            return;
        }

        dispose();

    }
    private void recuarButton(ActionEvent actionEvent) {
        janelaEventos janelaEventos = new janelaEventos();
        this.setVisible(false);
        janelaEventos.setVisible(true);
    }
    private boolean isNomeValido(String nome){
        if(textFieldNome.getText().equals(nome)){
            return true;
        }
        return false;
    }

    private boolean isInicioValido(String inicio){
        if(textFieldInicio.getText().equals(inicio) && (!textFieldInicio.getText().equals(textFieldFim.getText()))){
            return true;
        }
        return false;
    }

    private boolean isFimValido(String fim){
        if(textFieldFim.getText().equals(fim) && (!textFieldFim.getText().equals(textFieldInicio.getText()))){
            return true;
        }
        return false;
    }

    private boolean isVeiculosValido(String veiculos){
        if(textFieldVeiculos.getText().equals(veiculos)){
            return true;
        }
        return false;
    }

    private boolean isLocalValido(String local){
        if(textFieldLocal.getText().equals(local)){
            return true;
        }
        return false;
    }
}
