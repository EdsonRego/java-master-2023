public class PasarPorValor {
    public static void main(String[] args) {

        int i = 10;

        System.out.println("Iniciamos el método main con i = " + i);

        test(i);

        System.out.println("Finaliza el método main con i = " + i);
    }

    public static void test(int j){
        System.out.println("Iniciamos el método test con j = " + j);
        j = 35;
        System.out.println("Finaliza el método test con j = " + j);
    }
}
