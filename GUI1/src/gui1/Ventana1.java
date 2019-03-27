/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui1;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author ecollazodominguez
 */
public class Ventana1 {
    JFrame marco;
    JDialog ventanaSecun;
    
    public void crearVentana1(){
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Image icono = pantalla.getImage("/home/local/DANIELCASTELAO/ecollazodominguez/a.jpg");
        marco = new JFrame("pantalla 1");
        marco.setBounds(450, 250, 400, 200);
        //marco.setResizable(false);
       // marco.setExtendedState(JFrame.MAXIMIZED_BOTH);
        marco.setIconImage(icono);
        // creamos ventana secundaria JDialog
        ventanaSecun = new JDialog(marco); //asocio ao marco
        
        ventanaSecun.setBounds(450, 250, 300, 100);
        ventanaSecun.setVisible(true);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
