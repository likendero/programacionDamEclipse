package figuras;
import java.awt.BorderLayout;

import javax.swing.*;

public class PanelContenedor extends JPanel {
	/**
	 * constructor
	 */
	public PanelContenedor() {
		super();
		setVisible(true);
		// estableciendo layaut
		BorderLayout lay = new BorderLayout();
		setLayout(lay);
		PanelSuperior pan = new PanelSuperior();
		add(pan,BorderLayout.CENTER);
		
	}
}
