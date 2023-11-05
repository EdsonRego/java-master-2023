package com.edsonrego.patrones.decorator;

import com.edsonrego.patrones.decorator.decorator.MaiusculaDecorador;
import com.edsonrego.patrones.decorator.decorator.RemplazarEspaciosDecorador;
import com.edsonrego.patrones.decorator.decorator.ReversaDecorador;
import com.edsonrego.patrones.decorator.decorator.SubrayadoDecorador;

public class EjemploDecorador {
    public static void main(String[] args) {
        Formateable texto = new Texto("Hola que tal Edson");

        MaiusculaDecorador maiuscula = new MaiusculaDecorador(texto);
        ReversaDecorador reversa = new ReversaDecorador(maiuscula);
        SubrayadoDecorador subrayar = new SubrayadoDecorador(reversa);
        RemplazarEspaciosDecorador remplazar = new RemplazarEspaciosDecorador(subrayar);

        System.out.println(remplazar.darFormato());

    }
}
