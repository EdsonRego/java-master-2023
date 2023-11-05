import java.util.Scanner;

public class Desafio03OrdenarDosNumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el primero numero: ");
        Integer num1 = sc.nextInt();
        
        System.out.print("Ingrese el segundo numero: ");
        Integer num2 = sc.nextInt();

        Integer maiorNumero = (num1 > num2 )? num1 : num2;
        Integer menorNumero = (num1 < num2) ? num1 : num2;

        System.out.println("maiorNumero = " + maiorNumero);
        System.out.println("menorNumero = " + menorNumero);

        System.out.println("Solucion del professor");
        System.out.println("--------");
        String resultado = (num1 > num2) ? num1 + " y " + num2 : num2 + " y " + num1;

        System.out.println("El orden es: " + resultado);
    }
}
