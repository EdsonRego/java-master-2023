import java.util.Scanner;

public class Desafio12AreaCirculo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la medida del raio: ");
        double raio = sc.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("Lar area de la circunferencia de raio " + raio + " es = " + area);
    }
}
