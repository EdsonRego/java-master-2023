package com.edsonrego.patrones.factory.producto;

import com.edsonrego.patrones.factory.PizzaProducto;

public class PizzaCaliforniaPepperoni extends PizzaProducto {

    public PizzaCaliforniaPepperoni() {
        super();
        nombre = "Pizza California Pepperoni";
        masa = "Masa a la piedra gruesa";
        ingredientes.add("Pepperoni");
        ingredientes.add("Extra queso mozzarella");
        ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando a 55min. a 55grados");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequeños rectângulos");
    }
}
