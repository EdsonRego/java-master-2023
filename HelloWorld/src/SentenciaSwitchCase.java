import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero del mes (1 a 12): ");
        int mes = sc.nextInt();

        String nombreMes = null;

        switch (mes){
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "April";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Augusto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "October";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Deciembre";
                break;
            default:
                nombreMes = "Indefinido";
                System.out.println("No corresponde a un mes");
        }
        System.out.println("nombreMes = " + nombreMes);

        char num = 'z';
        switch (num){
            case '0':
                System.out.println("El num es cero");
                break;
            case '1':
                System.out.println("El numero es uno");
                break;
            case '2':
                System.out.println("El numero es dos");
                break;
            case '3':
                System.out.println("El numero es tres");
                break;
            case 'a':
                System.out.println("El caracter es a");
            default:
                System.out.println("Numero o caracter desconocido");
        }
        String nombre = "Edson";

        switch (nombre){
            case "admin":
                System.out.println("Hola admin, bienvenido!");
                break;
            case "Edson":
                System.out.println("Hola Edson, bienvenido!");
                break;
            case "Andres":
                System.out.println("Hola Andres, bienvenido");
                break;
            default:
                System.out.println("usuario desconocido");
        }
    }
}
