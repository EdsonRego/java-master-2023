package com.edsonrego.estructura;

public class Alimentos extends Productos{

    private String paisOrigen;

    public Alimentos(String nombre, String precio, String paisOrigen) {
        super(nombre, precio);
        this.paisOrigen = paisOrigen;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
}
