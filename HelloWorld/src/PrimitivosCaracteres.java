public class PrimitivosCaracteres {

    public static void main(String[] args) {
        
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("caracter = " + caracter);
        System.out.println("caracter = decimal: " + (caracter == decimal));

        char simbolo ='@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = decimal: " + (simbolo == decimal));

        char espacio = '\u0020';
        char retroceso ='\b';//backspace
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("char correspondente en bytes:" + System.lineSeparator()+ Character.BYTES);
        System.out.println("char correspondente en bites = " + Character.SIZE);
        System.out.println("Character.MAX_VALUE= " + Character.MAX_VALUE);
        System.out.println("Character.MIN_VALUE= " + Character.MIN_VALUE);
    }
}
