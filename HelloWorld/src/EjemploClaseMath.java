public class EjemploClaseMath {
    public static void main(String[] args) {

        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);

        double min = Math.max(3.5, 1.2);
        System.out.println("min = " + min);

        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);

        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);

        long entero = Math.round(3.4);
        System.out.println("entero = " + entero);

        long enteroPI = Math.round(Math.PI);
        System.out.println("entero = " + enteroPI);

        double exp = Math.exp(1);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);

        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(1.5707);
        grados = Math.round(grados);
        System.out.println("grado = " + grados);
        
        double radiales = Math.toRadians(90.00);
        System.out.println("radiales = " + radiales);

        System.out.println("sin(90): " + Math.sin(radiales));

        System.out.println("cos(90): " + Math.cos(radiales));

        radiales = Math.toRadians(180.00);
        System.out.println("cos(180): " + Math.cos(radiales));

        radiales = Math.toRadians(0.00);
        System.out.println("cos(0): " + Math.cos(radiales));

    }
}
