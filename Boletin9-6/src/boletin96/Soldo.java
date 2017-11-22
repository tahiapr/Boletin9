/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin96;

import java.util.Scanner;

/**
 *
 * @author tperezrodriguez
 */
public class Soldo {
    
    public Soldo (){
        
    }
    
    Scanner sc = new Scanner(System.in);
    
    public void saberSoldo(){
        double suma1=0, suma2=0, porcentaje=0;
        
        System.out.println("¿Cuál es el sueldo del trabajador?");
        double sueldo = sc.nextDouble();
        
        do{
           if (sueldo<0){
                System.out.println("No puede haber sueldos negativos");
           }
           else {
               if (sueldo>=1000 && sueldo<=1750){
                   suma1++;
                   System.out.println("¿Cuál es el sueldo del trabajador?");
                    sueldo = sc.nextDouble();
        
               }
              
               else {
                   suma2++;   
                   porcentaje= (suma2*100)/(suma1+suma2);
                    System.out.println("¿Cuál es el sueldo del trabajador?");
                    sueldo = sc.nextDouble();
               }

           }
               
        } while (sueldo!=0);
        
        
        System.out.println("Hay "+ suma1 +" trabajadores que ganan entre 1000 y 1750 euros. Y hay un porcentaje de "+ porcentaje +" de trabajadores que ganan menos de 1000");
    }
}
