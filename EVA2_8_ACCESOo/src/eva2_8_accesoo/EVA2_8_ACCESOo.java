/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_accesoo;

import java.util.Scanner;

/**
 *
 * @author Xxj53
 */
public class EVA2_8_ACCESOo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        //pantalla de validacion usuario y contrasena
        //programa principal
        String usua, contra ;
        Scanner captu=new Scanner(System.in);
        System.out.println("bienvenido");
       
        //pantalla de validacion
        do{
        System.out.println("usuario");
        usua=captu.nextLine();
        System.out.println("contrasena ");

        contra=captu.nextLine();
        //!--> operador logico de negacion ;not 
        
        }while(!(usua.equals("admin")&& contra.equals("1234")));
        //programa principal
        
        System.out.println("programa principal");
    }
    
}
