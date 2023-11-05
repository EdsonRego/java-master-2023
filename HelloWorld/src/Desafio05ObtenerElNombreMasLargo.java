import javax.swing.*;

public class Desafio05ObtenerElNombreMasLargo {
    public static void main(String[] args) {

        String nombre1 = JOptionPane.showInputDialog("Ingrese el primero nombre:");
        String nombre2 = JOptionPane.showInputDialog("Ingrese el segundo nombre:");
        String nombre3 = JOptionPane.showInputDialog("Ingrese el tercero nombre:");
        
        String mayorNombre = (nombre1.length() > nombre2.length()) ? nombre1 : nombre2 ;
        mayorNombre = (mayorNombre.length() > nombre3.length()) ? mayorNombre : nombre3 ;

        String[] resultado = mayorNombre.split(" ");

        /*//Solución Profesor
        String max = (nombre1.split(" ")[0].length() < nombre2.split(" ")[0].length()) ? nombre2 : nombre1;
        max = (nombre3.split(" ")[0].length() < max.split(" ")[0].length()) ? max: nombre3;

        System.out.println("La persona con el nombre mas largo es " + max);*/

        System.out.println(resultado[0] + " tiene el nombre más largo");
    }
}
