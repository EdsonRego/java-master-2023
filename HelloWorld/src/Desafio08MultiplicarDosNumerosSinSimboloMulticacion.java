import java.util.Scanner;

public class Desafio08MultiplicarDosNumerosSinSimboloMulticacion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero a: ");
        int a = scanner.nextInt();

        System.out.println("Ingrese el numero b: ");
        int b = scanner.nextInt();

        int resultado = 0;

        // verificamos los signos de cada uno, si es positivo o negativo
        boolean positivoB = b > -1;
        boolean positivoA = a > -1;

        // calculamos el valor absoluto de a
        int absolutoA = positivoA? a: -a; // equivalente a Math.abs(a);

        // sumamos tantas veces el valor de b, segun el valor de a.
        for(int i = 0; i < absolutoA; i++){
            resultado = resultado + b;
        }

        // si ambos son negativos o si solo a es negativo damos vuelta el signo
        if((!positivoA && !positivoB) || !positivoA){
            resultado = -resultado;
        }

        System.out.println("el resultado es " + resultado);

       /* Scanner sc = new Scanner(System.in);
        System.out.println("Multiplicador de dos numeros:");
        System.out.print("Introduzca el primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        int num2 = sc.nextInt();
        int resultado = 0;
        int i = 1;

        while(i <= num1){
            resultado = resultado + num2;
            i++;
        }

        System.out.println("El resultado = " + resultado);*/
    }
}
