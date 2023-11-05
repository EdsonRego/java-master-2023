package com.edsonrego.patrones.decorator2;

import com.edsonrego.patrones.decorator2.decorador.ConChocolateDecorador;
import com.edsonrego.patrones.decorator2.decorador.ConCremaDecorador;
import com.edsonrego.patrones.decorator2.decorador.ConLecheDecorador;

public class EjemploDecoradorCafe {
    public static void main(String[] args) {
        Configurable cafeMocha = new Cafe("Café Mocha", 7);
        ConCremaDecorador conCrema = new ConCremaDecorador(cafeMocha);
        ConLecheDecorador conLeche = new ConLecheDecorador(conCrema);
        ConChocolateDecorador conChocolate = new ConChocolateDecorador(conLeche);

        System.out.println("El precio del Café Mocha és " + conChocolate.getPrecioBase());
        System.out.println("Los ingredientes del Café Mocha son " + conChocolate.getIngredientes());

        Configurable capuchino  = new Cafe("Café Capuchino", 4);
        conCrema = new ConCremaDecorador(capuchino);
        conLeche = new ConLecheDecorador(conCrema);

        System.out.println("El precio del Café Mocha és " + conLeche.getPrecioBase());
        System.out.println("Los ingredientes del Café Mocha son " + conLeche.getIngredientes());

        Configurable expresso  = new Cafe("Café Expresso", 3);

        System.out.println("El precio del Café Expresso és " + expresso.getPrecioBase());
        System.out.println("Los ingredientes del Café Expresso son " + expresso.getIngredientes());

    }
}
