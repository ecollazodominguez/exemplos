/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui1;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ecollazodominguez
 */
public class Ventana3 extends JFrame{
    JPanel panel;
    public void crearVentana3(){
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Image icono = pantalla.getImage("/home/local/DANIELCASTELAO/ecollazodominguez/b.jpg");
        this.setSize(500, 300);
        this.setTitle("Ventana 2");
        this.setIconImage(icono);
        
        panel = new JPanel();
        panel.setBackground(Color.green);
        this.add(panel);
        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
