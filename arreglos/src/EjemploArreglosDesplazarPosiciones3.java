import java.util.Scanner;

public class EjemploArreglosDesplazarPosiciones3 {
    public static void main(String[] args) {

        int[] a = new int[7];
        int numero, posicion;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < a.length -1; i++){
            System.out.print("Ingrese un numero en la posición: " + i + " = ");
            a[i] = sc.nextInt();
        }

        System.out.println("Arreglo inicial:");
        for(int i=0; i < a.length; i++){
            System.out.println("Posici[on " + i + " = " + a[i]);
        }
        System.out.println();

        System.out.print("Ingrese numero a insertar: ");
        numero = sc.nextInt();

        posicion = 0;
        while(posicion < a.length-1 && numero > a[posicion]){
            posicion++;
        }

        for (int i = a.length -2; i >= posicion; i--  ){
            a[i+1] = a[i];
        }
        a[posicion] = numero;
        System.out.println("Arreglo modificado:");
        for(int i=0; i < a.length; i++){
            System.out.println("Posici[on " + i + " = " + a[i]);
        }
    }
}
