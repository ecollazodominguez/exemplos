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
public class AnidadaEstatica {
    static int extStatic = 20;
    private int externa = 19;
    
    public static class Interna{
        
        int interna = 4;
        
        public void amosarInterna(){
            System.out.println("extStatic -> "+extStatic);
//            System.out.println("externa --> "+ externa);
            System.out.println("interna ---> "+ interna);
        }
    }

public void verExterna(){
Interna obx = new Interna();
obx.amosarInterna();
}

}
