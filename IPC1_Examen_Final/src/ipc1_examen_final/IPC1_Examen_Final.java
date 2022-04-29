/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ipc1_examen_final;

import java.util.Scanner;

/**
 *
 * @author alvar
 */
public class IPC1_Examen_Final {

    public static Scanner sn= new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         menu();
        
    }
    
    public static void menu(){
        
    //Declaracion de variables
        int opcion;
        
        boolean salir=false;
        
        while(!salir){
        
        //Menu
        System.out.println("++++++EXAMEN FINAL+++++++++");
        System.out.println("+ 1. Problema 1           +");
        System.out.println("+ 2. Problema 2           +");
        System.out.println("+ 3. Problema 3           +");
        System.out.println("+ 4. Salir                +");
        System.out.println("+ Ingrese una opción      +");
        System.out.println("+++++++++++++++++++++++++++");
        opcion=sn.nextInt();
        
        
        switch(opcion){
            case 1 -> {
                    Problema1();  
                    System.out.println("");
                }
           
            case 2 -> {
                    Problema2();
                    System.out.println("");
                    menu();
                    }
                    
            case 3 -> {
                    Problema3();
                    System.out.println("");
                    menu();
                    }   
            
            case 4 ->{
            
                System.out.println("Adiós");
                System.exit(0);
                //salir=true;
            }
            default -> { System.out.println("Esa no es una opción"); 
                         menu();}
        }      
        } 
    }
    
    public static void Problema1(){
    
    }
    
    public static void Problema2(){
    
    }
    
    public static void Problema3(){
    
    }
}
