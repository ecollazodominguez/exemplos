/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylistobxecto;

import Utilidades.PedirDatos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 *
 * @author ecollazodominguez
 */
public class ExemploArrayListObxecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Alumno> lista = new ArrayList<>();
        Metodos obx = new Metodos();
        String op;
        do {
            op = PedirDatos.string("****MENU****"
                    + "\nEngadir"
                    + "\nVer"
                    + "\nBorrar"
                    + "\nBaixa"
                    + "\nOrdenar"
                    + "\nBuscar");
            switch (op) {
                case "Engadir":
                    obx.engadir(lista);
                    break;
                case "Ver":
                    obx.verForEach(lista);
                    System.out.println("\n\n");
                    obx.forIterator(lista);
                    break;
                case "Borrar":
                    obx.borrarPorDni(PedirDatos.string("dni"), lista);
                    break;
                case "Baixa":
                    obx.borrarPosicion(PedirDatos.enteiro("Posicion") - 1, lista);
                    break;
                case "Ordenar":
                    Collections.sort(lista);
                    break;
                case "Buscar":
                    obx.buscar(PedirDatos.string("dni"), lista);
                    break;
            }
        } while (!"Sair".equalsIgnoreCase(op));
    }
}
