import javax.swing.*;
import java.awt.*;

public class Erros {
    public static final int NOME_INVALIDO = 1;
    public static final int INICIO_INVALID0 = 2;
    public static final int FIM_INVALIDO = 3;
    public static final int VEICULOS_INVALIDOS = 4;
    public static final int LOCAL_INVALIDO = 5;
    public static final int NIF_INVALIDO = 6;
    public static final int CONTACTO_INVALIDO = 7;
    public static final int EMAIL_INVALIDO = 8;
    public static final int MORADA_INVALIDO = 9;

    public static void mostrarErro(Window parent, int numero){
        switch (numero){
            case NOME_INVALIDO:
                JOptionPane.showMessageDialog(parent,"Nome invalido");
                break;
            case INICIO_INVALID0:
                JOptionPane.showMessageDialog(parent,"Inicio do evento invalido");
                break;
            case FIM_INVALIDO:
                JOptionPane.showMessageDialog(parent,"Fim do evento invalido");
                break;
            case VEICULOS_INVALIDOS:
                JOptionPane.showMessageDialog(parent,"Numero de veiculos invalido");
                break;
            case LOCAL_INVALIDO:
                JOptionPane.showMessageDialog(parent,"Local invalido");
                break;
            case NIF_INVALIDO:
                JOptionPane.showMessageDialog(parent,"Nif invalido");
                break;
            case CONTACTO_INVALIDO:
                JOptionPane.showMessageDialog(parent,"Contacto invalido");
                break;
            case EMAIL_INVALIDO:
                JOptionPane.showMessageDialog(parent,"Email invalido");
                break;
            case MORADA_INVALIDO:
                JOptionPane.showMessageDialog(parent,"Morada invalida");
                break;
            default:

        }
    }
}
