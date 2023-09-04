package guiadeejercicios6;

import java.util.Scanner;

public class GuiaDeEjercicios6 {

    public static void main(String[] args) {

        //Ejercicio 1
        /*
        Scanner teclado = new Scanner(System.in);
        //Variables para el punto A
        int grupoMayorPorcenteaImpar = 0;
        int mayorPorcentajeImpar = 0;
        int porcentajeImpares = 0;
        int contImpares = 0;
        int contNumeros = 0;
        int numeroDeGrupo = 0;

        //Variable para el punto C
        int contOrdenados = 0;

        System.out.println("Ingrese 10 grupos de números separados por cero.");
        for (int i = 0; i < 3; i++) {

            System.out.println("Ingrese un número");
            int num = teclado.nextInt();
            //Declaro variables para el punto B
            int primo = 0;
            int posicionPrimo = 0;
            int ordenNum = 0;

            //Declaro variables para el punto C
            int mayor = num;
            int noEstaOrdenado = 0;

            while (num != 0) {

                //Determinar los números impares positivos
                if (num % 2 != 0 && num > 0) {
                    contImpares = num + contImpares;
                    contNumeros++;
                }
                if (contImpares > 0) {
                    porcentajeImpares = contImpares / contNumeros;
                    numeroDeGrupo = i + 1;
                }

                //Determinar el último número primo y su orden
                ordenNum++;
                int contPrimo = 0;
                for (int j = 1; j <= num; j++) {
                    if (num % j == 0) {
                        contPrimo++;
                    }
                }

                if (contPrimo == 2) {
                    primo = num;
                    posicionPrimo = ordenNum;
                }

                num = teclado.nextInt();

                //Determinar si el grupo está ordenado de mayor a menor
                if (num < mayor) {
                    mayor = num;
                } else {
                    noEstaOrdenado = 1;
                }

            }

            if (porcentajeImpares > mayorPorcentajeImpar) {
                mayorPorcentajeImpar = porcentajeImpares;
                grupoMayorPorcenteaImpar = numeroDeGrupo;
            }

            if (primo != 0) {
                System.out.println("El último primo es " + primo + " y su posición es " + posicionPrimo);
            } else {
                System.out.println("No se ingresaron números primos");
            }

            if (noEstaOrdenado == 0) {
                contOrdenados++;
            }
        }

        System.out.println("El número de grupo con el mayor porcentaje de números impares positivos es: " + grupoMayorPorcenteaImpar);
        System.out.println("La cantidad de grupos con números ingresados de mayor a menor es: " + contOrdenados);
        */
        
        //Ejercicio 2
        
        //Ejercicio 3
        
        //Ejercicio 4
        
        //Ejercicio 5
    }

}
