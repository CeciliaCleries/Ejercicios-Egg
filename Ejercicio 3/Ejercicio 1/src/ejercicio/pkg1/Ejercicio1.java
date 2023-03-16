/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author CECILIA
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese dos numeros");
        int num1=leer.nextInt();
          int num2=leer.nextInt();
          int suma = num1+num2;
          System.out.println("la suma de los dos numeros es de " + suma);
    }
    
}
