package com.edsonrego.zoo.entidades;

public class Guepardo extends Felino{

    public Guepardo(String habitat, Float altura, Float largo, Float peso, Float tamanoGarras, Integer velocidad) {
        super(habitat, altura, largo, peso, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El Guepardo caza junto a su grupo en las llanuras africanas, con un mordida mucho inferior a los demás felinos grandes.";
    }

    @Override
    public String dormir() {
        return "El Guepardo duerme en las estepas africanas";
    }

    @Override
    public String correr() {
        return "El Guepardo es el felino mas rápido del mundo, corre a " + velocidad + " km/hr";
    }

    @Override
    public String comunicarse() {
        return "El Guepardo ruge no tan fuerte como el Leon";
    }

    @Override
    public String toString() {
        return  "tamanoGarras=" + tamanoGarras +
                "\nvelocidad=" + velocidad +
                "\nhabitat='" + habitat +
                "\naltura=" + altura +
                "\nlargo=" + largo +
                "\npeso=" + peso +
                "\nnombreCientifico='" + nombreCientifico;
    }
}
