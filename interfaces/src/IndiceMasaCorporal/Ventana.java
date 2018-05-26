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
package IndiceMasaCorporal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.colorchooser.AbstractColorChooserPanel;

/**
 *
 * @author liken
 */
public class Ventana extends JFrame implements ActionListener {

    JTextField altura;
    JTextField peso;
    JLabel resultado;
    JButton calcular;

    public Ventana() {
        super("indice Masa Corporal");
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        // tamanno
        setSize(400, 300);
        // posicion
        setLocation(200, 200);
        // caso de cierre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // paneles
        JPanel panelIntroduccion = panelIntro();
        JPanel panelResultado = panelbo();
        add(panelIntroduccion);
        add(panelResultado);
    }
    /**
     * metodo que define las caracteristicas del panel
     * @return 
     */
    private JPanel panelIntro() {
        JPanel panel = new JPanel();
        // declaracion de componentes
        altura = Elementos.AlturaYpeso();
        peso = Elementos.AlturaYpeso();
        
        JLabel etiquetaAltura = new JLabel("Altura");
        JLabel etiquetaPeso = new JLabel("Peso");
        // annadir compoentes
        panel.add(etiquetaAltura);
        panel.add(altura);
        panel.add(etiquetaPeso);
        panel.add(peso);
        return panel;
    }
    private JPanel panelbo(){
        JPanel panel = new JPanel();
        // compoenentes
        calcular = new JButton("calcular");
        calcular.addActionListener(this);
        resultado = new JLabel("Resultado");
        //add
        panel.add(calcular);
        panel.add(resultado);
        return panel;
        
    }
    private void calculo(){
        double auxAltura, auxPeso;
        try{
            auxAltura = Double.parseDouble(altura.getText());
            auxPeso = Double.parseDouble(peso.getText());
            resultado.setText("" + (auxPeso / Math.pow(auxAltura, 2)));
        }catch(NumberFormatException num){
            resultado.setText("error");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == calcular){
            calculo();
        }
    }
}
