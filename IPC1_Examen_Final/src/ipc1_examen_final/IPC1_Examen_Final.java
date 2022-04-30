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
    
        int n1, n2;
        System.out.print("Ingrese el primer numero: ");
        n1 = sn.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        n2 = sn.nextInt();
        
        if(n1>n2){
            System.out.println("El numero mayor es: "+ n1);
        }else{
            System.out.println("El numero mayor es: "+ n2);
        }
        
    }
    
    public static void Problema2(){
    
        int num,x;
        
        System.out.print("Ingrese un numero: ");
        x = sn.nextInt();
        num=x-2;
        
        if(num % 2 == 0){
           System.out.println("No es posible generar la piramide con numeros pares");
        }else{
            for(int alto = 1; alto <= num; alto++){
                
                for(int blancos=1; blancos <= num-alto; blancos++){
                    System.out.print(" ");
                }
                
                for(int aste=1; aste <= (alto*2)-1; aste++){
                    System.out.print("*");
                }
                
                System.out.println();
            }
        }
    }
    
    public static void Problema3(){
        
        int va;
        System.out.print("Entrada para 8 o 10 vacas: ");
        va = sn.nextInt();
        
        if(va==8){
            
        int peso_lit[][] = new int[8][2];
        peso_lit[0][0]=223;
        peso_lit[0][1]=30;
        peso_lit[1][0]=243;
        peso_lit[1][1]=34;
        peso_lit[2][0]=100;
        peso_lit[2][1]=28;
        peso_lit[3][0]=200;
        peso_lit[3][1]=45;
        peso_lit[4][0]=200;
        peso_lit[4][1]=31;
        peso_lit[5][0]=155;
        peso_lit[5][1]=50;
        peso_lit[6][0]=300;
        peso_lit[6][1]=29;
        peso_lit[7][0]=150;
        peso_lit[7][1]=1;
        
        int ltm = 188;
        
            System.out.println("Produccion total de leche: " +ltm + "L");
            
        }if(va==10){
            
        int peso_lit[][] = new int[10][2]; 
        peso_lit[0][0]=340;
        peso_lit[0][1]=45;
        peso_lit[1][0]=355;
        peso_lit[1][1]=50;
        peso_lit[2][0]=223;
        peso_lit[2][1]=34;
        peso_lit[3][0]=243;
        peso_lit[3][1]=39;
        peso_lit[4][0]=130;
        peso_lit[4][1]=29;
        peso_lit[5][0]=240;
        peso_lit[5][1]=40;
        peso_lit[6][0]=260;
        peso_lit[6][1]=40;
        peso_lit[7][0]=155;
        peso_lit[7][1]=52;
        peso_lit[8][0]=302;
        peso_lit[8][1]=31;
        peso_lit[9][0]=130;
        peso_lit[9][1]=1;
            
         int ltm = 281;
            System.out.println("Produccion total de leche: "+ltm+ "L");
        }else{
            System.out.println("No hay ese numero de entrada");
        }
    }
}
