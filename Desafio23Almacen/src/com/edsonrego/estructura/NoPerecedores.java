package com.edsonrego.estructura;

public class NoPerecedores extends Alimentos{

    private String fabricacion;

    public NoPerecedores(String nombre, String precio, String paisOrigen, String fabricacion) {
        super(nombre, precio, paisOrigen);
        this.fabricacion = fabricacion;
    }

    public String getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(String fabricacion) {
        this.fabricacion = fabricacion;
    }
}
