package botones;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class Panel1 extends JPanel {

	
	private static final long serialVersionUID = 1L;
	
	public Panel1() {
		super();
		setVisible(true);
		setLayout(null);
		// creacion de agrupamiento
		ButtonGroup radio = new ButtonGroup();
		// creacion de botones
		JRadioButton marcs[] = new JRadioButton[3];
		// instanciacion
		Font fuente = new Font("Times new roman",Font.BOLD , 12);
		int x = 50 ,y = 30;
		JLabel etiqueta = new JLabel("seleccione algo pls");
		etiqueta.setBounds(50, y, 120, 20);
		etiqueta.setFont(fuente);
		y += 20;
		marcs[0] = new JRadioButton("hola que tal",true);
		marcs[0].setBounds(x,y,100,20);
		y += 20;
		marcs[1] = new JRadioButton("adios feo");
		marcs[1].setBounds(x,y,100,20);
		y += 20;
		marcs[2] = new JRadioButton("patata");
		marcs[2].setBounds(x,y,100,20);
		y += 20;
		// seccion para check box
		JLabel etiqueta2 = new JLabel("Puede seleccionar varios");
		etiqueta.setBounds(50, y, 120, 20);
		etiqueta.setFont(fuente);
		y += 20;
		JCheckBox tick[] = new JCheckBox[3];
		// isntanciacion
		tick[0] = new JCheckBox("windows (caca)");
		tick[0].setBounds(x,y,100,20);
		y += 20;
		tick[1] = new JCheckBox("puaj mac");
		tick[1].setBounds(x,y,100,20);
		y += 20;
		tick[2] = new JCheckBox("LINUXXX");
		tick[2].setBounds(x,y,100,20);
		y += 20;
		// introduccion

		radio.add(marcs[0]);
		radio.add(marcs[1]);
		radio.add(marcs[2]);
		
		// botonico
		add(etiqueta);
		add(marcs[0]);
		add(marcs[1]);
		add(marcs[2]);
		// check
		add(etiqueta2);
		add(tick[0]);
		add(tick[1]);
		add(tick[2]);
	}
}
