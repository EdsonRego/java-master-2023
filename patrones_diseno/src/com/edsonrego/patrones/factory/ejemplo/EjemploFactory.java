package com.edsonrego.patrones.factory.ejemplo;

import com.edsonrego.patrones.factory.PizzaProducto;
import com.edsonrego.patrones.factory.PizzeriaCaliforniaFactory;
import com.edsonrego.patrones.factory.PizzeriaNewYorkFactory;
import com.edsonrego.patrones.factory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory california = new PizzeriaCaliforniaFactory();

        PizzaProducto pizza = california.ordernarPizza("queso");
        System.out.println("Brune ordena la pizza " + pizza.getNombre());

        pizza = ny.ordernarPizza("pepperoni");
        System.out.println("Edson ordena la pizza " + pizza.getNombre());

        pizza = california.ordernarPizza("vegetariana");
        System.out.println("Andres ordena la pizza " + pizza.getNombre());

        pizza = ny.ordernarPizza("vegetariana");
        System.out.println("Linus ordena la pizza " + pizza.getNombre());

        pizza = california.ordernarPizza("pepperoni");
        System.out.println("Jonh Deere ordena la pizza " + pizza.getNombre());

        System.out.println("pizza = " + pizza);

        /*
        * Inicialmente define-se os produtos abstratos e concretos que serão usados pela factory
        *
        * 1 - Criar a classe abstracta PizzaProducto
        *
        * 2 - Criar a classe abstracta factory PizzeriaZonaAbstractFactory, com o método concreto e abstrato
        *
        * 3 - Criar a fábrica concreta PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory
        * 3 - Criar a fábrica concreta PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory
        *
        * 4 - Criar o producto concreto PizzaNewYorkVegetariana extends PizzaProducto
        * 4 - Criar o producto concreto PizzaNewYorkItaliana extends PizzaProducto
        * 4 - Criar o producto concreto PizzaNewYorkPepperoni extends PizzaProducto
        * 4 - Criar o producto concreto PizzaCaliforniaVegetariana extends PizzaProducto
        * 4 - Criar o producto concreto PizzaCaliforniaItaliana extends PizzaProducto
        * 4 - Criar o producto concreto PizzaCaliforniaPepperoni extends PizzaProducto
        *
        * 5 - Criar classe com método main
        *       usar o tipo mais abstrato PizzeriaZonaAbstractFactory
        *       para criar o tipo concreto
        *
        *       PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        *
        *
        * */

    }
}
