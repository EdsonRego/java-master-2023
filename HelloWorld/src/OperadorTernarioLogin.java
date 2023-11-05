import java.util.Scanner;

public class OperadorTernarioLogin {
    public static void main(String[] args) {
        /*String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "EdsonRego";
        passwords[0] = "123456";

        usernames[1] = "admin";
        passwords[1] = "123456";

        usernames[2] = "Pepe";
        passwords[2] = "123456";*/

        String[] usernames = {"EdsonRego","admin","Pepe"};
        String[] passwords = {"123456","123456","123456"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el username: ");
        String u = scanner.nextLine();

        System.out.print("Ingrese el password: ");
        String p = scanner.nextLine();

        boolean esAutenticado = false;

        for(int i = 0; i < usernames.length; i++){
                esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p)) ? true : esAutenticado;

           /* if( usernames[i].equals(u) && passwords[i].equals(p) ){
                esAutenticado = true;
                break;
            }*/
        }

        String mensaje = esAutenticado ? "Bienvenido usuário " .concat(u).concat("!") :
                "Username o contraseña incorrecto!\n Lo sentimos, requiere autenticación";

        System.out.println("mensaje = " + mensaje);
       /* if(esAutenticado){
            System.out.println("Bienvenido usuário " .concat(u).concat("!"));
        }else {
            System.out.println("Username o contraseña incorrecto! ");
            System.out.println("Lo siento, requiere autenticación");
        }*/
    }
}
