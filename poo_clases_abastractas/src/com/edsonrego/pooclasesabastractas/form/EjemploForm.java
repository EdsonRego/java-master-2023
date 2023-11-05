package com.edsonrego.pooclasesabastractas.form;

import com.edsonrego.pooclasesabastractas.form.elementos.*;
import com.edsonrego.pooclasesabastractas.form.elementos.select.Opcion;
import com.edsonrego.pooclasesabastractas.form.validador.*;

import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("usename");
        username.addValidador(new RequiridoValidador());

        InputForm password = new InputForm("clave","password");
        password.addValidador(new RequiridoValidador())
        .addValidador(new LargoValidador(6,12));

        InputForm email = new InputForm("email","email");
        email.addValidador(new RequiridoValidador())
                .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad","number");
        edad.addValidador(new NumeroValidador());

        TextareaForm experiencia = new TextareaForm("exp",5,9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NonNuloValidador());

        lenguaje.addOpcion(new Opcion("1","java").setSelected())
        .addOpcion(new Opcion("2","Python"))
        .addOpcion(new Opcion("3","JavaScript"))
        .addOpcion(new Opcion("4","TypeScript"))
        .addOpcion(new Opcion("5","PHP"));

        //Ejemplo Clase Anonima, implementando a clase abstracta ElementoForm
        ElementoForm saludar = new ElementoForm() {
            @Override
            public String dibujarHtml() {
                return "<input disable name='" + this.nombre + "' value=\"" + this.valor + "\">";
            }
        };

        saludar.setValor("Hola que tal, este campo está desabilitado");
        //Fim da implementação da Clase Anonima

        username.setValor("john.deere");
        password.setValor("123456");
        email.setValor("john.deere@gmail.com");
        edad.setValor("28");
        experiencia.setValor("...más de 10 años de experiencia...");
//        java.setSelected(true);

        List<ElementoForm> elementos = Arrays.asList(username,
                password,
                email,
                edad,
                experiencia,
                lenguaje,
                saludar);

//        for(ElementoForm e: elementos){
//            System.out.println(e.dibujarHtml());
//            System.out.println("<br>");
//        }

        elementos.forEach( e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });

        elementos.forEach(e ->{
            if(!e.esValido()){
                    e.getErrores().forEach(System.out::println);
            }
        });

    }
}
