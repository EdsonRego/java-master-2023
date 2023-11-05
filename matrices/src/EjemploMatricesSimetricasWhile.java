public class EjemploMatricesSimetricasWhile {
    public static void main(String[] args) {

        //Matriz simétrica es igual a su transpuesta
        boolean simetrica = true;
        int[][] matriz = {
                {1, 2, 3, 4},
                {2, 1, 0, 5},
                {3, 0, 1, 6},
                {4, 5, 6, 7}
        };

        int i, j;
        i = 0;
        // while (i < matriz.length && simetrica == true){
        salir: while (i < matriz.length){
            j = 0;
            //while ( j < matriz[i].length && simetrica == true){
            while ( j < i && simetrica == true){
                if(matriz[i][j] != matriz[j][i]){
                    simetrica = false;
                    break salir;
                }
                j++;
            }
            i++;
        }

        if(simetrica){
            System.out.println("La Matriz es simétrica");
        }
    }
}
