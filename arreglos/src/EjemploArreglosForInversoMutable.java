import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {

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

        Arrays.sort(produtos);
        arregloInverso(produtos);

        //Collections.reverse(Arrays.asList(produtos));

        System.out.println("====Usando For =====");
        for(int i = 0; i < totalProdutos; i++){
            System.out.println("Para indice " + i + " : " + produtos[i]);
        }
    }
}
