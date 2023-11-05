package com.edsonrego.proyectocatalogo.modelo;

public abstract class Producto implements IProducto {

    private int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }
}
