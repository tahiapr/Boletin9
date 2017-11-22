/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin92;

import java.util.Scanner;

/**
 *
 * @author tperezrodriguez
 */
public class Calcular {
    
    Scanner sc = new Scanner (System.in);
    
    public Calcular (){
        
    }
    
    public int calcularSuma() {
     
        int acumulaSuma = 0;
        
         for(int a=10;a<=90;a++){
           acumulaSuma= acumulaSuma + a;
        }
        return acumulaSuma; 
    }
    
      public double calcularProducto() {
      double acumulaProducto=1;
       
         for(double a=10;a<=90;a++){
            acumulaProducto= acumulaProducto * a;
        }
        return acumulaProducto;
         
    }
   
}
