import java.util.Scanner;

public class desafio18_MatricesEscribirUnoX {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la matrix ( n x n ): ");
        int cantidad = sc.nextInt();

        if(cantidad != 0) {

            String[][] arreglo = new String[cantidad][cantidad];

            for (int i = 0; i < arreglo.length; i++) {
                for (int j = 0; j < arreglo.length; j++) {
                    int x = i + 1;
                    if ((i == j) || (j == (cantidad - x))) {
                        arreglo[i][j] = "X";
                        System.out.print(arreglo[i][j] + "\t");
                    } else {
                        arreglo[i][j] = "_";
                        System.out.print(arreglo[i][j] + "\t");
                    }
                }
                System.out.println();
            }
        }else {
            System.out.println("ERROR la cantidad tiene que ser diferente de cero.");
        }

        // Professor

      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz (n x n): ");
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println("ERROR");
            System.exit(1);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j || (j == n - i - 1)) {
                    System.out.print("X");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }*/
    }
}