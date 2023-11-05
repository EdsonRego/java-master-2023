package com.edsonrego.patrones.decorator.decorator;

import com.edsonrego.patrones.decorator.Formateable;

public class RemplazarEspaciosDecorador extends TextoDecorador{

    public RemplazarEspaciosDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().replace(" ", "_");
    }
}
