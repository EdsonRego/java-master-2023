import java.util.Scanner;

public class EjemploArreglosDesplazarPosiciones3b {
    public static void main(String[] args) {

        int[] a = new int[10];
        int numero, posicion, ultimo;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese un numero en la posición: " + (i+1) + " = ");
            a[i] = sc.nextInt();
        }

        System.out.println("Arreglo inicial:");
        for(int i=0; i < a.length; i++){
            System.out.println("Posici[on " + i + " = " + a[i]);
        }
        System.out.println();

        System.out.print("Ingrese numero a insertar: ");
        numero = sc.nextInt();

        ultimo = a[a.length -1];
        posicion = 0;
        while(posicion < a.length-1 && numero > a[posicion]){
            posicion++;
        }

        for (int i = a.length -2; i >= posicion; i--  ){
            a[i+1] = a[i];
        }

        //creando el nuevo arreglo
        int[] b = new int[a.length + 1];
        System.arraycopy(a,0,b,0,a.length);

        if(numero > ultimo){
            b[b.length-1]=numero;
        }else {
            b[b.length-1]=ultimo;
            b[posicion] = numero;
        }

        System.out.println("Arreglo modificado:");
        for(int i=0; i < b.length; i++){
            System.out.println("Posici[on " + (i+1) + " = " + b[i]);
        }
    }
}
