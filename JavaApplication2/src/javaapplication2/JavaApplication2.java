/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
       System.out.print( "ingrese dos numeros" );
   int num1;
    int num2;
    num1=leer.nextByte();
    num2=leer.nextByte();
    int num3= num1+num2;
       System.out.print(num3 );
    }
    
}
