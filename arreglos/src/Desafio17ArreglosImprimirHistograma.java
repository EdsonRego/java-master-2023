import java.util.Scanner;

public class Desafio17ArreglosImprimirHistograma {
    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);
        int[] num = new int[12];
        int n = num.length;

        boolean visited[] = new boolean[n];

        for (int i=0; i < num.length; i++){
            System.out.print("Ingre un numero de 1 a 6: ");
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {

            // Skip this element if already processed
            if (visited[i] == true)
                continue;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (num[i] == num[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.print(num[i] + " " );
            for (int k = 0; k < count; k++) {
                System.out.print('*');
            }
            System.out.println();

        }*/

        //Professor
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[12];

        // ingreamos los datos por ejemplo {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1}
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese un numero de 1 a 6: ");
            arreglo[i] = scanner.nextInt();
        }
        // Creamos un segundo arreglo llamado arregloHistograma del tipo String y de largo 6.
        // Por cada numero del 1 al 6 contiene su Histograma con la representacion
        // grafica de las veces que se repite cada numero en el arreglo principal.
        String[] arregloHistograma = new String[6];

        // luego llenamos este segundo arreglo con el Histograma
        for (int i = 0; i < arregloHistograma.length; i++) {
            int aux = i + 1;
            String histograma = aux + ": ";
            for (int j = 0; j < arreglo.length; j++) {
                if (aux == arreglo[j]) {
                    histograma += "*";
                }
            }
            arregloHistograma[i] = histograma;
        }

        // finalmente mostramos el Histograma
        for (int i = 0; i < arregloHistograma.length; i++) {
            System.out.println(arregloHistograma[i]);
        }

    }
}
