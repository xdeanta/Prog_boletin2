/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;

import java.util.Scanner;

/**
 *
 * @author xavier
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int billete100, billete20, billete5, moneda, cantidad_i,cantidad_aux;
        Scanner sc;
        sc=new Scanner(System.in);
        System.out.println("Introduzca Importe:");
        cantidad_i=sc.nextInt();
        cantidad_aux=cantidad_i;
        billete100=cantidad_aux/100;
        cantidad_aux=cantidad_aux%100;
        billete20=cantidad_aux/20;
        cantidad_aux=cantidad_aux%20;
        billete5=cantidad_aux/5;
        moneda=cantidad_aux%5;
        System.out.println("El importe de " +cantidad_i +" euros equivale a:\n"+ "Billetes de 100: " +billete100 + "\nBilletes de 20: " +billete20 +"\nBilletes de 5: "+ billete5 +"\nMonedas: "+ moneda);
        
    }
    
}
