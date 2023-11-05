public class PasarPorReferencia {
    public static void main(String[] args) {

        System.out.println("Iniciamos el método main");
        int[] edad = {10, 11, 12};
        for(int i = 0; i < edad.length; i++){
            System.out.println("edad[i] = " + edad[i]);
        }

        System.out.println("Antes de llamar el método test ");
        test(edad);
        System.out.println("Después de llamar el método test ");

        for(int i = 0; i < edad.length; i++){
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("Finaliza el método main con los datos del arreglo modificados!");
    }

    public static void test(int[] edadArreglo){
        System.out.println("Iniciamos el método test");

        for(int i = 0; i < edadArreglo.length; i++){
            edadArreglo[i] = edadArreglo[i] + 20;
        }

        System.out.println("Finaliza el método test");
    }
}
