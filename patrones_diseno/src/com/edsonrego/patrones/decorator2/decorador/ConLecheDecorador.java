package com.edsonrego.patrones.decorator2.decorador;

import com.edsonrego.patrones.decorator2.Configurable;

public class ConLecheDecorador extends CafeDecodador{
    public ConLecheDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase() + 3.7f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() + ", Leche";
    }
}
