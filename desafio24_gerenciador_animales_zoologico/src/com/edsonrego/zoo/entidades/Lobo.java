package com.edsonrego.zoo.entidades;

public class Lobo extends Canino{
    private Integer numCamadas;
    private String especieLobo;

    public Lobo(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, String color, Float tamanoColmillos, Integer numCamadas, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numCamadas = numCamadas;
        this.especieLobo = especieLobo;
    }

    public Integer getNumCamadas() {
        return numCamadas;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return "El Lobo " + especieLobo + " caza junto a su grupo de " + numCamadas + " individuos en los bosques de " + habitat;
    }

    @Override
    public String dormir() {
        return "El Lobo " + color + " duerme en las cabernas de " + habitat;
    }

    @Override
    public String correr() {
        return "El Lobo " + especieLobo + " corre en las llanuras aledañas a los bosques de " + habitat;
    }

    @Override
    public String comunicarse() {
        return "El Lobo " + especieLobo + " " + color + " aulla en luna llena";
    }

    @Override
    public String toString() {
        return  "numCamadas=" + numCamadas +
                "\nespecieLobo='" + especieLobo + '\'' +
                "\ncolor='" + color + '\'' +
                "\ntamanoColmillos=" + tamanoColmillos +
                "\nhabitat='" + habitat + '\'' +
                "\naltura=" + altura +
                "\nlargo=" + largo +
                "\npeso=" + peso +
                "\nnombreCientifico='" + nombreCientifico;
    }
}
