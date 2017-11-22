
package boletin93;

import java.util.Scanner;


public class Area {
    
    public Area (){
        
    }
    
    // Implementa un programa que calcule o área dun rectángulo cuxa base e altura pides por teclado . 
    //Asegurate que estos valores sexan positivos , para eso valida os datos.
    
    Comprobar comp = new Comprobar();
    
    public int calcularArea (){
        
        return comp.comprobarAltura() * comp.comprobarBase();
            
    }
    
}
