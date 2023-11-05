public class PrimitivosEnteros {
    public static void main(String[] args) {

        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a: " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a: " + Byte.SIZE);
        System.out.println("valor máximo de byte: " + Byte.MAX_VALUE);
        System.out.println("valor mínimo de byte:  " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en bytes a: " + Short.BYTES);
        System.out.println("tipo short corresponde en bites a: " + Short.SIZE);
        System.out.println("valor máximo de short: " + Short.MAX_VALUE);
        System.out.println("valor mínimo de short:  " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en bytes a: " + Integer.BYTES);
        System.out.println("tipo int corresponde en bites a: " + Integer.SIZE);
        System.out.println("valor máximo de int: " + Integer.MAX_VALUE);
        System.out.println("valor mínimo de int:  " + Integer.MIN_VALUE);

        long numeroLong = 922337203685477580L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en bytes a: " + Long.BYTES);
        System.out.println("tipo long corresponde en bites a: " + Long.SIZE);
        System.out.println("valor máximo de long: " + Long.MAX_VALUE);
        System.out.println("valor mínimo de long:  " + Long.MIN_VALUE);
    }
}
