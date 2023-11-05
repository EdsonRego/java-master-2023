import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua data de nascimento: yyyy-mm-dd ");
        String fecha1 = sc.nextLine();

        LocalDate fechaNascimento = LocalDate.parse(fecha1);
        LocalDate fechaActual = LocalDate.now();
        System.out.println("fechaNascimento = " + fechaNascimento);
        System.out.println("fechaActual = " + fechaActual);

        Period edad = Period.between(fechaActual,fechaNascimento);
        System.out.println("edad = " + edad);

        System.out.printf("Você tem %d años, %d meses y %d días de idade "
                , edad.getYears(), edad.getMonths(), edad.getDays());
        


    }
}
