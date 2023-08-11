
package guiadeejercicios1;

import java.util.Scanner;


public class GuiaDeEjercicios1 {

    
    public static void main(String[] args) {
        
        //Ejercicio 2
        /*Hacer un programa para solicitar por teclado un número y luego devolver su
        valor elevado al cubo.
        Nota: no olvides que sólo contamos con las cuatro operaciones básicas.*/
       
        //Resolución
        /*
        int num;
        System.out.println("Ingrese un número");
        Scanner teclado = new Scanner(System.in);
        num = teclado.nextInt();
        int cubo = (num * num * num);
        
        System.out.println("El número elevado al cubo es: " + cubo);
        */
        
        
        // Ejercicio 3
        
        /*
        Hacer un programa que permita ingresar el año actual y el año de la fecha de nacimiento
        de una persona y luego calcule y emita por pantalla su edad. 
        */
        
        //Resolución
        /*
        int anioActual;
        int anioNac;
        System.out.println("Ingrese el año actual");
        Scanner tecladoAnio = new Scanner(System.in);
        anioActual = tecladoAnio.nextInt();
        System.out.println("Ingrese el año de su nacimiento");
        Scanner tecladoNac = new Scanner(System.in);
        anioNac = tecladoNac.nextInt();
        
        int edad = anioActual - anioNac;
        
        System.out.println("Su edad es: " + edad);
        */
        
    }
    
}
