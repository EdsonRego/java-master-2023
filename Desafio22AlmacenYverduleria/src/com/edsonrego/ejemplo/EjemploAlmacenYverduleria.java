package com.edsonrego.ejemplo;

import com.edsonrego.estructura.*;

public class EjemploAlmacenYverduleria {
    public static void main(String[] args) {

        Lacteo leite = new Lacteo("Leite em pó", "100", 10, 200);
        Lacteo queijo = new Lacteo("Queijo", "300", 1, 2000);
        Fruta laranja = new Fruta("Laranja","50", 12,"laranja");
        Fruta banana = new Fruta("Banana","35",12,"Amarelo");
        Limpieza sabao = new Limpieza("Sabão","20","pó",1.0);
        Limpieza desinfetante = new Limpieza("desinfetante","10","líquido",1.5);
        NoPerecible aceite = new NoPerecible("Aceite", "500", 333, 80);
        NoPerecible mantequilla = new NoPerecible("Mantequilla", "1500", 123, 456);

        Producto[] productos = {leite,queijo,laranja,banana,sabao,desinfetante, aceite, mantequilla};

         for(Producto prod: productos){
             System.out.println("Nombre: " + prod.getNombre());
             System.out.println("Precio: " + prod.getPrecio());
            if (prod.equals(leite)) {
                System.out.println("Cantidad: " + leite.getCantidad());
                System.out.println("Proteinas: " + leite.getProteinas());
            }else if (prod.equals(queijo)) {
                System.out.println("Cantidad: " + queijo.getCantidad());
                System.out.println("Proteinas: " +queijo.getProteinas());
             } else if (prod.equals(laranja)) {
                System.out.println("Peso: " + laranja.getPeso() + "kg");
                System.out.println("Color: " + laranja.getColor());
            }else if (prod.equals(banana)) {
                System.out.println("Peso: " + banana.getPeso() +"kg");
                System.out.println("Color: " + banana.getColor());
            }else if (prod.equals(sabao)){
                System.out.println("Componentes" + sabao.getComponentes());
                System.out.println("Litros: " + sabao.getLitros() + "L");
            }else if (prod.equals(desinfetante)){
                System.out.println("Componentes" + desinfetante.getComponentes());
                System.out.println("Litros: " + desinfetante.getLitros() + "L");
            }else if (prod.equals(aceite)){
                System.out.println("Contenido: " + aceite.getContenido() + "ml");
                System.out.println("Calorias " + aceite.getCalorias() + "Cal");
            }else if (prod.equals(mantequilla)){
                System.out.println("Contenido: " + mantequilla.getContenido());
                System.out.println("Calorias: " + mantequilla.getCalorias() + "Cal");
            }
             System.out.println();
         }

        System.out.println();

        System.out.println("===============Profesor=================");

        for (Producto prod : productos) {
            System.out.println("-------------------------------- " + prod.getClass().getSimpleName() + "---------------------------------");
            System.out.println("Nombre: " + prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());

            if (prod instanceof Fruta) {
                System.out.println("Peso (gr): " + ((Fruta) prod).getPeso());
                System.out.println("Color: " + ((Fruta) prod).getColor());
            } else if (prod instanceof Limpieza) {
                System.out.println("Componentes: " + ((Limpieza) prod).getComponentes());
                System.out.println("Litros: " + ((Limpieza) prod).getLitros());
            } else if (prod instanceof Lacteo) {
                System.out.println("Cantidad (gr/cc): " + ((Lacteo) prod).getCantidad());
                System.out.println("Proteinas (gr): " + ((Lacteo) prod).getProteinas());
            } else if (prod instanceof NoPerecible) {
                System.out.println("Calorias (kCal): " + ((NoPerecible) prod).getCalorias());
                System.out.println("Contenido neto (gr): " + ((NoPerecible) prod).getContenido());
            }
        }
    }
}
