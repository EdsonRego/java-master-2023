import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        String[] produtos = new String[7];

        produtos[0] = "Kingston Pendrive 64gb";
        produtos[1] = "Samsung Galaxy";
        produtos[2] = "Disco duro SSD Samsung Externo";
        produtos[3] = "Asus Notebook";
        produtos[4] = "Macbook Air";
        produtos[5] = "Chromecast 4ta generation";
        produtos[6] = "Bicicleta Oxford";

        Arrays.sort(produtos);

        String prod1 = produtos[0];
        String prod2 = produtos[1];
        String prod3 = produtos[2];
        String prod4 = produtos[3];
        String prod5 = produtos[4];
        String prod6 = produtos[5];
        String prod7 = produtos[6];

        System.out.println("produtos[0] = " + prod1);
        System.out.println("produtos[1] = " + prod2);
        System.out.println("produtos[2] = " + prod3);
        System.out.println("produtos[3] = " + prod4);
        System.out.println("produtos[4] = " + prod5);
        System.out.println("produtos[5] = " + prod6);
        System.out.println("produtos[6] = " + prod7);

        /*System.out.println("produtos[0] = " + produtos[0]);
        System.out.println("produtos[1] = " + produtos[1]);
        System.out.println("produtos[2] = " + produtos[2]);
        System.out.println("produtos[3] = " + produtos[3]);
        System.out.println("produtos[4] = " + produtos[4]);
        System.out.println("produtos[5] = " + produtos[5]);
        System.out.println("produtos[6] = " + produtos[6]);*/


        int[] numeros = new int[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("2");
        numeros[2] = (int) 35L;
        numeros[3] = -1;
        //numeros[4] = 5;

        Arrays.sort(numeros);

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length -1];
        //int m = numeros[4];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

    }
}
