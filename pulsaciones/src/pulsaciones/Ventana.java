/*
 * Copyright (C) 2018 liken
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package pulsaciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author liken
 */
public class Ventana extends JFrame implements ActionListener{
    private JButton boton1,boton2;
    private static int contador1,contador2;
    private JLabel etiqueta1,etiqueta2;
    public Ventana(){
        super("pulsaciones");
        setSize(200,100);
        setLocation(200,200);
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // paneles contenenedores
        JPanel pSuperior = new JPanel();
        // panel superiror
        etiqueta1 = new JLabel("0");
        etiqueta2 = new JLabel("0");
        //ADDS panel superior
        pSuperior.add(new JLabel("boton1: "));
        pSuperior.add(etiqueta1);
        pSuperior.add(new JLabel("boton2: "));
        pSuperior.add(etiqueta2);
        // panel inferiror
        boton1 = new JButton("boton1");
        boton1.addActionListener(this);
        boton2 = new JButton("boton2");
        boton2.addActionListener(this);
        
        pInferior.add(boton1);
        pInferior.add(boton2);
        // annadir paneles
        add(pSuperior);
        add(pInferior);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // aumentar el texto del contador 1
        if(e.getSource() == boton1){
            etiqueta1.setText((++contador1) + "");
        }
        // aumentar el texto del contador 2
        if(e.getSource() == boton2){
            etiqueta2.setText((++contador2) + "");
        }
    }
    
}
