/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_5;

import java.util.Scanner;

/**
 *
 * @author xavier
 */
public class Boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float sueldo_f, importeTotal, distRecorrida, diasTrabajados, sueldoB, sueldoL;
        Scanner sc;
        sc=new Scanner(System.in);
        System.out.println("Introduzca sueldo fijo:");
        sueldo_f=sc.nextFloat();
        System.out.println("Introduzca Importe total de ventas:");
        importeTotal=sc.nextFloat();
        System.out.println("Introduzca Distancia Recorrida en Km:");
        distRecorrida=sc.nextFloat();
        System.out.println("Dias Trabajados:");
        diasTrabajados=sc.nextFloat();
        sueldoB=sueldo_f+(0.05f*importeTotal)+(2f*distRecorrida)+(30f*diasTrabajados);
        sueldoL=sueldoB-(sueldoB*0.18f)-36;
        System.out.println("El sueldo bruto es:" +sueldoB + "\nEl Sueldo liquido es:" +sueldoL);
        
    }
    
}
