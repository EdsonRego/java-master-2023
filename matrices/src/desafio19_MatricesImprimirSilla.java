import java.util.Scanner;

public class desafio19_MatricesImprimirSilla {
    public static void main(String[] args) {

       /* Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la silla: ");
        int cantidad = sc.nextInt();

        int[][] matriz = new int[cantidad][cantidad];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(
                        i == (matriz.length -1)/2 ||
                        j == 0 ||
                        j == matriz[i].length-1
                ){
                    matriz[i][j] = 1;
                }
            }
        }

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }*/

        //Professor
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la matriz (n x n): ");
        int n = scanner.nextInt();
        int[][] matriz = new int[n][n];

        if (n == 0) {
            System.out.println("ERROR");
            System.exit(1);
        }

        // llenamos la matriz de n x n con la figura de una silla en base al numero 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (
                        (j == 0) ||
                        (i == n / 2 && j != 0 && j != n - 1) ||
                        (j == n - 1 && i >= n / 2)
                ) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        // recorremos e mostramos los elementos de la matriz para imprimir la figura de una silla
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                         System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
