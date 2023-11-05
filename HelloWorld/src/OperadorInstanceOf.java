public class OperadorInstanceOf {
    public static void main(String[] args) {

        String texto = "Crendo un objeto de la clase String";

        Integer numero = 7;

        boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo String = " + b1);

        b1 = texto instanceof Object;
        System.out.println("texto es del tipo Object = " + b1);

        boolean b2 = numero instanceof Integer;
        System.out.println("numero es del tipo Integer = " + b2);

        b2 = numero instanceof Number;
        System.out.println("numero es del tipo Number = " + b2);

        b2 = numero instanceof Object;
        System.out.println("numero es del tipo Object = " + b2);

        Double decimal = 45.54;
        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number = " + b1);

        Boolean b3 = texto instanceof String;
        b3 = b3 instanceof Boolean;
        System.out.println("b3 es del tipo Boolean = " + b3);
    }
}
