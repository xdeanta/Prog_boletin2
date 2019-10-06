/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_3;

import java.util.Scanner;

/**
 *
 * @author xavier
 */
public class Boletin1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float euros, dolares, cambio;
        Scanner sc;
        sc=new Scanner(System.in);
        System.out.println("Introduzca el importe en euros:");
        euros=sc.nextFloat();
        System.out.println("Introduzca la tasa de cambio:");
        cambio=sc.nextFloat();
        dolares=euros*cambio;
        System.out.println("El equivalente de " +euros + " euros son " +dolares +" dolares");
    }
    
}
