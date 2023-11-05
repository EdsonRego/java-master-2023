package com.edsonrego.patrones.factory;

import com.edsonrego.patrones.factory.producto.PizzaCaliforniaPepperoni;
import com.edsonrego.patrones.factory.producto.PizzaCaliforniaQueso;
import com.edsonrego.patrones.factory.producto.PizzaCaliforniaVegetariana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory{

    @Override
    PizzaProducto crearPizza(String tipo) {
        return switch (tipo) {
            case "queso" -> new PizzaCaliforniaQueso();
            case "pepperoni" -> new PizzaCaliforniaPepperoni();
            case "vegetariana" -> new PizzaCaliforniaVegetariana();
            default -> null;
        };
    }
}
