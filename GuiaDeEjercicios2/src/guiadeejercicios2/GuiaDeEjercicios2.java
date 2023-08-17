
package guiadeejercicios2;

import java.util.Scanner;


public class GuiaDeEjercicios2 {


    public static void main(String[] args) {
        
    //Ejercicio 1
    /*Hacer un programa para ingresar un número y luego se emita por pantalla un
    cartel aclaratorio si “Es mayor a 10” o “No es mayor a 10”.*/
    //Resolución
    /*
    int num;
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Ingrese el número");
    num = teclado.nextInt();
        if (num > 10) {
            System.out.println("Es mayor a 10");
        }else{
            System.out.println("No es mayor a 10");
        }
    */
    
    
    //Ejercicio 2
    /*Hacer un programa para ingresar dos números distintos y luego se muestre por
    pantalla el menor de ellos.
    Nota: no te olvides del ambiente ideal.*/
    //Resolución
    /*
    int num1, num2;
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Ingrese el primer numero");
    num1 = teclado.nextInt();
    System.out.println("Ingrese el segundo numero");
    num2 = teclado.nextInt();
    
        if (num1>num2) {
            System.out.println("El mayor es " + num1);
        }else{ System.out.println("El mayor es " + num2);}
    */
    
    
    //Ejercicio 3
    /*Hacer un programa para ingresar dos números y que luego emita por pantalla
    el mayor de ellos o un cartel aclaratorio “Son iguales” en el caso de que así sea.
    Nota: los números pueden ser iguales.*/
    //Resolución
    /*
    int num1, num2;
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Ingrese el primer numero");
    num1 = teclado.nextInt();
    System.out.println("Ingrese el segundo numero");
    num2 = teclado.nextInt();
    
        if (num1>num2) {
            System.out.println("El mayor es " + num1);
        }else if (num1<num2) {System.out.println("El mayor es " + num2);
            } else{System.out.println("Son iguales");}
    */
    
    
    
    //Ejercicio 4
    /*Hacer un programa para ingresar un número y luego se emita un cartel por
    pantalla “Positivo” si el número es mayor a cero, “Negativo” si el número es
    menor a cero o “Cero” si el número es igual a cero.
    Nota: requiere más de in IF!*/
    
    int num;
    Scanner teclado = new Scanner(System.in);
    
        System.out.println("Ingrese el número");
        num = teclado.nextInt();
        
        if (num>0) {
            System.out.println("El número es positivo");
        } else if (num<0) {
            System.out.println("El número es negativo");
        } else {System.out.println("Es igual a cero");}
    
    //Ejercicio 5
    /*Hacer un programa para ingresar un número y mostrar por pantalla un cartel
    aclaratorio si el mismo es PAR o IMPAR.
    Nota: leé sobre el operador “Resto”.*/
    
    
    //Ejercicio 6
    /*Una casa de video juegos otorga un descuento dependiendo del importe de la
    compra realizada según los siguientes valores:
    • Si el importe es menor a ARS 1000, no hay descuento.
    • Si el importe es ARS 1000 o más pero menor a ARS 5000, aplica un
    descuento del 10%.
    • Si el importe es ARS 5000 o más, aplica un descuento del 18%.
    Hacer un programa para ingresar un importe de venta y luego muestre por
    pantalla el importe final con el descuento que corresponda.*/
    
    
    //Ejercicio 7
    /*Hacer un programa para ingresar cuatro números distintos y luego mostrar por
    pantalla el mayor de ellos.*/
    
    
    //Ejercicio 8
    /*Hacer un programa para ingresar cuatro números distintos y luego mostrar por
    pantalla el menor de ellos.*/
    
    
    //Ejercicio 9
    /*Hacer un programa para ingresar cinco números distintos y luego mostrar por
    pantalla el mayor y el menor de ellos.*/
    
    //Ejercicio 10
    /*Hacer un programa para ingresar cuatro números y luego mostrar por pantalla
    cuáles son mayores a 100.*/
    
    
    //Ejercicio 11
    /*Hacer un programa para ingresar cuatro números y luego mostrar por pantalla
    cuántos son menores a 100.*/
    
    
    //Ejercicio 12
    /*Hacer un programa para ingresar un valor que estará expresado en minutos. Si
    los minutos superan los 60, pasar el valor a horas, de lo contrario dejarlo en
    minutos. Mostrar el resultado en pantalla aclarando si se muestran minutos u
    horas.*/
        
    }
    
}
