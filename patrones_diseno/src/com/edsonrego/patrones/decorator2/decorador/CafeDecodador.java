package com.edsonrego.patrones.decorator2.decorador;

import com.edsonrego.patrones.decorator2.Configurable;

abstract public class CafeDecodador implements Configurable {
    protected Configurable cafe;

    public CafeDecodador(Configurable cafe) {
        this.cafe = cafe;
    }
}
