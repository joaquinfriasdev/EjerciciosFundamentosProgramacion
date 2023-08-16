
package guiadeejercicios1;

import java.util.Scanner;


public class GuiaDeEjercicios1 {

    public static void main(String[] args) {
       
        //Ejercicio 2
        /*Hacer un programa para solicitar por teclado un número y luego devolver su
        valor elevado al cubo.*/
        //Resolución
        /*
        int num;
        System.out.println("Ingrese el número");
        Scanner teclado = new Scanner(System.in);
        num = teclado.nextInt();
        int cubo = (num * num * num);
        System.out.println("El número al cubo es: " + cubo);
        */
        
        
        //Ejercicio 3
        /* Hacer un programa que permita ingresar el año actual y el año de la fecha de
        nacimiento de una persona y luego calcule y emita por pantalla su edad.*/
        /*
        //Resolución
        int anioAct;
        int anioNac;
        System.out.println("Ingrese el año actual: ");
        Scanner tecAct = new Scanner(System.in);
        anioAct = tecAct.nextInt();
        System.out.println("Ingrese el año de su nacimiento: ");
        Scanner tecNac = new Scanner(System.in);
        anioNac = tecNac.nextInt();
        int edad = (anioAct - anioNac);
        System.out.println("Su edad es: " + edad);
        */
        
        
        //Ejercicio 4
        /*Hacer un programa que permite ingresar los kilómetros existentes entre dos ciudades y la velocidad
        promedio de un vehículo. Calcular y emitir por pantalla el tiempo aproximado que demandará llegar de un
        punto a otro teniendo en cuenta los datos ingresados*/
        //Resolución
        /*
        double kilometros;
        double velocidadPromedio;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la distancia entre las ciudades: ");
        kilometros = teclado.nextDouble();
        System.out.println("Ingrese la velocidad promedio del vehículo: ");
        velocidadPromedio = teclado.nextDouble();
        double tiempoAprox = (kilometros/velocidadPromedio);
        System.out.println("El tiempo aproximado que demandará llegar es: " + tiempoAprox);
        */
        
        
        //Ejercicio 5
        /*Una casa de computación paga a sus empleados un sueldo fijo de $15.000 mas una comisión del 5% sobre
        el total facturado por cada empleado. Hacer un programa para ingresar el total facturado por un empleado
        y que luego calcule y emita por pantalla el sueldo total a cobrar por el mismo.*/
        //Resolución
        /*
        double sueldo;
        double totalFacturado;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el total facturado: ");
        totalFacturado = teclado.nextDouble();
        sueldo = (totalFacturado * 0.05) + 15000;
        System.out.println("El sueldo es: " + sueldo);
        */
        
        
        //Ejercicio 6
        /* Hacer un programa para ingresar por teclado las tres notas de exámenes de un
        alumno y luego calcule y emita por pantalla el promedio final.*/
        //Resolución
        /*
        double nota1, nota2, nota3, promedio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la primer nota: ");
        nota1 = teclado.nextDouble();
        System.out.println("Ingrese la segunda nota: ");
        nota2 = teclado.nextDouble();
        System.out.println("Ingrese la tercer nota: ");
        nota3 = teclado.nextDouble();
        promedio = (nota1 + nota2 + nota3)/3;
        System.out.println("El promedio final es: " + promedio);
        */
        
        
        //Ejercicio 7
        /* Hacer un programa para ingresar por teclado los metros cuadrados totales de
        un predio y los metros cuadrados cubiertos; luego calcular y mostrar por
        pantalla el porcentaje de metros cuadrados cubiertos y el porcentaje de
        metros cuadrados descubiertos.*/
        //Resolución
        /*
        double metrosCuadradosTotales, metrosCuadradosCubiertos, metrosCuadradosDescubiertos, porcentajeCubierto, porcentajeDescubierto;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese los metros cuadrados totales del predio: ");
        metrosCuadradosTotales = teclado.nextDouble();
        System.out.println("Ingrese los metros cuadrados cubiertos: ");
        metrosCuadradosCubiertos = teclado.nextDouble();
        
        metrosCuadradosDescubiertos = (metrosCuadradosTotales - metrosCuadradosCubiertos);
        porcentajeCubierto = (metrosCuadradosCubiertos/metrosCuadradosTotales)*100;
        porcentajeDescubierto = 100 - porcentajeCubierto;
        
        System.out.println("El porcentaje Cubierto es : " + porcentajeCubierto + " El porcentaje Descubierto es: " + porcentajeDescubierto);
        */
        
        
        //Ejercicio 8
        /*Una importante cadena de delivery cuenta con una promoción por tiempo
        limitado en la que otorga un 15% de descuento sobre el total del valor de la
        compra realizada. Hacer un programa para solicitar el monto total y el mismo
        calcule y emita por pantalla el total a cobrar con el descuento aplicado. */
        //Resolución
        /*
        double montoTotal;
        double totalDesc;
        double descuento;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el monto total");
        montoTotal = teclado.nextDouble();
        descuento = (montoTotal * 15) /100;
        totalDesc = montoTotal - descuento;
        
        System.out.println("El monto total con el descuento del 15% es: " + totalDesc);
        */
        
        
        //Ejercicio 9
        /* Una universidad desea conocer los porcentajes de mujeres y hombres en las
        carreras de ciencias exactas. Se solicita un programa para cargar la cantidad de
        mujeres y la cantidad de hombres y que el mismo calcule y emita por pantalla
        los porcentajes correspondientes.*/
        //Resolución
        /*
        int mujeres;
        int hombres;
        int total;
        double porcentajeMujeres;
        double porcentajeHombres;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de mujeres");
        mujeres = teclado.nextInt();
        System.out.println("Ingrese la cantidad de hombres");
        hombres = teclado.nextInt();
        
        total = mujeres + hombres;
        
        porcentajeMujeres = (double) mujeres / total * 100;
        porcentajeHombres = (double) hombres / total * 100;
        
        System.out.println("El porcentaje de mujeres es: " + porcentajeMujeres + " y el porcentaje de hombres es: " + porcentajeHombres);
        */
        
        
        //Ejercicio 10
        /*Hacer un programa que permita ingresar por teclado dos números y que luego
        muestre por pantalla la suma, la resta, la multiplicación y la división de dichos
        números. Se deben mostrar cuatro resultados en pantalla. Los números deben
        ser solicitados una única vez. */
        //Resolución
        /*
        double num1, num2;
        double suma, resta, multiplicacion, division;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número");
        num1 = teclado.nextDouble();
        System.out.println("Ingrese el segundo número");
        num2 = teclado.nextDouble();
        
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;
        
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: " + division);
        */
        
    }
    
}
