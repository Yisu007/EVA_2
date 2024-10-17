/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author Xxj53
 */
public class EVA2_NUMERO_MAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=0 ,acum=0, acum2 = 0;
        Scanner captu= new Scanner (System.in);
        
        do{
            
            if (num >acum ){
                  
                acum= acum2;
            }
        System.out.println("introduce un numero ");
        num=captu.nextInt();
        captu.nextLine();
        
            
        }while(num<-1 ||num  >-1);
        System.out.println("es el numero mas alto "+acum2);
    }

}
