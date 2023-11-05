public class EjemploArreglosForOrdenamientoBurbujaOptimizado {

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

    public static void main(String[] args) {

        String[] produtos = {"Kingston Pendrive 64gb", "Samsung Galaxy", "Disco duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Air", "Chromecast 4ta generation", "Bicicleta Oxford" };

        int totalProdutos = produtos.length;

        int contador = 0;

        for(int i = 0; i < totalProdutos - 1; i++){

            for(int j = 0; j < totalProdutos - 1 - i; j++){
                if(produtos[j+1].compareTo(produtos[j]) < 0){
                    String auxiliar = produtos[j];
                    produtos[j] = produtos[j+1];
                    produtos[j+1] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);
        /*Arrays.sort(produtos);
        arregloInverso(produtos);
        Collections.reverse(Arrays.asList(produtos));*/

        System.out.println("====Usando For =====");
        for(int i = 0; i < totalProdutos; i++){
            System.out.println("Para indice " + i + " : " + produtos[i]);
        }

        int[] numeros = new int[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("2");
        numeros[2] = (int) 35L;
        numeros[3] = -1;

        for(int i = 0; i < numeros.length - 1; i++){

            for(int j = 0; j < numeros.length - 1 - i; j++){
                if( ( (Comparable)numeros[j+1] ).compareTo(numeros[j] ) < 0){
                    int auxiliar = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = auxiliar;
                }
                contador++;
            }
        }
        for(int i = 0; i < numeros.length; i++){
            System.out.println("i = " + i + " : " + numeros[i]);
        }

    }
}
