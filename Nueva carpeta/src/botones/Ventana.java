package botones;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;


public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public Ventana() {
		//LO NORMAL
		super("botonicos");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(230, 300);
		setLocation(200, 200);
//		setResizable(false);
		cambiarIcono();
		/////////////////////////
		Panel1 panel1 = new Panel1();
		
		add(panel1);
	}
	private void cambiarIcono() {
		Toolkit cajita = Toolkit.getDefaultToolkit();
		Image imagen = cajita.getImage("c:/ficheros/icono2.jpg");
		setIconImage(imagen);
	}
}
