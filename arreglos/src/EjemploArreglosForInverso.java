import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

        //String[] produtos = new String[7];

        String[] produtos = {"Kingston Pendrive 64gb", "Samsung Galaxy", "Disco duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Air", "Chromecast 4ta generation", "Bicicleta Oxford" };

        int totalProdutos = produtos.length;

        /*produtos[0] = "Kingston Pendrive 64gb";
        produtos[1] = "Samsung Galaxy";
        produtos[2] = "Disco duro SSD Samsung Externo";
        produtos[3] = "Asus Notebook";
        produtos[4] = "Macbook Air";
        produtos[5] = "Chromecast 4ta generation";
        produtos[6] = "Bicicleta Oxford";*/

        Arrays.sort(produtos);

        System.out.println();

        System.out.println("====Usando For =====");
        for(int i = 0; i < totalProdutos; i++){
            System.out.println("Para indice " + i + " : " + produtos[i]);
        }

        System.out.println();

        System.out.println("====Usando For Inverso=====");
       for(int i = 0; i < totalProdutos; i++){
           System.out.println("para i = " + (totalProdutos - 1 - i) + " valor: " + produtos[totalProdutos - 1 - i]);
       }

        System.out.println();

        System.out.println("====Usando For Inverso 2=====");
        for(int i = totalProdutos -1 ; i >= 0 ; i--){
            System.out.println("para i = " + i + " valor: " + produtos[i]);
        }
    }
}
