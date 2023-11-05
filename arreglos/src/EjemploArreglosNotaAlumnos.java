import java.util.Scanner;

public class EjemploArreglosNotaAlumnos {
    public static void main(String[] args) {

        double[] claseMatematicas, claseHistoria, claseLenguaje;
        double sumNotasMatematicas = 0, sumNotasHistoria = 0, sumNotasLenguaje = 0;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 7 notas - Matemáticas");
        for (int i = 0; i < claseMatematicas.length; i++){
            System.out.print("Ingrese la nota " + (i + 1) + ": " + "= ");
            claseMatematicas[i] = sc.nextDouble();
        }

        System.out.println("Ingrese 7 notas - Historia");
        for(int i = 0; i < claseHistoria.length; i++){
            System.out.print("Ingrese la nota " + (i + 1) + "= ");
            claseHistoria[i] = sc.nextDouble();
        }

        System.out.println("Ingrese 7 notas - Lenguaje");
        for (int i = 0 ; i < claseLenguaje.length; i++){
            System.out.print("Ingrese la nota " + (i + 1) + "= ");
            claseLenguaje[i] = sc.nextDouble();
        }

        for(int i = 0; i < 7; i++){
            sumNotasMatematicas += claseMatematicas[i];
            sumNotasHistoria += claseHistoria[i];
            sumNotasLenguaje += claseLenguaje[i];
        }

        double promedioMatematicas = sumNotasMatematicas / claseMatematicas.length;
        double promedioHistoria = sumNotasHistoria / claseHistoria.length;
        double promedioLenguaje = sumNotasLenguaje / claseLenguaje.length;
        System.out.println("Promedio clase Matematicas = " + promedioMatematicas);
        System.out.println("Promedio clase Historia = " + promedioHistoria);
        System.out.println("Promedio clase Lenguaje = " + promedioLenguaje);
        System.out.println("Promedio total "
                + (promedioMatematicas + promedioHistoria + promedioLenguaje)/3);

        System.out.println("Ingrese el numero del aluno [0 a 6]: ");
        int idAlumno = sc.nextInt();
        double promedioAluno = (claseMatematicas[idAlumno] + claseHistoria[idAlumno] + claseLenguaje[idAlumno])/3;
        System.out.println("Promedio aluno numero: " + idAlumno + " = " + promedioAluno);
    }
}
