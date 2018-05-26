package ejercicioClase;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * clase para crear una ventana
 * @author liken
 *
 */
public class Ventana2 extends JFrame {
	
	/**
	 * SERIAL
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * constructor inicializador
	 */
	public Ventana2() {
		super("ventana");
		
		Toolkit cajita = Toolkit.getDefaultToolkit();
		// tamanno y posicion
		 setSize((int)cajita.getScreenSize().getWidth()/4, (int) cajita.getScreenSize().getHeight()/2);
		 setLocation((int)cajita.getScreenSize().getHeight()/2,(int)cajita.getScreenSize().getWidth()/3);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Panel1 panel1 = new Panel1();
		add(panel1,BorderLayout.CENTER);
		
		
	}
}
class Panel1 extends JPanel implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton calcular;
	JButton configurar;
	JLabel etiquetas[] = new JLabel[4];
	JTextField textos[] = new JTextField[3];
	public Panel1(){
		super();
		setLayout(null);
//		setBackground(Color.BLUE);
		// referencia posicionamiento
		int x = 50 , y = 20;
		// definicion de las etiquetas y textos
		etiquetas[0] = new JLabel("unidades");
		etiquetas[1] = new JLabel("pagado");
		etiquetas[2] = new JLabel("a pagar");
		// formateo de las etiquetas
		for (int i = 0; i < 3; i++) {
			 etiquetas[i].setFont(new Font("Arial", Font.PLAIN, 12));
			 etiquetas[i].setLocation(x, y);
			 etiquetas[i].setSize(70,20);
			 y+=20;
			 add(etiquetas[i]);
		}
		// preparacion posicion
		x += 70;
		y = 20;
		// introduccion de cajas de texto
		for (int i = 0; i < 3; i++) {
			textos[i] = new JTextField();
			
			textos[i].setLocation(x, y);
			 textos[i].setSize(70,20);
			 y+=20;
			 add(textos[i]);
		}
		// annadiendo texto resultado
		etiquetas[3] = new JLabel();
		etiquetas[3].setLocation(x, y+100);
		etiquetas[3].setSize(100,20);
		etiquetas[3].setFont(new Font("Arial", Font.BOLD, 20));
		etiquetas[3].setText("resultado");
		add(etiquetas[3]);
		// annadiendo boton
		calcular = new JButton("calcular");
		calcular.setSize(100,20);
		calcular.addActionListener(this);
		calcular.setLocation(50, 250);
		add(calcular);
		setVisible(true);
	}
	private void calculo() {
		try {
			String unidad = textos[0].getText();
			double pagado = Double.parseDouble(textos[1].getText());
			double aPagar = Double.parseDouble(textos[2].getText());
			etiquetas[3].setText("" + (pagado - aPagar) + " "+ unidad);
		}catch (Exception e) {
			e.printStackTrace();
			etiquetas[3].setText("ERROR");
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == calcular) {
			calculo();
		}
		
	}
}
