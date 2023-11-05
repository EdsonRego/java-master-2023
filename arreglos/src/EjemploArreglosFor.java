import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] produtos = new String[7];

        int totalProdutos = produtos.length;

        produtos[0] = "Kingston Pendrive 64gb";
        produtos[1] = "Samsung Galaxy";
        produtos[2] = "Disco duro SSD Samsung Externo";
        produtos[3] = "Asus Notebook";
        produtos[4] = "Macbook Air";
        produtos[5] = "Chromecast 4ta generation";
        produtos[6] = "Bicicleta Oxford";

        Arrays.sort(produtos);

        System.out.println("====Usando For =====");
        for(int i = 0; i < totalProdutos; i++){
            System.out.println("Para indice " + i + " : " + produtos[i]);
        }

        System.out.println("====Usando For Each=====");
        for(String prod: produtos){
            System.out.println("prod = " + prod);
        }

        System.out.println("====Usando While=====");
        int i = 0;
        while(i < totalProdutos){
            System.out.println("Para indice " + i + " : " + produtos[i]);
            i++;
        }

        System.out.println("====Usando Do While=====");
        int j = 0;
        do {
            System.out.println("Para indice " + j + " : " + produtos[j]);
            j++;
        } while(j < totalProdutos);


        int[] numeros = new int[10];

        int totalNumeros = numeros.length;
        for(int k = 0; k < totalNumeros; k++){
           numeros[k] = k * 3;
        }

        for(int k = 0; k < totalNumeros; k++){
            System.out.println("Números = " + numeros[k]);
        }
    }
}
