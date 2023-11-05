import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        Date fecha = new Date();

        System.out.println("fecha = " + fecha);

        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM, yyyy");
        String fechaStr = sdf.format(fecha);
        System.out.println("fechaStr = " + fechaStr);

        SimpleDateFormat sdf1 = new SimpleDateFormat("EEEE dd 'de' MMMM, yyyy");
        fechaStr = sdf1.format(fecha);
        System.out.println("fechaStr = " + fechaStr);

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        fechaStr = sdf2.format(fecha);
        System.out.println("fechaStr = " + fechaStr);

        long j = 0;
        for (int i = 0; i < 100000000; i++){
            j +=i;
        }
        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("Tiempo transcorrido en el for  = " + tiempoFinal);
    }
}
