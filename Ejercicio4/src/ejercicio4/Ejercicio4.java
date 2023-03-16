/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        //Se crea una variable scanner para leer los datos del usuario
    Scanner leer = new Scanner (System.in);
    // se crea una variable entero (int) que se utiliza para leer datos del usuario
    double C;
        C=0;
    // se crea una variable entero (int) que se utiliza para guardar el resultado
     double F;
    //muestra un mensaje por pantalla
    System.out.println("Ingrese un grado centígrado: ");
   // Leo el valor en la variable gradoC
        C=leer.nextInt();
        F= 32+((9*C)/5);
        //muestro un mensaje por pantalla
        System.out.println("El valor " + C + " en grados Fahrenheit es " + F);
        
    
    
    
    
    }
    
}
