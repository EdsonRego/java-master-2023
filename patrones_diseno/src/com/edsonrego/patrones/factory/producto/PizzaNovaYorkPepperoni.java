package com.edsonrego.patrones.factory.producto;

import com.edsonrego.patrones.factory.PizzaProducto;

public class PizzaNovaYorkPepperoni extends PizzaProducto {

    public PizzaNovaYorkPepperoni() {
        super();
        nombre = "Pizza Pepperoni Nova York";
        masa = "Masa delgada a la piedra";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Extra pepperoni");
        ingredientes.add("Aceitunas");

    }

    @Override
    public void cocinar() {
        System.out.println("Cocinas por 40 min. a 90grados");
    }

    @Override
    public void cortar() {
        System.out.println("Cortar la pizza en triângulos");
    }
}
