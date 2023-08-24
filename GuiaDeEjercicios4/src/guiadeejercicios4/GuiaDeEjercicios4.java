
package guiadeejercicios4;

import com.sun.source.tree.BreakTree;
import java.util.Scanner;


public class GuiaDeEjercicios4 {


    public static void main(String[] args) {
        
        //Guía de Ejercicios CICLO FOR
        
        //Ejercicio 1
        /*
        Hacer un programa que solicite el ingreso de 10 números y que muestre el 
        mayor de ellos por pantalla. Solo se debe emitir UN valor por pantalla. 
        */
        //Resolución
        /*
        Scanner teclado = new Scanner(System.in);
        int num; 
        int mayor = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresar un número: ");
            num = teclado.nextInt();
            
            if (num>mayor) {
                mayor = num;
            }
        }
        System.out.println("El mayor es: " + mayor);
        */
        
        
        //Ejercicio 2
        /*
        Hacer un programa que solicite 10 números y calcule y emita por pantalla 
        cuántos son positivos (mayores a cero). Se debe mostrar un solo valor: el 
        conteo final
        */
        //Resolución
        /*
        Scanner teclado = new Scanner(System.in);
        int num;
        int cont = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un número");
            num = teclado.nextInt();
            
            if (num>0) {
                cont++;
            }
        }
        System.out.println("La cantidad de números positivos ingresados fue: " + cont);
        */
        
        
        //Ejercicio 3
        /*
        Hacer un programa para mostrar los números del 1 al 10. No se debe realizar 
        ningún pedido de datos.
        */
        //Resolución
        /*
        for (int i = 0; i < 10; i++) {
            System.out.println(i+1);
        }
        */
        
        
        //Ejercicio 4
        /*
        Hacer un programa para mostrar los números del 10 al 1. No se debe realizar 
        ningún pedido de datos
        */
        //Resolución
        /*
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        */
        
        
        //Ejercicio 5
        /*
        Hacer un programa que muestre los números del 1 al 100 de 5 en 5. Ejemplo: 
        0, 5, 10, 15, 20…. 100
        */
        //Resolución
        /*
        for (int i = 0; i < 101; i+=5) {
            System.out.println(i);
        }
        */
        
        
        //Ejercicio 6
        /*
        Hacer un programa que solicite UN número y luego calcule y emita un cartel 
        aclaratorio si el mismo es primo o no es primo. 
        Nota: un numero es primo cuando es divisible únicamente por 1 y por sí 
        mismo
        */
        //Resolución
        /*
        Scanner teclado = new Scanner(System.in);
        double num;
        int cont = 0;
        
        System.out.println("Ingrese el número: ");
        num = teclado.nextDouble();
        
        for (int i = 1; i <= num; i++) {
            if (num%i==0) {
                cont++;
            }
        }
        
        if (cont==2) {
            System.out.println("Es primo");
        } else {System.out.println("No es primo");}
        */
        
        
        //Ejercicio 7
        /*
        Hacer un programa que solicite 10 números y luego mostrar por pantalla el 
        máximo de ellos y la posición en la que fue ingresado
        */
        //Resolución
        /*
        Scanner teclado = new Scanner(System.in);
        int num;
        int posicion = 0;
        int mayor = 0;
        
        System.out.println("Ingrese los 10 numeros: ");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un número: ");
            num = teclado.nextInt();
            if (num>mayor) {
                mayor = num;
                posicion = i + 1;
            }
        }
        
        System.out.println("El mayor es: " + mayor + " en la posición: " + posicion);
        */
        
        
        //Ejercicio 8
        /*
        Hacer un programa que solicite 10 números y luego mostrar por pantalla el 
        menor de ellos y la posición en la que fue encontrado
        */
        //Resolución
        /*
        Scanner teclado = new Scanner(System.in);
        int num;
        int posicion = 0;
        int menor = Integer.MAX_VALUE;
        
        System.out.println("Ingrese los 10 numeros: ");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un número: ");
            num = teclado.nextInt();
            if (num<menor) {
                menor = num;
                posicion = i + 1;
            }
        }
        
        System.out.println("El menor es: " + menor + " en la posición: " + posicion);
        */
        
        
        //Ejercicio 9
        /*
        Hacer un programa que solicite 10 edades y luego calcule el promedio de edad 
        de aquellas personas mayores a 18 años
        */
        //Resolución
        /*
        Scanner teclado = new Scanner(System.in);
        int edad;
        double promedio;
        int cont = 0;
        int sumaEdades = 0;
        
        System.out.println("Ingrese las diez edades: ");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese la edad: ");
            edad = teclado.nextInt();
            
            if (edad>=18) {
                cont++;
                sumaEdades += edad;
            }
        }
        
        promedio = sumaEdades / cont;
        
        System.out.println("El promedio de edad de las personas mayores a 18 es: " + promedio);
        */
        
        
        //Ejercicio 10
        /*
        Hacer un programa que solicite 10 números y luego emitir por pantalla el 
        máximo de los números pares y el mínimo de los números impares
        */
        //Resolución
        /*
        Scanner teclado = new Scanner(System.in);
        int num;
        int mayPar = 0;
        int menInpar = Integer.MAX_VALUE;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un número");
            num = teclado.nextInt();
            if (num%2==0) {
                if (num>mayPar) {
                    mayPar = num;
                }
            } else{
                if (num<menInpar) {
                    menInpar = num;
                }
            }
        }
   
        System.out.println("El máximo de los pares es: " + mayPar);
        System.out.println("El menor de los impares es: " + menInpar);
        */
        
        
        //Ejercicio 11
        /*
        Hacer un programa para ingresar 10 números y luego calcule y emita el mayor 
        de los primos de la lista. En caso de no haber ningún número primo, deberá 
        aclararlo con un cartel
        */
        
        
    }
    
}
