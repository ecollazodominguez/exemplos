/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exlambda;

/**
 *
 * @author ecollazodominguez
 */
public class Metodos {
    public void crearLambda(){
        IOperable op = new IOperable() {
            @Override
            public double operacion(double a, double b) {
                return (a+b);
            }
        };
        // con expresion lambda
        IOperable op2= (double a, double b)->{return (a+b);};
        IOperable op3= (double a, double b)->{return (a*b);};
        
        
        
        op2.amosar();
        System.out.println("operacion -> "+op2.operacion(5, 10));
        System.out.println("operacion -> "+op3.operacion(3, -4));
    }
}
