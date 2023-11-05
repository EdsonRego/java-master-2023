import java.util.Scanner;

public class OperadoresLogicoLogin {
    public static void main(String[] args) {

        String username = "EdsonRego";
        String password = "123456";

        String username2 = "admin";
        String password2 = "123456";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el username: ");
        String u = scanner.nextLine();

        System.out.print("Ingrese el password: ");
        String p = scanner.nextLine();

        boolean esAutenticado = false;

        if((username.equals(u) && password.equals(p)) || (username2.equals(u) && password2.equals(p))){
            esAutenticado = true;
        }else {
            System.out.println("Username o contraseña incorrecto! ");
        }

        if(esAutenticado){
            System.out.println("Bienvenido usuário " .concat(u).concat("!"));
        }else {
            System.out.println("Lo siento, requiere autenticación");
        }
    }
}
