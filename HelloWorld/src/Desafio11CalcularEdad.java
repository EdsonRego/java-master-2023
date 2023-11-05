import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Desafio11CalcularEdad {
    public static void main(String[] args) throws ParseException {
        //Professor
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un fecha de nacimiento con formato yyyy-MM-dd: ");
        String fechaNascimento = sc.next();

        DateFormat sdf = new SimpleDateFormat("yyyyMMdd");

        Date fechaNacimiento = sdf.parse(fechaNascimento);
        Date fechaActual = new Date();

        // creamos un patron de fecha numérico con el año mes y día
        sdf = new SimpleDateFormat("yyyyMMdd");

        // luego convertimos ambas fechas la actual y la fecha de nacimiento
        // en enteros que contiene el año mes y día
        int nascimento = Integer.parseInt(sdf.format(fechaNacimiento));
        int hoyDia = Integer.parseInt(sdf.format(fechaActual));
        System.out.println("nascimento = " + nascimento);
        System.out.println("hoyDia = " + hoyDia);

        // luego restamos ambas fechas y dividimos en 10000 para quitar decimales y
        // dejar la fecha en decenas o centenas
        int edad = (hoyDia - nascimento) / 10000;
        System.out.println("La edad es: " + edad);
    }
}
/*
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el ano del nascimento [dd/nn/yyyy]: ");
        String fecha = sc.next();

        Date fechaNac=null;

        try {
            fechaNac = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
        } catch (Exception e ) {
            System.out.println("Error:" + e);
        }

        Calendar fechaActual = Calendar.getInstance();
        Calendar fechaNacimiento = Calendar.getInstance();

        fechaNacimiento.setTime(fechaNac);

        int ano = fechaActual.get(Calendar.YEAR)- fechaNacimiento.get(Calendar.YEAR);
        int mes = fechaActual.get(Calendar.MONTH)- fechaNacimiento.get(Calendar.MONTH);
        int dia = fechaActual.get(Calendar.DATE)- fechaNacimiento.get(Calendar.DATE);

        if(mes<0 || (mes==0 && dia<0)) {
            System.out.println("Edad = " + ano);
        }
    }
}*/
