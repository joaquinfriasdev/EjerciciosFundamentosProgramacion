
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
        /*
        Scanner teclado = new Scanner(System.in);
        int num;
        int menor = Integer.MAX_VALUE;
        int segundoMenor = Integer.MAX_VALUE;
        
        System.out.println("Ingrese la lista de números, Corta con cero.");
        num = teclado.nextInt();
        
        while (num!=0) {            
            if (num<menor) {
                segundoMenor = menor;
                menor = num;
            } else if (num<segundoMenor) {
                segundoMenor = num;
            }
            
            num = teclado.nextInt();
        }
        
        if (menor == Integer.MAX_VALUE) {
            System.out.println("No se ingresaron números");
        } else{
            System.out.println("El menor es : " + menor);
            if (segundoMenor==Integer.MAX_VALUE) {
                System.out.println("No hay segundo menor.");
            } else {
                System.out.println("El segundo menor es: " + segundoMenor);
            }
        }
        */
        
        
        //Ejercicio 9
        /*
        Scanner teclado = new Scanner(System.in);
        int num;
        int menor = Integer.MAX_VALUE;
        int segundoMenor = Integer.MAX_VALUE;
        int posicion = 0;
        int posMenor = 0;
        int posSegundo = 0;
        
        System.out.println("Ingrese la lista de números, Corta con cero.");
        num = teclado.nextInt();
        
        while (num!=0) {            
            if (num<menor) {
                segundoMenor = menor;
                menor = num;
                posMenor = posicion;
            } else if (num<segundoMenor) {
                segundoMenor = num;
                posSegundo = posMenor;
            }
            posicion++;
            num = teclado.nextInt();
        }
        
        if (menor == Integer.MAX_VALUE) {
            System.out.println("No se ingresaron números");
        } else{
            System.out.println("El menor es : " + menor + " y su posición es: " + (posMenor+1));
            if (segundoMenor==Integer.MAX_VALUE) {
                System.out.println("No hay segundo menor.");
            } else {
                System.out.println("El segundo menor es: " + segundoMenor + " y su posición es: " + (posSegundo+1));
            }
        }
        */
        
        
        //Ejercicio 10
        /*
        System.out.println("Ingrese una lista de números, ingrese cero para cortar");
        
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        int maxNeg = Integer.MIN_VALUE;
        int minPos = Integer.MAX_VALUE;
        
   
        while (num!=0) {            
            if (num<0 && num>maxNeg) {
                maxNeg = num;
            } else if (num>0 && num<minPos) {
                minPos = num;
            }
            System.out.println("Ingrese un número");
            num = teclado.nextInt();
        }
        
        if (maxNeg!=Integer.MIN_VALUE) {
            System.out.println("El máximo de los números negativos es: " + maxNeg);
        } else {
            System.out.println("No se ingresaron números negativos");
        }
        
        if (minPos!=Integer.MAX_VALUE) {
            System.out.println("El mínimo ded los números positivos es: " + minPos);
        } else {
            System.out.println("No se ingresaron números positivos");
        }
        */
        
        
        //Ejercicio 11
        /*
        System.out.println("Ingrese una lista de números, corta con cero.");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        int primos = 0;
        int pares = 0;
        int positivos = 0;
        int negativos = 0;
        
        while (num!=0) {            
            if (num>0) {
                positivos++;
                if (num%2==0) {
                    pares++;
                }
                
            } else{
                negativos++;
                if (num%2==0) {
                    pares++;
                }
            }
            
            if (esPrimo(num)) {
                primos++;
            }
            
            System.out.println("Ingrese un número");
            num = teclado.nextInt();
                
        }
               
        System.out.println("La cantidad de números primos es: " + primos);
        System.out.println("La cantidad de números pares es: " + pares);
        System.out.println("La cantidad de números positivos es: " + positivos);
        System.out.println("La cantidad de números negativos es: " + negativos);
       */ 
    }
    
           //Función para saber si un número es primo
        public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
