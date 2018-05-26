package figuras;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

public class Ventana extends JFrame {
	public Ventana() {
		// creacion de la ventana
		super("ventanica");
		// se hace visible
		setVisible(true);
		// se establece tamaño
		setSize(200, 200);
		// toolkit para las dimensiones
		Toolkit cajita = Toolkit.getDefaultToolkit();
		Dimension dimen = cajita.getScreenSize();
		int alto = (int)dimen.getHeight()/3;
		int ancho = (int)dimen.getWidth()/3;
		// posicionamineto
		setLocation(alto, ancho);
		add(new PanelContenedor());
		
	}
}
