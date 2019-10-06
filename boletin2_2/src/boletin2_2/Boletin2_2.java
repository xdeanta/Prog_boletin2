/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_2;

import java.util.Scanner;

/**
 *
 * @author xavier
 */
public class Boletin2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float gradosC, gradosK, gradosF;
        Scanner sc;
        sc=new Scanner(System.in);
        System.out.println("Introduzca temperatura en grados Celsius:");
        gradosC=sc.nextFloat();
        gradosK=gradosC + 273;
        gradosF=gradosC*9/5 + 32;
        System.out.println(gradosC + " grados celsius equivalen a:\n" + gradosK +" grados Kelvin\n" + gradosF + " grados Fahrenheit");
    }
    
}
