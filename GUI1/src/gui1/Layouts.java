/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui1;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author ecollazodominguez
 */
public class Layouts extends JFrame {

    JButton b1, b2, b3, b4, b5;
    JPanel panel;

    public void iniciarCom(){
        panel = new JPanel();
        b1 = new JButton("boton1");
        b2 = new JButton("boton2");
        b3 = new JButton("boton3");
        b4 = new JButton("boton4");
        b5 = new JButton("boton5");
        this.setTitle("Layout");
        //damoslle características
        this.setSize(600, 300);
        b1.setBackground(Color.white);
        b2.setBackground(Color.black);
        b3.setBackground(Color.white);
        b4.setBackground(Color.black);
        b5.setBackground(Color.white);
        b2.setForeground(Color.white);
        b4.setForeground(Color.white);
        
        
    }
    public void disFlowLayout() {
        iniciarCom();
        //layout
        panel.setLayout(new FlowLayout());
        //engadimos os compoñentes
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        this.add(panel);

        this.setVisible(true);
        this.setDefaultCloseOperation(3);
    }

    public void disBoxLayout() {
        iniciarCom();
        //layout
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        //engadimos os compoñentes
   
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        this.add(panel);
        
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
    }
    
    public void disBorderLayout() {
        iniciarCom();
        //layout
        panel.setLayout(new BorderLayout());
        //engadimos os compoñentes

        panel.add(b1, BorderLayout.EAST);
        panel.add(b2, BorderLayout.CENTER);
        panel.add(b3, BorderLayout.NORTH);
        panel.add(b4, BorderLayout.SOUTH);
        panel.add(b5, BorderLayout.WEST);
        this.add(panel);
                
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
    }
    
    public void disGridLayout() {
        iniciarCom();
        //layout
        panel.setLayout(new GridLayout());
        //engadimos os compoñentes
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        this.add(panel);
                
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
    }
}
