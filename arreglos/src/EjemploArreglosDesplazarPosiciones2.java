import java.util.Scanner;

public class EjemploArreglosDesplazarPosiciones2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        int elemento, posicion;// o usuário vai informar qual o valor do elemento e onde quer incluí-lo;

        //Popula o arreglos, adicionamos o -1 para deixar uma posição vazia, a ideia aqui é adicionar um numero
        // e mover os números seguintes
        for(int i = 0; i < a.length -1; i++){
            System.out.print("Ingrese un numero en la posición " + i + " = ");
            a[i]=sc.nextInt();
        }

        //Exibe el arreglo
        for(int i=0; i < a.length; i++){
            System.out.println("Posición " + i + " = " + a[i]);
        }

        //Altera o arreglo
        System.out.println();

        System.out.print("Informe el valor del nuevo elemento: ");
        elemento = sc.nextInt();

        System.out.print("Informe la posición del nuevo elemento [de 0 a 9]: ");
        posicion = sc.nextInt();

        //parte do inverso, do último
        for (int i = a.length -2; i >= posicion; i--){
            a[i+1]=a[i];
        }
        a[posicion] = elemento;

        //Exibe el arreglo modificado
        System.out.println("Arreglo modificado, todos andaram 1 posição");
        for (int i=0; i< a.length; i++){
            System.out.println("Posición " + i + " = " + a[i]);
        }
    }
}
