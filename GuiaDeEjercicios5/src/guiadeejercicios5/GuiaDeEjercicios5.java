
package guiadeejercicios5;

import java.util.Scanner;


public class GuiaDeEjercicios5 {


    public static void main(String[] args) {
        
        //Ejercicio 1
        /*
        int num = 1;
        while (num<11) {            
            System.out.println(num);
            num++;
        }
        */
        
        //Ejercicio 2
        /*
        int num = 10;
        while (num>=1) {            
            System.out.println(num);
            num--;
        }
        */
        
        //Ejercicio 3
        /*
        Scanner teclado = new Scanner(System.in);
        int edad = Integer.MAX_VALUE;
        int cont = 0;
        
        while (edad>=18) {  
        System.out.println("Ingrese la edad");
        edad = teclado.nextInt();
            cont++;
        }
        System.out.println("La cantidad de personas mayores a 18 son: " + (cont-1));
        */
        
        //Ejercicio 4
        /*
        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Ingresar el primer número: ");
        num1 = teclado.nextInt();
        System.out.println("Ingresar el segundo número: ");
        num2 = teclado.nextInt();
        
        if (num1>num2) {
            while (num1!=num2) {                
                num1--;
                System.out.println(num1);         
            }
        } else{
            while (num2!=num1) {                
                num2--;
                System.out.println(num2);
            }
        }
        */
        
        //Ejercicio 5
        /*
        int num = -5;
        
        while (num<100) {            
            num += 5;
            System.out.println(num);
        }
        */
        
        //Ejercicio 6
        /*
        Scanner Scanner = new Scanner(System.in);
        int num;
        
        System.out.println("Ingresa un número");
        num = Scanner.nextInt();
        
        boolean esPrimo = true;
        
        if (num <= 1) {
            esPrimo = false;
        } else {
            int divisor = 2;
            while (divisor <= Math.sqrt(num)) {                
                if (num % divisor == 0) {
                    esPrimo = false;
                    break;
                }
                divisor++;
            }
        }
        
        if (esPrimo) {
            System.out.println(num + " es un número primo.");
        } else {
            System.out.println(num + " no es un número primo.");
        }
        */
        
        
        //Ejercicio 7
        /*
        Scanner teclado = new Scanner(System.in);
        
        int num;
        int max = Integer.MIN_VALUE;
        int posMax = -1;
        int pos = 0;
        
        System.out.println("Ingresa una lista de números. Para cortar ingresa cero");
        
        do {
            System.out.println("Ingresa un número");
            num = teclado.nextInt();
            
            if (num!=0) {
                pos++;
                if (num>max) {
                    max = num;
                    posMax = pos;
                }
            }
            
        } while (num!=0);
        
        if (posMax != -1) {
            System.out.println("El máximo ingresado es: " + max);
            System.out.println("Fue ingresado en la posición: " + posMax);
        } else {
            System.out.println("No se ingresaron números distintos de cero.");
        }
        */
        
        
        //Ejercicio 8
        //Ejercicio 9
        //Ejercicio 10
        //Ejercicio 11
        
        
    }
    
}
