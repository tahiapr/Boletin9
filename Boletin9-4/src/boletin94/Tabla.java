/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin94;

import java.util.Scanner;

/**
 *
 * @author tperezrodriguez
 */
public class Tabla {
    Scanner sc = new Scanner (System.in);
    
    public Tabla (){
        
    }
    
    public void crearTabla (){
      
        System.out.println("Teclee número");
        int num = sc.nextInt();
        
        do{
       int c;
       
       for (c=1; c<=10; c++){
        int resultado= num*c;   
        System.out.println(num+ " * "+c+ " = "+resultado);
       }  
       
       System.out.println("Teclee otro número");
       num = sc.nextInt();
       } while (num!=0);
    }
    
}
