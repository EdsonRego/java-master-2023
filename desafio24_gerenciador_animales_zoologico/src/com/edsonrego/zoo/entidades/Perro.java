package com.edsonrego.zoo.entidades;

public class Perro extends Canino{
    private Integer fuerzaMordida;

    public Perro(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, String color, Float tamanoColmillos, Integer fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public Integer getFuerzaMordida() {
        return fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El perro africano caza en manada con una fuerte mordida de " + fuerzaMordida + " PSI, posee fuertes mandíbulas y grandes orejas redondeadas";
    }

    @Override
    public String dormir() {
        return "El perro africano duerme en la sabana africana";
    }

    @Override
    public String correr() {
        return "El perro africano corre en las llanuras aledañas a la sabana!";
    }

    @Override
    public String comunicarse() {
        return "Los perros ladran de noche durante cacerías nocturnas";
    }

    @Override
    public String toString() {
        return  "fuerzaMordida=" + fuerzaMordida +
                "\ncolor='" + color +
                "\ntamanoColmillos=" + tamanoColmillos +
                "\nhabitat='" + habitat +
                "\naltura=" + altura +
                "\nlargo=" + largo +
                "\npeso=" + peso +
                "\nnombreCientifico='" + nombreCientifico;
    }
}
