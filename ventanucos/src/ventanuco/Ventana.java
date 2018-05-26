package ventanuco;

import java.awt.Toolkit;
import javax.swing.*;

/**
 *
 * @author liken
 */
public class Ventana extends JFrame {
    /**
     * cosntructor que crea la ventana
     */
    public Ventana(){
        super("ventanuco");
        // definiciones
        Toolkit cajita = Toolkit.getDefaultToolkit();
        int alto = (int)cajita.getScreenSize().getWidth();
        int ancho = (int)cajita.getScreenSize().getHeight();
        // tamnno
        setSize(alto/3, ancho/2);
        // posicion
        setLocation(alto/2,ancho/3);
        // caso de cierre
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // eleemntos
        add(new Panel1(this));
    }
    // metodo que sirve para generar una alerta
    public  void mensaje(){
        JDialog hola = new JDialog(this);
        //tamaño alerta
        hola.setSize(100, 100);
        hola.add(new JLabel("hola"));
        hola.setModal(true);
        hola.setVisible(true);
    }
}

