/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_acceso.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author Xxj53
 */
public class Eva2_9_accesoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usua="",contra="";
                 
        Scanner captu=new Scanner(System.in);
      System.out.print("bievenido ");
       
       
        //pantalla de validacion
     while(!(usua.equals("admin")&& contra.equals("1234")));{
        System.out.println("usuario");
        usua=captu.nextLine();
        System.out.println("contrasena ");

        contra=captu.nextLine();
    }
        //!--> operador logico de negacion ;not 
        
    
        //programa principal
        
        System.out.println("programa principal");
    }
    
    
}
