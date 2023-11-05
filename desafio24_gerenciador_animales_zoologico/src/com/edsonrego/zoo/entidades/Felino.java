package com.edsonrego.zoo.entidades;

abstract public class Felino extends Mamifero {

    protected Float tamanoGarras;
    protected Integer velocidad;

    public Felino(String habitat, Float altura, Float largo, Float peso, Float tamanoGarras, Integer velocidad) {
        super(habitat, altura, largo, peso);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public Float getTamanoGarras() {
        return tamanoGarras;
    }

    public Integer getVelocidad() {
        return velocidad;
    }
}
