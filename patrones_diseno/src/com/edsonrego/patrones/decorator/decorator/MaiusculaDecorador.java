package com.edsonrego.patrones.decorator.decorator;

import com.edsonrego.patrones.decorator.Formateable;

public class MaiusculaDecorador extends TextoDecorador{

    public MaiusculaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().toUpperCase();
    }
}
