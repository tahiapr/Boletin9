/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin93;

import java.util.Scanner;

/**
 *
 * @author tperezrodriguez
 */
public class Comprobar {
    
    Scanner sc = new Scanner (System.in);
    
    public Comprobar (){
        
    }
    
    public int comprobarBase(){
      
        System.out.println("Inserte una base");
        int base = sc.nextInt();
                
        while (base<0){
        System.out.println("No puede ser un número negativo. Inserte otro");
        base = sc.nextInt();
        }
    return base;
    }
    
    public int comprobarAltura(){
      
        System.out.println("Inserte una altura");
        int altura = sc.nextInt();
                
        while (altura<0){
        System.out.println("No puede ser un número negativo. Inserte otro");
        altura = sc.nextInt();
        }
    return altura;
    }
}
