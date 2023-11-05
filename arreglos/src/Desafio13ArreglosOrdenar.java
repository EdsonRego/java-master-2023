import java.util.Scanner;

public class Desafio13ArreglosOrdenar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];
        int[] numAux = new int[10];

        System.out.println("Ingresar 10 números enteros");
        for (int i = 0; i < num.length; i++){
            System.out.print("Ingrese numero = ");
            num[i] = sc.nextInt();
        }
        System.out.println();

        System.out.println("Números ingresados:");
        for (int i = 0; i < num.length; i++){
            System.out.println("Numero ingresado en la posición " + (i+1) + " = " + num[i]);
        }
        System.out.println();

        int aux = 0;
        for(int i = 0; i < num.length -i; i++){
            numAux[aux++] = num[num.length -1 -i];
            numAux[aux++] = num[i];
        }

        System.out.println("Arreglo modificado  el siguiente orden: el último, el primero, el penúltimo, el segundo, el antepenúltimo, el tercero, y así sucesivamente.");
        for(int i=0; i < numAux.length; i++){
            System.out.println("i = " + (i+1) + " = " + numAux[i]);
        }

        /*//Solución del professor:
        Scanner scanner = new Scanner(System.in);
        int i, arreglo[];
        arreglo = new int[10];
        for (i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero: ");
            arreglo[i] = scanner.nextInt();
        }

        // como en cada iteración del for se muestran dos números
        // solo necesitaremos recorrer la mitad de iteraciones, con eso es suficiente.
        System.out.println("El resultado es:");
        for (i = 0; i <= 4; i++) {
            System.out.println(arreglo[9 - i]); // y el i-ésimo por el final
            System.out.println(arreglo[i]); // mostramos el i-ésimo número por el principio
        }*/
    }
}
