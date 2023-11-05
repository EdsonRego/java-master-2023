import java.util.Scanner;

public class Desafio15ArregloEstadisticas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sumaPositivos, contPositivos, sumaNegativos, contNegativos, contCeros, i, numeros[];

        numeros = new int[10];
        sumaPositivos = 0;
        contPositivos = 0;
        sumaNegativos = 0;
        contNegativos = 0;
        contCeros = 0;

        // utilizamos un for para leer los datos del teclado y llenar el arreglo
        for (i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un numero: ");
            numeros[i] = scanner.nextInt();
        }
        System.out.println();
        for (i = 0; i < numeros.length; i++) {
            System.out.println("Numero ingresado en la posición: " + (i+1) + " = " + numeros[i]);
        }

        // utilizamos otro for para realizar los cálculos de contador y sumas
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] == 0) {
                contCeros++;
            } else {
                if (numeros[i] > 0) {
                    sumaPositivos = sumaPositivos + numeros[i];
                    contPositivos++;
                } else {
                    sumaNegativos = sumaNegativos + numeros[i];
                    contNegativos++;
                }
            }
        }

        if (contPositivos == 0) {
            System.out.println("No se pudo calcular el promedio de números positivos");
        } else {
            System.out.println("El promedio de los positivos: " + (float) sumaPositivos / contPositivos);
        }

        if (contNegativos == 0) {
            System.out.println("No se pudo realizar el promedio de números negativos");
        } else {
            System.out.println("El promedio de los negativos: " + (float) sumaNegativos / contNegativos);
        }

        System.out.println("La cantidad de cero es de: " + contCeros);

    }
}
