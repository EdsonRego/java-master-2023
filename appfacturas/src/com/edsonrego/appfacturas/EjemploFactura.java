package com.edsonrego.appfacturas;

import com.edsonrego.appfacturas.modelo.*;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setCnpj("106.709.608-61");
        cliente.setNombre("Edson Gomes");

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la descripción de la factura: ");
        Factura factura = new Factura(sc.nextLine(), cliente);

        Producto producto;

        System.out.println();

        for (int i = 0; i < 2 ; i++){
            producto = new Producto();

            System.out.print("Ingrese producto No.: " + producto.getCodigo() + ": ");
            producto.setNombre(sc.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(sc.nextFloat());

            System.out.print("Ingrese la cantidad: ");
            factura.addItemFactura(new ItemFactura(sc.nextInt(), producto));

            System.out.println();
            sc.nextLine();

        }

        System.out.println(factura);
    }
}
