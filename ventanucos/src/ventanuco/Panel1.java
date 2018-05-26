
package ventanuco;
import com.sun.security.auth.module.JndiLoginModule;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author liken
 */
public class Panel1 extends JPanel implements ActionListener{
    JButton boton;
    Ventana frame;
    public Panel1(Ventana frame){
        super();
        setLayout(null);
        this.frame = frame;
        // boton
        boton = new JButton("hola");
        boton.addActionListener(this);
        boton.setLocation(50, 30);
        boton.setSize(60,20);
        add(boton);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.boton){
            this.frame.mensaje();
        }
    }
}
