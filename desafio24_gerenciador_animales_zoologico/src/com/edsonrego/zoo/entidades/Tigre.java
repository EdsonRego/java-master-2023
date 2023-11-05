package com.edsonrego.zoo.entidades;

public class Tigre extends Felino{

    private String especieTigre;

    public Tigre(String habitat, Float altura, Float largo, Float peso, Float tamanoGarras, Integer velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    @Override
    public String comer() {
        return "El Tigre " + especieTigre + " caza solitario en los manglares y bosques monzónicos de " + habitat;
    }

    @Override
    public String dormir() {
        return "El Tigre " + especieTigre + " duerme en la selvas de " + habitat;
    }

    @Override
    public String correr() {
        return "El Tigre " + especieTigre + " corre a " + velocidad + " km/hr";
    }

    @Override
    public String comunicarse() {
        return "El Ruge Tigre y agacha sus orejas";
    }

    @Override
    public String toString() {
        return  "especie='" + especieTigre +
                "\ntamanoGarras=" + tamanoGarras +
                "\nvelocidad=" + velocidad +
                "\nhabitat='" + habitat +
                "\naltura=" + altura +
                "\nlargo=" + largo +
                "\npeso=" + peso +
                "\nnombreCientifico='" + nombreCientifico ;
    }
}
