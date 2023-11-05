package com.edsonrego.patrones.factory;

abstract public class PizzeriaZonaAbstractFactory {

    public PizzaProducto ordernarPizza(String tipo){
        PizzaProducto pizza = crearPizza(tipo);
        System.out.println("=========== Fabricante " + pizza.getNombre() + "===========");
        pizza.preparar();
        pizza.cocinar();
        pizza.cortar();
        pizza.empaquetar();
        System.out.println();
        return pizza;
    }

    abstract PizzaProducto crearPizza(String tipo);
}
