public class EjemploStringConcatenacion {
    public static void main(String[] args) {

        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        String detalles = curso + " con el instructor " + profesor;
        System.out.println(detalles);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalles + (numeroA + numeroB));

        System.out.println(numeroA + numeroB + detalles);
        
        String detalles2 = curso.concat(" con ").concat(profesor);
        System.out.println("detalles2 = " + detalles2);
    }
}
