package com.edsonrego.api.stream.ejemplos;

import com.edsonrego.api.stream.ejemplos.models.Factura;
import com.edsonrego.api.stream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.List;

public class EjemploStreamFlatMapFactura2 {
    public static void main(String[] args) {

        Usuario u1 = new Usuario("John", "Deere");
        Usuario u2 = new Usuario("Pepe", "Perez");

        u1.addFactura(new Factura("compras tecnologías"));
        u1.addFactura(new Factura("muebles"));
        u2.addFactura(new Factura("bicileta"));
        u2.addFactura(new Factura("notebook gamer"));

        List<Usuario> usuarios = Arrays.asList(u1, u2);
        usuarios.stream()
                .map(Usuario::getFacturas)
                .flatMap(List::stream)
                .forEach(f -> System.out.println(f.getDescripcion().concat(" : cliente ")
                        .concat(f.getUsuario().toString())));

//        // tradicional
//        List<Usuario> usuarios = Arrays.asList(u1, u2);
//        for(Usuario u: usuarios){
//            for (Factura f: u.getFacturas()){
//                System.out.println(f.getDescripcion());
//            }
//        }
    }
}
