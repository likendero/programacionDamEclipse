package interfacesGraf;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;
public class primera {
	public static void main(String[] args) {
		ventana hola = new ventana();
		
		
	}
}
/**
 * clase preparadad para crear una ventana
 * @author liken
 *
 */
class ventana {
	
	public ventana() {
		JFrame venta = new JFrame("hola que tal");
		venta.setSize(300, 300);
		venta.setVisible(true);
		venta.setDefaultCloseOperation(venta.EXIT_ON_CLOSE);
		venta.setLocation(300, 400);
//		BorderLayout lay = new BorderLayout();
//		venta.setLayout(lay);
//		Panel1 panel = new Panel1();
//		venta.add(panel.getPanel(),BorderLayout.CENTER);
		PanelContenedor pan = new PanelContenedor();
		venta.add(pan);
		cambiarIcono(venta);
	}
	
	private  void cambiarIcono(JFrame venta) {
		Toolkit cajita = Toolkit.getDefaultToolkit();
		Image imagen = cajita.getImage("c:/ficheros/icono.jpg");
		venta.setIconImage(imagen);
	}
}
