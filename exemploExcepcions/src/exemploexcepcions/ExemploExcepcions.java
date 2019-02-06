/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploexcepcions;

import javax.swing.JOptionPane;

/**
 *
 * @author ecollazodominguez
 */
public class ExemploExcepcions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numerador;
        int denominador;
        int cociente = 0;
        int resultado;
        try{
            numerador = Integer.parseInt(JOptionPane.showInputDialog(null, "Numerador"));
            denominador = Integer.parseInt(JOptionPane.showInputDialog(null, "Denominador"));
            cociente = numerador/denominador;
        } catch (NumberFormatException | ArithmeticException ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }

    }
    
}
