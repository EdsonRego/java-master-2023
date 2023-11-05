package com.edsonrego.java8.lambda;

import com.edsonrego.java8.lambda.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {
    public static void main(String[] args) {

        System.out.println("========================================");
        Consumer<String> consumidor = saludo -> {
            System.out.println(saludo);
        };
        consumidor.accept("Hola, que tal!");
        System.out.println();

        System.out.println("========================================");
        Consumer<String> cosumidor2 = System.out::println;
        cosumidor2.accept("Hola mundo!!");
        System.out.println();

        System.out.println("========================================");
        Consumer<Date> consumidor3 = fecha -> {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(sdf.format(fecha));
        };
        consumidor3.accept(new Date());
        System.out.println();

        System.out.println("========================================");
        BiConsumer<String,Integer> consumerBi = (nombre, edad) -> {
            System.out.println(nombre + ", tiene " + edad + " años!");
        };
        consumerBi.accept("Edson", 51);
        System.out.println();

        System.out.println("========================================");
        List<String> nombres = Arrays.asList("Edson", "Eva", "Andrés", "Camilly");
        nombres.forEach(cosumidor2);
        System.out.println();

        System.out.println("========================================");
//        Supplier<Usuario> crearUsuario = () -> new Usuario();
        Supplier<Usuario> crearUsuario = Usuario::new;
        Usuario  usuario = crearUsuario.get();

//        Usuario  usuario = new Usuario();
//        BiConsumer<Usuario, String> asignarNombre = (persona, nombre) ->{
//            persona.setNombre(nombre);
//        };
        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;
        asignarNombre.accept(usuario, "Andrés");
        System.out.println("Nombre del usuário: " + usuario.getNombre());
        System.out.println();

        System.out.println("========================================");
//        Supplier<String> provedor = ()->{
//            return "Hola mundo lambda supplier";
//        };

        Supplier<String> provedor = ()-> "Hola mundo lambda supplier";
        System.out.println(provedor.get());
    }
}
