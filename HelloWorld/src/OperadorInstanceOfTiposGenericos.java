public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {

        Object texto = "Crendo un objeto de la clase String";

        Number numero = Integer.valueOf(7);//7;

        boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo String = " + b1);

        b1 = texto instanceof Object;
        System.out.println("texto es del tipo Object = " + b1);
        
        b1 = texto instanceof Integer;
        System.out.println("texto es del tipo Integer = " + b1);

        boolean b2 = numero instanceof Integer;
        System.out.println("numero es del tipo Integer = " + b2);

        b2 = numero instanceof Number;
        System.out.println("numero es del tipo Number = " + b2);

        b2 = numero instanceof Object;
        System.out.println("numero es del tipo Object = " + b2);

        b1 = numero instanceof Long;
        System.out.println("numero es del tipo Long = " + b1);

        b1 = numero instanceof Double;
        System.out.println("numero es del tipo Double = " + b1);

        Number decimal = 45.54f;
        b1 = decimal instanceof Double;
        System.out.println("decimal es del tipo Double =  = " + b1);

        b1 = decimal instanceof Float;
        System.out.println("decimal es del tipo Float =  = " + b1);

        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number = " + b1);

        b1 = decimal instanceof Integer;
        System.out.println("decimal es del tipo Integer = " + b1);

        Boolean b3 = texto instanceof String;
        b3 = b3 instanceof Boolean;
        System.out.println("b3 es del tipo Boolean = " + b3);
    }
}
