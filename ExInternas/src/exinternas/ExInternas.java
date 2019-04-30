/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exinternas;

/**
 *
 * @author ecollazodominguez
 */
public class ExInternas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AnidadaEstatica obxStatic = new AnidadaEstatica();
        obxStatic.verExterna();
        AnidadaEstatica.Interna obx = new AnidadaEstatica.Interna();
        obx.amosarInterna();
        
        Interna.Interna2 obx1 = new Interna().new Interna2();
        obx1.amosarInterna();
        
        Local l = new Local();
        l.metodo();
        
           Anónima ano = new Anónima();
          ano.Anónima();
          
          Lambda lam = new Lambda();
          lam.Lambda();
    }
    
    
}
