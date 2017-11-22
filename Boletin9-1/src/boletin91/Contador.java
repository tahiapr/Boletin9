/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin91;

import java.util.Scanner;

/**
 *
 * @author tperezrodriguez
 */
public class Contador {
    // Calcula a cantidade de números negativos, positivos e, ceros  que hai nun grupo de 10 numeros
    
    Scanner sc = new Scanner (System.in);
    public Contador (){
        
    }
    
    public void contarNum (){
        int contador=0, acumulaPosi=0, acumulaNega=0, acumulaCero=0;
       
        for (contador=0; contador<10; contador++){
            
            System.out.println("Ingresa un número positivo o negativo");
            int num = sc.nextInt();
            
            if (num == 0){
                acumulaCero++;
            }
            
            else if (num < 0){
                acumulaNega++;
            }
            
            else {
                acumulaPosi++;
            }
        }
        
        System.out.println("Hay "+ acumulaCero + " ceros. Hay " + acumulaNega + " número negativos. Hay " + acumulaPosi + " números positivos." );
    }
}
