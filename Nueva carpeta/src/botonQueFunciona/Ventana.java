package botonQueFunciona;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;





public class Ventana extends JFrame  {

	/**
	 * SERIAL
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * creacion de la ventana
	 */
	public Ventana() {
		super("captura");
		// creacion de toolkit para el tamaño y la imagen
		Toolkit cajita = Toolkit.getDefaultToolkit();
		// la ventana se siturara en un cuarto del alto y un cuarto del ancho
		setLocation((int)cajita.getScreenSize().getWidth()/4, (int)cajita.getScreenSize().getHeight()/4); 
		setSize(400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		imagen(cajita);
		panelUno paneluno = new panelUno();
		add(paneluno);
		setResizable(false);
	}
	/**
	 * metodo que sirve para cambiar la imagen de la ventan
	 * @param cajita
	 */
	private void imagen(Toolkit cajita) {
		Image imagen =  cajita.getImage("c:/ficheros/iconoChachi.png");
		setIconImage(imagen);
	}
	
}
class panelUno extends JPanel implements ActionListener{
	// elementos
	JButton botonUno;
	JTextField texto1;
	JLabel etiquetaUno;
	/**
	 * SERIAL
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * creacion del panel 1
	 */
	public panelUno() {
		super();
		// instanciacion del boton annadirlo
		botonUno = new JButton("BOTON!");
		add(botonUno);
		// preparacion del boton para SER ESCUCHADO
		botonUno.addActionListener(this);
		// instanciacion del texto
		texto1 = new JTextField("escribe aqui tu correo",20);
		add(texto1);
		// LISTENER
		texto1.addActionListener(this);
		etiquetaUno = new JLabel("");
		add(etiquetaUno);
		setVisible(true);
		addKeyListener(l);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// escuchando el caso que se pulse el boton o se use intro en el textbox
		if(e.getSource() == botonUno || e.getSource() == texto1) {
			etiquetaUno.setFont(new Font("arial", Font.PLAIN, 20));
			etiquetaUno.setText(texto1.getText() + " que texto mas mariquita");
		}
	}
	
	
}
