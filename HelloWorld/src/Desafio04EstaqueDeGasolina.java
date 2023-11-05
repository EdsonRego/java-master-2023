import java.util.Scanner;

public class Desafio04EstaqueDeGasolina {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la medida actual de la Gasolina en el estaque: ");

        Double medidaActual = sc.nextDouble();

        if (medidaActual == 70){
            System.out.println("Estanque lleno");
        }else if(medidaActual >= 60 && medidaActual < 70){
            System.out.println("Estanque casi lleno");
        }else if(medidaActual >= 40 && medidaActual < 60){
            System.out.println("Estanque 3/4");
        }else if(medidaActual >= 35 && medidaActual < 40){
            System.out.println("Medio estanque");
        }else if(medidaActual >= 20 && medidaActual < 35){
            System.out.println("Suficiente");
        }else if(medidaActual >= 1 && medidaActual < 20){
            System.out.println("Insuficiente");
        }else {
            System.out.println("Fuera de la capacidad");
        }
    }
}
