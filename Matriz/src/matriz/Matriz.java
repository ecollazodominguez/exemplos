/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

/**
 *
 * @author ecollazodominguez
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][]matriz = {{1,1,1},
                         {2,2,2},
                         {3,3,3}};
    
        Matriz2 ex = new Matriz2();
//        ex.creaArray();
        ex.pedirNotas();
        System.out.println("*****");
        ex.pedirNotas(matriz);
        System.out.println("*****");
        ex.calcularMedia();
        System.out.println("****");
        ex.calcularMediaM();
        System.out.println("*****");
        ex.ordenarMenorMayor();
                ex.amosarTodo();
    }
}

