package interfacesGraf;


import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;
public class PanelContenedor extends JPanel {
	// JPanel implementa la interfaz serializable
	private static final long serialVersionUID =  1L;
	
	public PanelContenedor() {
		super();
		BorderLayout lay = new BorderLayout();
		setLayout(lay);
		setVisible(true);
		setBackground(Color.DARK_GRAY);
		Panel1 pan = new Panel1();
		Panel1 pan2 = new Panel1();
		JLabel etiqueta = new JLabel("hola que tal");
		etiqueta.setForeground(Color.WHITE);
		add(pan.getPanel(),BorderLayout.NORTH);
		add(etiqueta,BorderLayout.CENTER);
		add(pan2.getPanel(),BorderLayout.SOUTH);
	}
}
