/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_arreglos;

/**
 *
 * @author Xxj53
 */
public class EVA2_15_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //DECLARACION DE ARREGLO
        //los arreglos son objetos como los scanner 
        int[]arreglo =new int [10];//ocupa 40 bytes 
        // byte = 8 bits 
        //11111111= 255
        //manejo por indice 
        //primer elemento de un arreglo --->0
        arreglo [0]=100;
         arreglo [1]=200;
          arreglo [2]=300;
           arreglo [3]=400;
            arreglo [4]=500;
             arreglo [5]=600;
              arreglo [6]=700;
               arreglo [7]=800;
                arreglo [8]=900;
                 arreglo [9]=1000;
                //el ultimo elecemnto de un arreglo -->tamano -1   
                    
                
       //EL ACCESO SIEMPRE A LAS POSICIONES 
        System.out.println (arreglo[0]);
        System.out.println (arreglo[1]);
        System.out.println (arreglo[2]);
        System.out.println (arreglo[3]);
        System.out.println (arreglo[4]);
        System.out.println (arreglo[5]);
        System.out.println (arreglo[6]);
        System.out.println (arreglo[7]);
        System.out.println (arreglo[8]);
        System.out.println (arreglo[9]);
    }
    
}
