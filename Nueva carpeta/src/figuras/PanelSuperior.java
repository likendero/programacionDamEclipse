package figuras;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.*;

public class PanelSuperior extends JPanel {
	public PanelSuperior() {
		super();
		setVisible(true);
		setBackground(Color.BLUE);
		
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Font fuente = new Font("courier new", Font.ITALIC, 15);
		g.setFont(fuente);
		g.setColor(Color.BLACK);
		g.drawString("hola que tal", 50, 50);
	}
}
