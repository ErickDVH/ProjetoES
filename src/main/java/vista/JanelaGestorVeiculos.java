package vista;

import modelo.DadosApp;
import modelo.Veiculo;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;

public class JanelaGestorVeiculos extends JFrame {

    private JPanel painelPrincipal;
    private JButton button1;
    private JButton button2;
    private JButton adicionarVeiculoButton;
    private JButton selecionarButton;
    private JList<Veiculo> list1;
    private DefaultListModel modelo;

    public JanelaGestorVeiculos (){
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        initComponents();

        DefaultListModel modelo = new DefaultListModel();

        list1.setVisibleRowCount(10);
        list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list1.setModel(modelo);


        setContentPane(painelPrincipal);
        pack();
        setVisible(true);

        selecionarButton.addActionListener(this::selecionarButtonActionPerformed);
        adicionarVeiculoButton.addActionListener(this::adicionarVeiculoButtonActionPerformed);

        list1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                var v = (Veiculo) list1.getSelectedValue();
            }
        });


    }



    private void selecionarButtonActionPerformed(ActionEvent e){
        System.out.println("Click em selecionar");
    }

    private void adicionarVeiculoButtonActionPerformed(ActionEvent e){
        System.out.println("Click em adicionar");
        var veiculo = JanelaCriarVeiculo.mostrarJanelaCriarVeiculo(this);
        atualizarVeiculos();
    }

    private void initComponents(){
        modelo = new DefaultListModel();
        atualizarVeiculos();
        list1.setModel(modelo);
    }

    private void atualizarVeiculos(){
        for(Veiculo v:DadosApp.INSTANCE.getVeiculos()){
            modelo.addElement(v);
        }

    }


    public static void main(String[] args) {
        new JanelaGestorVeiculos().setVisible(true);
    }


}
