package com.edsonrego.patrones.factory;

import com.edsonrego.patrones.factory.producto.PizzaNewYorkItaliana;
import com.edsonrego.patrones.factory.producto.PizzaNewYorkVegetariana;
import com.edsonrego.patrones.factory.producto.PizzaNovaYorkPepperoni;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory{

    @Override
    PizzaProducto crearPizza(String tipo) {

        return switch (tipo) {
            case "vegetariana" -> new PizzaNewYorkVegetariana();
            case "pepperoni" -> new PizzaNovaYorkPepperoni();
            case "italiana" -> new PizzaNewYorkItaliana();
            default -> null;
        };
    }
}
