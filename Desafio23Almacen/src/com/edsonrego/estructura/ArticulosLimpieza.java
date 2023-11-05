package com.edsonrego.estructura;

public class ArticulosLimpieza extends Productos{

    private String fabricante;

    public ArticulosLimpieza(String nombre, String precio, String fabricante) {
        super(nombre, precio);
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
