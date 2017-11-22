
package boletin95;

import java.util.Scanner;


public class Elemento {
   
            Scanner sc = new Scanner (System.in);
            
    public Elemento(){
        
    }
    
    public void pedirElementoA (){
        System.out.println("Escribe un número");
        int num = sc.nextInt();
        int c,  resultado;
        
       for (c=1; c<=num; c++){
       resultado=c*2;   
       System.out.println(resultado);
       }
    }
    
    public void pedirElementoB(){
        System.out.println("Escribe un número");
        int num = sc.nextInt();
        int c;
        
        for (c=1;c<=num; c++){
            
            if (c%2==0){
            System.out.println("+ "+c); 
            }
            else {
            System.out.println("- "+c);
            }
         }
    }
    
    public void pedirElementoC(){
         System.out.println("Escribe un número");
        int num = sc.nextInt();
        int c, n1=0, n2=1, resultado;
        
        System.out.println(n1 + "\n" +n2);
        for(c=3; c<=num;c++){
        resultado= n1+n2;
        n1=n2;
        n2=resultado;
        System.out.println(resultado);
        }
    }
    

}
    

