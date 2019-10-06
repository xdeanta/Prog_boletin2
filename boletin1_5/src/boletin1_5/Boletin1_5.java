/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_5;

import java.util.Scanner;

/**
 *
 * @author xavier
 */
public class Boletin1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float millas, metros;
        Scanner sc;
        sc=new Scanner(System.in);
        System.out.println("Introduzca las millas marinas:");
        millas=sc.nextFloat();
        metros=millas*1852;
        System.out.println(millas + " Millas marinas son " +metros + " metros");
        
    }
    
}
