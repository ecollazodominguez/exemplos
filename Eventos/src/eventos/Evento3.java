/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Clase anonima
 * @author ecollazodominguez
 */
public class Evento3 extends JFrame{
       JPanel panel;
    JButton bVermello,bVerde,bAmarelo;
    
    public void crearVentana(){
        this.setTitle("*** EVENTOS ***");
        panel = new JPanel();
        bVermello = new JButton("vermello");
        bVerde = new JButton("verde");
        bAmarelo = new JButton("amarelo");
        this.setSize(400, 200);
        panel.add(bVermello);
        panel.add(bVerde);
        panel.add(bAmarelo);
        this.add(panel);
        //xestión de eventos
        bVermello.addActionListener(new ActionListener(){
            
            
            @Override
            public void actionPerformed(ActionEvent e) {
               panel.setBackground(Color.red);
            }    
            
            
        });
        
        bVerde.addActionListener(new ActionListener(){
            
            
            @Override
            public void actionPerformed(ActionEvent e) {
               panel.setBackground(Color.green);
            }    
            
            
        });
        
        bAmarelo.addActionListener(new ActionListener(){
            
            
            @Override
            public void actionPerformed(ActionEvent e) {
               panel.setBackground(Color.yellow);
            }    
            
            
        });
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
    } 
}
