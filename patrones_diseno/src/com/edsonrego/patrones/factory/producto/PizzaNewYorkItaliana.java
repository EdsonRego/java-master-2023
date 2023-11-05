package com.edsonrego.patrones.factory.producto;

import com.edsonrego.patrones.factory.PizzaProducto;

public class PizzaNewYorkItaliana extends PizzaProducto {

    public PizzaNewYorkItaliana() {
        super();
        nombre = "Pizza Italiana New York";
        masa = "Masa gruesa";
        salsa = "Salsa de tomate italiano carne";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Aceitunas");
        ingredientes.add("Jamón");
        ingredientes.add("Choricillo");
        ingredientes.add("Champinõnes");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 20min a 120 grados");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triângulos grandes");
    }
}
