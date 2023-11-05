public class EjemploArreglosForOrdenamientoBurbujaOptimizadoReUso {

    public static void arregloInverso(String[] arreglo){
        int totalProdutos2 = arreglo.length;
        int totalProdutos = arreglo.length;
        for(int i = 0; i < totalProdutos2 ; i++){
            String actual = arreglo[i];
            String inverso = arreglo[totalProdutos - 1 - i];
            arreglo[i] = inverso;
            arreglo[totalProdutos - 1 - i] = actual;
            totalProdutos2--;
        }
    }



    public static void sortBurbuja(Object[] arreglo){

        int total = arreglo.length;
        int contador = 0;

        for(int i = 0; i < total - 1; i++){
            for(int j = 0; j < total - 1 - i; j++){
                if( ( (Comparable)arreglo[j+1] ).compareTo(arreglo[j] ) > 0){
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);
    }
    public static void main(String[] args) {

        String[] produtos = {"Kingston Pendrive 64gb", "Samsung Galaxy", "Disco duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Air", "Chromecast 4ta generation", "Bicicleta Oxford" };

        int totalProdutos = produtos.length;

        sortBurbuja(produtos);

        System.out.println("====Usando For =====");
        for(int i = 0; i < totalProdutos; i++){
            System.out.println("Para indice " + i + " : " + produtos[i]);
        }

        Integer[] numeros = new Integer[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("2");
        numeros[2] = (int) 35L;
        numeros[3] = -1;

        sortBurbuja(numeros);

        for(int i = 0; i < numeros.length; i++){
            System.out.println("i = " + i + " : " + numeros[i]);
        }
    }
}
