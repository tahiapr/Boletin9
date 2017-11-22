/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin92;

/**
 *
 * @author tperezrodriguez
 */
public class Boletin92 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Calcular cal = new Calcular();
        
        System.out.println("La suma es "+cal.calcularSuma());
        System.out.println("El producto es "+cal.calcularProducto());
    }
    
}
