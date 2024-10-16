/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_variable;

import java.util.Scanner;

/**
 *
 * @author Xxj53
 */
public class EVA2_10_VARIABLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
         int semadia;
         
         
         Scanner captu= new Scanner (System.in);
         do{
         //validos -->1 al 7 
         //numeros no validos 0-1-2-3-4 o 8 9 10 11 12 seria dia <1(menor a 1)dia >7 (mayor a 7) 
         System.out.println("numero del 1 al 7");
         
         semadia= captu.nextInt();
         }while(semadia <1 || semadia >7);
         switch (semadia){
            
           
        case 1:
            System.out.println("domingo");
            break;
        case 2:
             System.out.println("lunes ");
             break;
        case 3:
             System.out.println("martes");
             break;
        case 4:
             System.out.println("miercoles");
             break;
        case 5 :
             System.out.println("jueves");
             break;
        case 6:
           
            System.out.println("viernes");
            break;
                  
        case 7:
            System.out.println("sabado");
            break;
        default:
            System.out.println("no valido el numero");    
    }
    }
    
}
