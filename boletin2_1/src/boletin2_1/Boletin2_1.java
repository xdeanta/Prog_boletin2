/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_1;

import java.util.Scanner;

/**
 *
 * @author xavier
 */
public class Boletin2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float precio_b, precio_p, porc_desc, diff;
        Scanner sc;
        sc=new Scanner(System.in);
        System.out.println("Introduzca el precio base:");
        precio_b=sc.nextFloat();
        System.out.println("Introduzca el precio pagado:");
        precio_p=sc.nextFloat();
        diff=precio_b-precio_p;
        porc_desc=diff*100/precio_b;
        System.out.println("El descuento fue de: " + porc_desc + " porciento");
    }
    
}
