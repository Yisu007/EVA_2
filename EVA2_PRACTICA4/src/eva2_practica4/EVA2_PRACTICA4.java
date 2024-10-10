/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica4;

import java.util.Scanner;

/**
 *
 * @author Xxj53
 */
public class EVA2_PRACTICA4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1;
        String acum=" ";
                Scanner captu=new Scanner(System.in);
                System.out.println("captura el numero que se va a repetir ");
                num1=captu.nextInt();
                captu.nextLine();
                
                
                
                
                
                for(int i=1;i<=num1;i++){
                    acum=acum+"*";
                    System.out.println( acum);
    }
    
    }
}
