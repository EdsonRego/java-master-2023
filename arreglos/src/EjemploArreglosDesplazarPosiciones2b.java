import java.util.Scanner;

public class EjemploArreglosDesplazarPosiciones2b {
    public static void main(String[] args) {

        int[] a = new int[10];
        int elemento, posicion, ultimo;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese un numero en la posición " + i + " = ");
            a[i]=sc.nextInt();
        }
        System.out.println();

        for(int i=0; i < a.length; i++){
            System.out.println("Posición " + i + " = " + a[i]);
        }
        System.out.println();

        System.out.print("Informe el valor del nuevo elemento: ");
        elemento = sc.nextInt();

        System.out.print("Informe la posición del nuevo elemento [de 0 a 9]: ");
        posicion = sc.nextInt();

        ultimo = a[a.length-1];
        for (int i = a.length -2; i >= posicion; i--){
            a[i+1]=a[i];
        }
        //criar b copiando a +1
        int[] b = new int[a.length + 1];
        System.arraycopy(a,0,b,0,a.length);

       /* b[posicion] = elemento;

        b[b.length -1] = ultimo;
        System.out.println("Arreglo modificado, todos andaram 1 posição");
        for (int i=0; i< b.length; i++){
            System.out.println("Posición " + i + " = " + b[i]);*/
        //opção copiando b para a
        a = b;
        a[posicion] = elemento;

        a[a.length -1] = ultimo;
        System.out.println("Arreglo modificado, todos andaram 1 posição");
        for (int i=0; i< a.length; i++){
            System.out.println("Posición " + i + " = " + b[i]);

        }
    }
}
