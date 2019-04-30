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
public class Local {
    private int a=7;
    public void metodo(){
        final int var= 5;
        class InternaLocal{
            final int var2 = 7;
            
            
            void amosar(){
                System.out.println("var --> "+var+" var2 --> " +var2+ " a--> "+a);
            }
        }
            InternaLocal in = new InternaLocal();
            in.amosar();
    }
}
