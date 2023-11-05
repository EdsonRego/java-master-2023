package com.edsonrego.genericsclass;

public class EjemploGenericos {

    public static <T> void imprimirCamion(Camion<T> camion){
        for (T a: camion){
            if(a instanceof Animal) {
                System.out.println("Nombre: " + ((Animal) a).getNombre() + " - Tipo: " + ((Animal) a).getTipo());
            } else if (a instanceof Automovil){
                System.out.println("Marca: " + ((Automovil)a).getMarca());
            } else if (a instanceof Maquinaria) {
                System.out.println("Nombre: " + ((Maquinaria)a).getTipo());
            }
        }

    }

    public static void main(String[] args) {

        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("Peregrino", "Caballo"));
        transporteCaballos.add(new Animal("Pegasus", "Caballo"));
        transporteCaballos.add(new Animal("Turquen", "Caballo"));
        transporteCaballos.add(new Animal("Pangare", "Caballo"));
        transporteCaballos.add(new Animal("Longotoma", "Caballo"));

        imprimirCamion(transporteCaballos);

        Camion<Maquinaria> transporteMaquinas = new Camion<>(3);
        transporteMaquinas.add(new Maquinaria("Bulldozer"));
        transporteMaquinas.add(new Maquinaria("Grua horquilla"));
        transporteMaquinas.add(new Maquinaria("Perfuradora"));

        imprimirCamion(transporteMaquinas);

        Camion<Automovil> transporteAuto = new Camion<>(3);
        transporteAuto.add(new Automovil("Toyota"));
        transporteAuto.add(new Automovil("Chevrolet"));
        transporteAuto.add(new Automovil("Mitsubishi"));

        imprimirCamion(transporteAuto);
    }
}
