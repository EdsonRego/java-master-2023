import java.util.Scanner;

public class EjemploArreglosEliminarElemento {
    public static void main(String[] args) {

        int[] a = new int[10];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < a.length ; i++){
            System.out.print("Ingrese un numero en la posición " + i + " = ");
            a[i] = sc.nextInt();
        }
        System.out.println("Arreglo inicial");
        for (int i = 0; i < a.length; i++){
            System.out.println("Posición " + i + " = " + a[i]);
        }
        System.out.println();

        System.out.print("Ingrese posición para eliminar [0 a 9] ");
        int posicion = sc.nextInt();

        for(int i = posicion; i < a.length - 1; i++){
            a[i] = a[i+1];
        }

        /*System.out.println("Arreglo modificado");
        for (int i = 0; i < a.length - 1; i++){
            System.out.println("Posición " + i + " = " + a[i]);
        }*/

        int[] b = new int[a.length-1];
        //copiando el arreglo a para el arreglo b
        System.arraycopy(a, 0, b, 0,b.length);

        //Opción a = b;
        System.out.println("Arreglo modificado");
        for (int i = 0; i < b.length; i++){
            System.out.println("Posición " + i + " = " + b[i]);
        }

    }
}
