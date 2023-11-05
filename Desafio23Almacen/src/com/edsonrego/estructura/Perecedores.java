package com.edsonrego.estructura;

public class Perecedores extends Alimentos{

    private String validad;

    public Perecedores(String nombre, String precio, String paisOrigen, String validad) {
        super(nombre, precio, paisOrigen);
        this.validad = validad;
    }

    public String getValidad() {
        return validad;
    }

    public void setValidad(String validad) {
        this.validad = validad;
    }
}
