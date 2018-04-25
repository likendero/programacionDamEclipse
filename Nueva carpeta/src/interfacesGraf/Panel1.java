package interfacesGraf;
import java.awt.BorderLayout;
import java.awt.Color;


import javax.swing.*;
public class Panel1 {
	 private JPanel panel;
	public Panel1() {
		panel = new JPanel();
		
		
		panel.setBackground(Color.blue);
		panel.setVisible(true);
//		BorderLayout lay = new BorderLayout();
//		panel.setLayout(lay);

		JButton boton = new JButton("hola");
		JButton boton2 = new JButton("hola");
		JButton boton3 = new JButton("hola");
		panel.add(boton);
		panel.add(boton2);
		panel.add(boton3);
		
	}
	public JPanel getPanel() {
		return panel;
	}
}
