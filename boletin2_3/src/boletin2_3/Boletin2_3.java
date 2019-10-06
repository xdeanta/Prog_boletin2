/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_3;

import java.util.Scanner;

/**
 *
 * @author xavier
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int billete100, billete20, billete5, moneda, cantidad;
        Scanner sc;
        sc=new Scanner(System.in);
        System.out.println("Introduzca Numero de billetes de 100 euros:");
        billete100=sc.nextInt();
        cantidad=billete100*100;
        System.out.println("Introduzca Numero de billetes de 20 euros:");
        billete20=sc.nextInt();
        cantidad=cantidad+(billete20*20);
        System.out.println("Introduzca Numero de billetes de 5 euros:");
        billete5=sc.nextInt();
        cantidad=cantidad+(billete5*5);
        System.out.println("Introduzca Numero de monedas de 1 euro:");
        moneda=sc.nextInt();
        cantidad=cantidad+moneda;
        System.out.println("El importe es de: " +cantidad + " euros");
        
    }
    
}
