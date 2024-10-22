/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_restaurantes;

import java.util.Scanner;

/**
 *
 * @author Xxj53
 */
public class EVA2_18_RESTAURANTES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String menu[]= {"dogos", "hamburguesa", "boneless"," tacos","montados",
            "camarones "};
        int precios []={50,80,120,150,70,200};
        Scanner captu= new Scanner(System.in);
        int cantidad, producto ;
        for (int i=0; i <menu.length;i++){
        System.out.println (i + "-" + menu [i] + " $" + precios[i]);
        }
        System.out.println("cual es tu orden? (introduce el numero del producto ");
        producto = captu.nextInt();
        captu.nextLine();
        System.out.println("cuantas ordenes");
        cantidad = captu.nextInt();
        captu.nextLine();
        System.out.println ("el costo total es = $" + cantidad * precios [producto] );
                
        
        
    }
    
    
}
