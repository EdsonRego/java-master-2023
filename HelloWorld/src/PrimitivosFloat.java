public class PrimitivosFloat {
    public static void main(String[] args) {

        float realFloat = 0.00000000015f;//1.5E-10;
        System.out.println("realFloat = " + realFloat);
        System.out.println("float correspondente en byte = " + Float.BYTES);
        System.out.println("float correspondente en bites = " + Float.SIZE);
        System.out.println("máximo valor para float = " + Float.MAX_VALUE);
        System.out.println("mínimo valor para float = " + Float.MIN_VALUE);

        double realDouble = 3.4028235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double correspondente en byte = " + Double.BYTES);
        System.out.println("double correspondente en bites = " + Double.SIZE);
        System.out.println("máximo valor para double = " + Double.MAX_VALUE);
        System.out.println("mínimo valor para double = " + Double.MIN_VALUE);

        var varFlotante =3.1416f;
        System.out.println("varFlotante = " + varFlotante);
    }
}
