import java.util.Scanner;

public class EjemploArreglosDesplazarPosiciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        int ultimo;

        //Popula o arreglos
        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese un numero en la posición " + i + " = ");
            a[i]=sc.nextInt();
        }

        //Exibe el arreglo
        for(int i=0; i < a.length; i++){
            System.out.println("Posición " + i + " = " + a[i]);
        }

        //Altera o arreglo
        System.out.println();
        ultimo = a[a.length - 1];
        //parte do inverso, do último
        for (int i = a.length -2; i >= 0; i--){
            a[i+1]=a[i];
        }
        a[0] = ultimo;

        //Exibe el arreglo modificado
        System.out.println("Arreglo modificado, todos andaram 1 posição");
        for (int i=0; i< a.length; i++){
            System.out.println("Posición " + i + " = " + a[i]);
        }
    }
}
