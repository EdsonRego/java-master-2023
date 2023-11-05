import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        System.out.print("Ingrese una fecha con el formato 'yyyy-MM-dd': ");
        try {
            Date fecha = sdf.parse(sc.next());
            System.out.println("fecha = " + fecha);
            System.out.println("sdf.format(fecha) = " + sdf.format(fecha));

            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);

            // Comparación de Fechas
            if(fecha.after(fecha2)){
                System.out.println("Fecha1 (del usuario) és después que Fecha2 (actual");
            } else if (fecha.before(fecha2)) {
                System.out.println("Fecha1 (del usuario) és anterior que Fecha2 (actual)");
            } else if (fecha.equals(fecha2)) {
                System.out.println("Fecha1 (del usuario) es igual que Fecha2 (actual)");
            }
            
            // Comparación de Fecha con el metodo compareTo(), retorna um numero inteiro
            if (fecha.compareTo(fecha2) > 0){
                System.out.println("Fecha1 (del usuario) és después que Fecha2 (actual");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("Fecha1 (del usuario) és anterior que Fecha2 (actual)");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("Fecha1 (del usuario) es igual que Fecha2 (actual)");
            }
        } catch (ParseException e) {
            //throw new RuntimeException(e);
            System.err.println("La fecha tiene un formato incorrecto: " + e.getMessage());
            System.err.println("El formato deve ser 'yyyy-MM-dd' ");
            System.exit('1');
            //main(args);
        }
    }
}
