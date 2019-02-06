/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylist;

import Utilidades.PedirDatos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ecollazodominguez
 */
public class ExemploArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ArrayList lista = new ArrayList();
//        lista.add("aaaaa");
//        lista.add(new Integer(2));
//        lista.add(4);
//        for(int i =0;i<lista.size();i++)
//            System.out.println(lista.get(i));
//    }

        ArrayList<Integer> lista = new ArrayList<>();
        int opcion;
        metodos obx = new metodos();
        do{
            System.out.println("****MENU****"
                               +"\n1-> engadir elemento"
                               +"\n2-> amosar"
                               +"\n3-> borrar por posición"
                               +"\n4-> borrar el elemento"
                               +"\n5-> Actualizar valor"
                               +"\n6-> saír");
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Teclea opción"));
            switch(opcion){
                case 1:
                    obx.engadir(lista);
                    break;
                case 2: 
                    obx.amosarFor(lista);
                    obx.amosarForEach(lista);
                    obx.amosarIterator(lista);
                    break;
                case 3:
                    obx.borrarPosicion(PedirDatos.enteiro("Teclea a posición a borrar")-1, lista);
                    break;
                case 4:
                    obx.borrarElemento(4, lista);
                    break;
                case 5:
                    obx.actualizarValor(PedirDatos.enteiro("Teclea a posición"), PedirDatos.enteiro("Teclea o valor novo"), lista);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Teclea opción entre 1 e 6");
            }
        }while (opcion <6);
    }
    
}
