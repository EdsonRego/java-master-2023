import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        //calendario.set(2023,Calendar.AUGUST,25,18,20, 10);
        calendario.set(calendario.YEAR,2020);
        calendario.set(calendario.MONTH,calendario.JULY);
        calendario.set(calendario.DAY_OF_MONTH, 25);

        //calendario.set(calendario.HOUR_OF_DAY, 18);
        calendario.set(calendario.HOUR,7);
        calendario.set(calendario.AM_PM, Calendar.PM);
        calendario.set(calendario.MINUTE,20);
        calendario.set(calendario.SECOND,10);
        calendario.set(calendario.MILLISECOND, 125);

        Date fecha = calendario.getTime();
        System.out.println("Fecha sin formato = " + fecha);

        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SSS a");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss:SSS a");
        String fechaConFormat = sdf.format(fecha);
        System.out.println("Fecha con format = " + fechaConFormat);

        //System.out.println("calendario = " + calendario);

        Calendar calendarioActual = Calendar.getInstance();
        Date fecha2 = calendarioActual.getTime();

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
    }
}
