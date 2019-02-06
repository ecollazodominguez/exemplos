/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylist;

import Utilidades.PedirDatos;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ecollazodominguez
 */
public class metodos {
    
    public void engadir(ArrayList<Integer>lisNumeros){
        lisNumeros.add(PedirDatos.enteiro("numero: "));
    }
    
    public void amosarFor(ArrayList<Integer>lisNumeros){
        for(int i=0;i<lisNumeros.size();i++)
            System.out.println(lisNumeros.get(i));
    }
    
    public void amosarForEach(ArrayList<Integer>lisNumeros){
        for(Integer ele : lisNumeros)
            System.out.println(ele);
    }
    
    public void amosarIterator(ArrayList<Integer>lisNumeros){
        Iterator it= lisNumeros.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
    public int borrarPosicion(int posicion,ArrayList<Integer>lisNumeros){
        return lisNumeros.remove(posicion);
    }
    
    public void borrarElemento(Integer elemento,ArrayList<Integer>lisNumeros){
//        lisNumeros.remove(new Integer(elemento));
          lisNumeros.remove(elemento);
    }
    
    public void actualizarValor(int pos, Integer novo,ArrayList<Integer>lisNumeros){
        lisNumeros.set(pos-1,novo);
    }
}
