
package Utilidades;

import javax.swing.JOptionPane;

/**
 *
 * @author ecollazodominguez
 */
public class PedirDatos {
    
    /**
     * Escribe por teclado un int que se devuelve
     * @param msg recibe un mensaje para mostrar
     * @return se devuelve el int escrito
     */
    public static int enteiro(String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
    
    /**
     * Escribe por teclado un String que se devuelve
     * @param msg recibe un mensaje para mostrar
     * @return se devuelve el String escrito
     */
    public static String string(String msg){
        return JOptionPane.showInputDialog(msg);
    }
}
