import java.util.Scanner;

public class Desafio01DetalleDeFactura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la factura");
        String nombreDeLaFactura = scanner.nextLine();

        System.out.println("Ingrese primero precio");
        Double productoPrecio1 = scanner.nextDouble();

        System.out.println("Ingrese primero precio");
        Double productoPrecio2 = scanner.nextDouble();
        Double impuesto = 1.19;

        Double totalSinImpuesto = productoPrecio1 + productoPrecio2;
        Double totalConImpuesto = totalSinImpuesto * impuesto;

        System.out.println("Nombre de la factura: "
                + nombreDeLaFactura + " Total sin Impuestos: "
                + totalSinImpuesto + " Total con impuestos: "
                + totalConImpuesto);


    }
}
