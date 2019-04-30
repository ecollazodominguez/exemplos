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
@FunctionalInterface
public interface IOperable {
    public abstract double operacion(double a, double b);
    default public void amosar(){
        System.out.println("mensaxe");
        } 
}
