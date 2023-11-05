import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int i = 5, j =4, suma = i + j;
        
        System.out.println("suma = " + suma);

        System.out.println("i + j = " + i + j);

        System.out.println( i + j +"i + j = ");

        System.out.println("i + j = " + (i + j));

        int resta = i - j;
        System.out.println("resta = " + resta);

        System.out.println("(i - j) = " + (i - j));
        
        int multi = i * j;

        System.out.println("multiplicación = " + multi);
        
        int div = i / j;
        float div2 = (float) i / j;
        float div3 = (float) i / (float) j;
        System.out.println("div = " + div);
        System.out.println("div2 = " + div2);
        System.out.println("div3 = " + div3);
        
        int resto = i % j;
        System.out.println("resto = " + resto);
        
        resto = 8 % 5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

        if (numero % 2 == 0) {
            System.out.println("Número par" + numero);
        }else {
            System.out.println("Número impar " + numero);
        }
    }
}
