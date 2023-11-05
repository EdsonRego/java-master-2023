package com.edsonrego.patrones.decorator2.decorador;

import com.edsonrego.patrones.decorator2.Configurable;

public class ConChocolateDecorador extends CafeDecodador{

    public ConChocolateDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase() + 5f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() + ", Chocolate";
    }
}
