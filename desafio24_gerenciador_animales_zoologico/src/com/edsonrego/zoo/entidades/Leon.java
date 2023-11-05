package com.edsonrego.zoo.entidades;

public class Leon extends Felino{

    private Integer numManadas;
    private Float potenciaRugidoDecibel;

    public Leon(String habitat, Float altura, Float largo, Float peso, Float tamanoGarras, Integer velocidad, Integer numManadas, Float potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, tamanoGarras, velocidad);
        this.numManadas = numManadas;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public Integer getNumMamadas() {
        return numManadas;
    }

    public Float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El León caza junto a su grupo de " + numManadas + " individuos en las llanuras africanas";
    }

    @Override
    public String dormir() {
        return "El Leon duerme en las estepas africanas";
    }

    @Override
    public String correr() {
        return "El Leon corre a " + velocidad + " km/hr";
    }

    @Override
    public String comunicarse() {
        return "El Leon ruge fuerte a " + potenciaRugidoDecibel + " decibeles";
    }

    @Override
    public String toString() {
        return  "numManadas=" + numManadas +
                "\npotenciaRugidoDecibel=" + potenciaRugidoDecibel +
                "\ntamanoGarras=" + tamanoGarras +
                "\nvelocidad=" + velocidad +
                "\nhabitat='" + habitat +
                "\naltura=" + altura +
                "\nlargo=" + largo +
                "\npeso=" + peso +
                "\nnombreCientifico='" + nombreCientifico;
    }
}
