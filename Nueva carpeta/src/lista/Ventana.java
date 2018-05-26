package lista;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.*;
/**
 * clase para crear la ventana
 * @author liken
 *
 */
public class Ventana extends JFrame{
	/**
	 * cosntructor para inicializar la ventana
	 */
	public Ventana() {
		super("ventana desplegable");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(200, 200);
		setSize(800, 600);
		PanelContenedor panelc = new PanelContenedor();
		add(panelc,BorderLayout.CENTER);
	}
	
}
/**
 * clase para crear el panel principal con el menu
 * @author liken
 *
 */
class PanelContenedor extends JPanel{
	public  PanelContenedor() {
		super();
		setVisible(true);
		setBackground(Color.BLUE);
		
		String cadenas[] = {"uno","dos","tres"};
		JComboBox<String> combo = new JComboBox<String>(cadenas);
		add(combo);
	}
	
}