package com.edsonrego.proyectocatalogo.modelo;

public class ProyectoCatalogo {
    public static void main(String[] args) {

        IProducto[] productos = new Producto[6];
        productos[0] = new TvLcd(1000, "Philips", 50);
        productos[1] = new TvLcd(1100, "Gratiente", 40);
        productos[2] = new TvLcd(1500, "Sony", 65);
        productos[3] = new Libro(50, "Myles Munroe", "A Pessoa mais importante da terra", "Gospel");
        productos[4] = new Libro(100, "Moisés", "Genesis", "Gospel");
        productos[5] = new IPhone(5000, "Apple", "IPhone 5", "Cinza");

        for (IProducto producto : productos) {

            System.out.print("Tipo de: " + producto.getClass().getName());
            System.out.print(" - ");
            System.out.print("Precio: " + producto.getPrecio());
            System.out.print(" - ");
            System.out.print("Precio final: " + producto.getPrecioVenta());

            // Para los Electronicos  ============
            if (producto instanceof IElectronico) {
                System.out.print(" - ");
                System.out.print("Fabricante: " + ((IElectronico) producto).getFabricante());

                // Para los IPhone ============
                if (producto instanceof IPhone) {
                    System.out.print(" - ");
                    System.out.print("Modelo: " + ((IPhone) producto).getModelo());
                    System.out.print(" - ");
                    System.out.print("Color: " + ((IPhone) producto).getColor());
                }

                // Para los LCD  ============
                if (producto instanceof TvLcd) {
                    System.out.print(" - ");
                    System.out.print("Pulgadas: " + ((TvLcd) producto).getPulgada());
                }
            }

            // Para los Libros  ============
            if (producto instanceof ILibro) {
                System.out.print(" - ");
                System.out.print("Titulo: " + ((ILibro) producto).getTitulo());
                System.out.print(" - ");
                System.out.print("Autor: " + ((ILibro) producto).getAutor());

                // Para los Comics  ============
                if (producto instanceof Comics) {
                    System.out.print(" - ");
                    System.out.print("Personaje: " + ((Comics) producto).getPersonaje());
                }

            }

            System.out.println();
        }
    }
}
