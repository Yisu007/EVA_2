/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_promedio;

import java.util.Scanner;

/**
 *
 * @author Xxj53
 */
public class EVA2_2_PROMEDIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa, acum;
        Scanner captu=new Scanner (System.in);
        
        acum= 0;
        for ( int i = 1; i<=20; i++){
        System.out.println("hola usuario ");
        System.out.println("introduce la calificacion #"+ i);
        califa = captu.nextInt();
        captu.nextLine();
        //ACUMULADOR 
        //UNA OPERACION PARA AADICIONAR VALORES 
        //int acum= 0;
        //acum= acumc+1;
        //acum= acumc+1; ahora  va a valer 2
        
                acum=acum + califa;
                System.out.println("acum ="+ acum/ 10.0);
                
                //ahora multiplicado 
        
    
        }
}
}