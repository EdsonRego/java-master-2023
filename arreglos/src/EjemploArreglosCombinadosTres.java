public class EjemploArreglosCombinadosTres {
    public static void main(String[] args) {

        int[] a, b, c;
        a = new int[12];
        b = new int[12];
        c = new int[24];

        //Prrenche a
        for(int i = 0; i < a.length; i++){
            a[i] = i + 1;
        }
        System.out.println("Array a");
        for(int i = 0; i < a.length; i++){
            System.out.println(i + " a = " + a[i]);
        }

        for(int i = 0; i < b.length; i++){
            b[i] = (i + 1) * 5;
        }
        System.out.println("Array b");
        for (int i = 0; i < b.length; i++){
            System.out.println(i + " b = " + b[i]);
        }

       //Ajunda 02 de a & 02 de b no arreglo c
       int aux = 0;
       for(int i = 0; i < a.length; i+=3){
           for(int j = 0; j < 3; j++) {
               c[aux++] = a[i + j];
           }
           for(int j = 0; j < 3; j++) {
               c[aux++] = b[i + j];
           }
        }

        System.out.println("Array c, com 02 elementos de a & 02 elementos de b");
        for (int i=0; i < c.length; i++){
            System.out.println(i + " c = " + c[i]);
        }
    }
}
