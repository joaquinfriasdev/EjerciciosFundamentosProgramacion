
package guiadeejercicios3;

import java.util.Scanner;


public class GuiaDeEjercicios3 {


    public static void main(String[] args) {
        
        //Ejercicio 1
        /*
        Hacer un programa que solicite el ingreso de un número y que luego emita un
        cartel por pantalla aclarando si el mismo es múltiplo de 5.
        */
        //Resolución
        /*
        int numero;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el número: ");
        numero = teclado.nextInt();
        
        if (numero%5==0) {
            System.out.println("El número ingresado es múltiplo de cinco"); 
        } else {System.out.println("El número ingresado no es múltiplo de cinco");}
        */
        
        
        //Ejercicio 2
        /*
        Hacer un programa que solicite el ingreso de dos números y luego calcular:
            a. La resta si el primero es mayor que el segundo.
            b. La suma si son iguales.
            c. El producto si el primero es menor.
        Se deberá emitir un cartel por pantalla con el resultado correspondiente.
        */
        //Resolución
        /*
        int num1, num2;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número");
        num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo número");
        num2 = teclado.nextInt();
        
        if (num1>num2) {
            int resta = num1 - num2;
            System.out.println("La resta de los números es: " + resta);
        } else if (num1<num2) {
            int producto = num1 * num2;
            System.out.println("El producto de los dos números es: " + producto);
        } else {
        int suma = num1 + num2;
            System.out.println("La suma de los dos números es: " + suma);
        }
        */
        
        
        //Ejercicio 3
        /*
        Hacer un programa para ingresar dos números. Si el segundo es distinto de
        cero, calcular la división del primero por el segundo y mostrar el resultado por
        pantalla; caso contrario, emitir un cartel aclarando que no se puede dividir por
        cero.
        */
        //Resolución
        /*
        double num1, num2;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número: ");
        num1 = teclado.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        num2 = teclado.nextDouble();
        
        if (num2!=0) {
            double division = num1/num2;
            System.out.println("El resultado de la division de " + num1 + " por " + num2 + " es: " + division);
        } else {System.out.println("No se puede dividir por cero");}
        */
        
        
        //Ejercicio 4
        /*
        Un importante negocio de desinfectante líquido realiza descuentos
        dependiendo de la cantidad de litros vendidos según la siguiente escala:
            a. Si vende menos de 100 litros, no hay descuento.
            b. Si vende entre 101 y 300 litros, el descuento es del 10%.
            c. Si vende entre 301 y 500 litros, el descuento es del 15%.
            d. Finalmente, si la venta es de más de 500 litros, el descuento es del 25%.
        Hacer un programa que solicite el ingreso del importe total de la venta y la
        cantidad de litros vendidos y calcule y emita el importe con el descuento aplicado.
        */
        //Resolución
        /*
        double litrosVendidos, importe;
        double descuento = 0.0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el importe total");
        importe = teclado.nextDouble();
        System.out.println("Ingrese la cantidad vendida en litros: ");
        litrosVendidos = teclado.nextDouble();

        if (litrosVendidos<=100) {
            descuento = 0.0;
        } else if (litrosVendidos>=101&&litrosVendidos<=300) {
            descuento = 0.10;
        } else if (litrosVendidos>=301&&litrosVendidos<=500) {
            descuento = 0.15;
        } else {
            descuento = 0.25;
        }
        
        importe = importe - (importe * descuento);
        System.out.println("El importe es: " + importe);
        */
         
        
        //Ejercicio 5
        /*
        Hacer un programa que solicite el ingreso de las notas del primer parcial y del
        segundo parcial de una alumna de programación. El programa deberá analizar
        las notas y emitir la situación de la alumna según la siguiente escala:
            a. Si tiene 8 o más en ambos parciales, emitir “aprobación directa”.
            b. Si no tiene 8 o más en ambos pero tiene aprobados ambos parciales (se
            aprueba con 6 o más), emitir “rinde examen final”.
            c. Si tiene menos de 6 en alguno de los dos parciales, emitir “debe
            recuperar”.
        El programa debe emitir solo un cartel, el que corresponda.
        */
        //Resolución
        /*
        double nota1, nota2;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la nota del primer parcial: ");
        nota1 = teclado.nextDouble();
        System.out.println("Ingrese la nota del segundo parcial: ");
        nota2 = teclado.nextDouble();
        
        if (nota1>=8&&nota2>=8) {
            System.out.println("Aprobación directa");
        } else if (nota1>=6&&nota2>=6) {
            System.out.println("Rinde examen final");
        } else{System.out.println("Debe recuperar");}
        */
        
        
   
        //Ejercicio 6
        /*
        Hacer un programa para ingresar por teclado la longitud de los tres lados de un
        triángulo y que luego determine e informe con un cartel aclaratorio a qué tipo
        de triángulo corresponde:
            a. Equilátero: cuando los tres lados sean iguales.
            b. Isósceles: cuando dos de los tres lados sean iguales.
            c. Escaleno: cuando todos los lados sean distintos
        */
        //Resolución
        /*
        double lado1, lado2, lado3;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la longitud del primer lado del triángulo");
        lado1 = teclado.nextDouble();
        System.out.println("Ingrese la longitud del seudundo lado del triángulo");
        lado2 = teclado.nextDouble();
        System.out.println("Ingrese la longitud del tercecr lado del triángulo");
        lado3 = teclado.nextDouble();
        
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Es triángulo Equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Es triángulo Isósceles");
        } else{ System.out.println("Es triángulo Escaleno");}
        */
        
        
        
        //Ejercicio 7
        /*
        Hacer un programa para ingresar 4 números. Luego analizar e informar por
        pantalla si los mismos se encuentran ordenados de forma decreciente.
        */
        //Resolución
        /*
        int num1, num2, num3, num4;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número");
        num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo número");
        num2 = teclado.nextInt();
        System.out.println("Ingrese el tercer número");
        num3 = teclado.nextInt();
        System.out.println("Ingrese el cuarto número");
        num4 = teclado.nextInt();
        
        if (num1>num2 && num2>num3 && num3>num4) {
            System.out.println("Los números están ordenados de forma decreciente");
        } else {System.out.println("Los números no están ordenados de forma decreciente");}
        */
        
        
        
        //Ejercicio 8
        /*
        El negocio de desinfectante antes mencionado vende además detergente
        suelto, y los precios se aplican según la siguiente escala:
            a. 25 ARS por litro los primeros 50 litros.
            b. 20 ARS por litro si la venta es de 51 a 200 litros.
            c. 15 ARS por litro si la venta es de 201 a 500 litros.
            d. 10 ARS por litro si la venta es de más de 500 litros.
        Además, si paga en efectivo, tiene un adicional del 10% sobre el importe final.
        Hacer un programa que solicite la cantidad de litros vendidos y el tipo de pago
        (ingresará 1 si paga en efectivo y 0 con cualquier otro medio de pago) y calcule
        y emita por pantalla el monto final a abonar por el cliente
        */
        //Resolución
        /*
        double litrosVendidos, importeFinal;
        int tipoDePago;
        Scanner tecladoDouble = new Scanner(System.in);
        Scanner tecladoInt = new Scanner(System.in);
        
        System.out.println("Ingresar la cantidad de litros vendidos");
        litrosVendidos = tecladoDouble.nextDouble();
        System.out.println("Ingrese el tipo de pago, 1 efectivo o 0 si es otro medio de pago");
        tipoDePago = tecladoInt.nextInt();
        
        if (litrosVendidos<=50) {
            importeFinal = 25 * litrosVendidos;
        } else if (litrosVendidos>50&&litrosVendidos<=200) {
            importeFinal = 20 * litrosVendidos;
        } else if (litrosVendidos>200&&litrosVendidos<=500) {
            importeFinal = 15 * litrosVendidos;
        } else { importeFinal = 10 * litrosVendidos;}
        
        if (tipoDePago == 1) {
            importeFinal = importeFinal + (importeFinal*0.10);
            System.out.println("El importe final es: " + importeFinal);
        } else if (tipoDePago == 0) {
            System.out.println("El importe final es: " + importeFinal);
        } else {System.out.println("Tipo de pago no válido");}
        */
        
        
        
        //Ejercicio 9
        /*
        Una importante marca de computadoras permite elegir cierta configuración del
        equipo a comprar. Para ello existe la siguiente escala de precios:
        */
        //Resoución
        /*
        Scanner teclado = new Scanner(System.in);
        int opcionProcesador, opcionRam, opcionDisco;
        double precio = 0;
        
        System.out.println("Ingrese la opción de procesador Elegida: ");
        opcionProcesador = teclado.nextInt();
        System.out.println("Ingrese la opción de memoria RAM elegida: ");
        opcionRam = teclado.nextInt();
        System.out.println("¿Ampliar disco? -- 1 Si  -- 2 No: ");
        opcionDisco = teclado.nextInt();
        
        
        switch (opcionProcesador) {
            case 1 -> {
                switch (opcionRam) {
                    case 1 -> precio = 800;
                    
                    case 2 -> precio = 900;
                    
                    case 3 -> precio = 1000;
                        
                    default -> System.out.println("Opción de memoria RAM no válida");
                }
            }
            case 2 -> {
                switch (opcionRam) {
                    case 1 -> precio = 900;
                    
                    case 2 -> precio = 1000;
                        
                    case 3 -> precio= 1400;
                        
                    default -> System.out.println("Opción de memoria RAM no válida");
                }
            }
                
            case 3 -> {
                switch (opcionRam) {
                    case 1 -> precio = 1200;
                        
                    case 2 -> precio = 1400;
                        
                    case 3 -> precio = 2000;
                        
                    default -> System.out.println("Opción de memoria RAM no válida");
                }
            }
            default -> System.out.println("Opción de procesador no válida");
        }
        
        if (opcionDisco==1) {
           precio = precio + 300;
        }
        
        System.out.println("El precio de la máquina seleccionada es: " + precio);
        */
        
        
        
        //Ejercicio 10
        /*
        Hacer un programa que solicite cuatro números y emitir un cartel aclaratorio si
        son todos iguales entre sí, caso contrario, no emitir nada.
        */
        //Resolución
        /*
        int num1, num2, num3, num4;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número");
        num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo número");
        num2 = teclado.nextInt();
        System.out.println("Ingrese el tercer número");
        num3 = teclado.nextInt();
        System.out.println("Ingrese el cuarto número");
        num4 = teclado.nextInt();
        
        if (num1==num2&&num2==num3&&num3==num4) {
            System.out.println("Los números son iguales");
        }
        */
        
        
        
        
        //Ejercicio 11
        /*
         Hacer un programa para ingresar tres números y luego mostrarlos ordenados
        de menor a mayor.
        */
        
        
        
        
        //Ejercicio 12
        /*
        Hacer un programa para ingresar tres números y emitir un cartel aclaratorio si
        la suma de los dos primeros es mayor al producto del segundo con el tercero
        */
        
    }
    
}
