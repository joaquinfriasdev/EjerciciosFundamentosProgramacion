
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
    //Resolución
    /*
    int num;
    Scanner teclado = new Scanner(System.in);
    
        System.out.println("Ingrese el número");
        num = teclado.nextInt();
        
        if (num>0) {
            System.out.println("El número es positivo");
        } else if (num<0) {
            System.out.println("El número es negativo");
        } else {System.out.println("Es igual a cero");}
    */
    
    
    
    //Ejercicio 5
    /*Hacer un programa para ingresar un número y mostrar por pantalla un cartel
    aclaratorio si el mismo es PAR o IMPAR.
    Nota: leé sobre el operador “Resto”.*/
    //Resolución
    /*
    int num;
    Scanner teclado = new Scanner(System.in);
    
        System.out.println("Ingrese el número");
        num = teclado.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("El número es PAR");
        } else{System.out.println("El número es IMPAR");}
    */
    
    
    
    
    //Ejercicio 6
    /*Una casa de video juegos otorga un descuento dependiendo del importe de la
    compra realizada según los siguientes valores:
    • Si el importe es menor a ARS 1000, no hay descuento.
    • Si el importe es ARS 1000 o más pero menor a ARS 5000, aplica un
    descuento del 10%.
    • Si el importe es ARS 5000 o más, aplica un descuento del 18%.
    Hacer un programa para ingresar un importe de venta y luego muestre por
    pantalla el importe final con el descuento que corresponda.*/
    //Resolución
    /*
    double importe;
    Scanner teclado = new Scanner(System.in);
    
        System.out.println("Ingrese el importe de la compra realizada: ");
        importe = teclado.nextDouble();
        
        if (importe<1000) {
            System.out.println("El importe es " + importe);
        } else if (importe >=1000 && importe<5000) {
            importe = importe - (importe * 0.10);
            System.out.println("El importe con un descuento del 10% es: " + importe);
        } else{
            importe = importe - (importe + 0.18);
            System.out.println("El importe con un descuento del 18% es: " + importe); 
        }
    */
    
    
    
    
    //Ejercicio 7
    /*Hacer un programa para ingresar cuatro números distintos y luego mostrar por
    pantalla el mayor de ellos.*/
    //Resolución
    /*
    int num1, num2, num3, num4;
    Scanner teclado = new Scanner(System.in);
    
        System.out.println("Ingrese el primer número: ");
        num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = teclado.nextInt();
        System.out.println("Ingrese el tercer número: ");
        num3 = teclado.nextInt();
        System.out.println("Ingrese el cuarto número: ");
        num4 = teclado.nextInt();
    
        if (num1>num2 && num2>num3 && num1>num4) {
            System.out.println("El mayor es " + num1);
        } else if (num2>num3 && num2>num4) {
            System.out.println("El mayor es " + num2);
        } else if (num3>num4) {
            System.out.println("El mayor es " + num4);
        } else{ System.out.println("El mayor es " + num4);}
    */
    
    
    
    
    //Ejercicio 8
    /*Hacer un programa para ingresar cuatro números distintos y luego mostrar por
    pantalla el menor de ellos.*/
        //Resolución
    /*
    int num1, num2, num3, num4;
    Scanner teclado = new Scanner(System.in);
    
        System.out.println("Ingrese el primer número: ");
        num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = teclado.nextInt();
        System.out.println("Ingrese el tercer número: ");
        num3 = teclado.nextInt();
        System.out.println("Ingrese el cuarto número: ");
        num4 = teclado.nextInt();
    
        if (num1<num2 && num2<num3 && num1<num4) {
            System.out.println("El menor es " + num1);
        } else if (num2<num3 && num2<num4) {
            System.out.println("El menor es " + num2);
        } else if (num3<num4) {
            System.out.println("El menor es " + num4);
        } else{ System.out.println("El menor es " + num4);}
    */
    
    
    
    
    //Ejercicio 9
    /*Hacer un programa para ingresar cinco números distintos y luego mostrar por
    pantalla el mayor y el menor de ellos.*/
    
    int num1, num2, num3, num4, num5, mayor, menor;
    Scanner teclado = new Scanner(System.in);
    
        System.out.println("Ingrese el primer número: ");
        num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = teclado.nextInt();
        System.out.println("Ingrese el tercer número: ");
        num3 = teclado.nextInt();
        System.out.println("Ingrese el cuarto número: ");
        num4 = teclado.nextInt();
        System.out.println("Ingrese el quinto número: ");
        num5 = teclado.nextInt();
    
        if (num1>num2) {
            mayor = num1;
            menor = num2;   
        } else{
            mayor = num2;
            menor = num1;
        }
        
        if (num3>mayor) {
            mayor = num3;
        } else if (num3>menor) {
            menor = num3;
        }
        
        if (num4>mayor) {
            mayor = num4;
        } else if (num4<menor) {
            menor = num4;
        }
        
        if (num5>mayor) {
            mayor = num5;
        } else if (num5<menor) {
            menor = num5;
        }
        System.out.println("El mayor es " + mayor + " y el menor es " + menor);
        
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
