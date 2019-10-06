/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_4;

import java.util.Scanner;

/**
 *
 * @author xavier
 */
public class Boletin1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float x,y, suma, resta, mult, div;
        Scanner sc;
        sc=new Scanner(System.in);
        System.out.println("Introduzca 2 valores:");
        x=sc.nextFloat();
        y=sc.nextFloat();
        suma=x+y;
        resta=x-y;
        mult=x*y;
        div=x/y;
        System.out.println("Suma: " +suma);
        System.out.println("Resta: " +resta);
        System.out.println("Multiplicacion: " +mult);
        if(y!=0){
            System.out.println("Cociente: " +div);
        }else{
            System.out.println("no se puede dividir entre 0");
        }
        
    }
    
}
