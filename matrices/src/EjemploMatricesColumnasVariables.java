public class EjemploMatricesColumnasVariables {
    public static void main(String[] args) {

        // cantidade de linhas 3, quantidade de columnas variable
        int[][] matriz = new int[3][];

        matriz[0] = new int[2];//linha 0, com 2 columnas
        matriz[1] = new int[3];//linha 1, com 3 columnas
        matriz[2] = new int[4];//linha 2, com 4 columnas

        System.out.println("Matriz length: " + matriz.length);
        System.out.println("Fila 0 - length " + matriz[0].length );
        System.out.println("Fila 1 - length " + matriz[1].length);
        System.out.println("Fila 2 - length " + matriz[2].length);

        for(int i=0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = i*j;
            }
        }

        for(int i = 0; i < matriz.length; i++ ){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
