import java.util.Properties;

public class EjemploPropriedadesDeSistema {
    public static void main(String[] args) {

        String username = System.getProperty("user.home");
        System.out.println("username = " + username);

        String home = System.getProperty("java.home");
        System.out.println("home = " + home);

        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        String lineSparator = System.getProperty("line.separator");
        System.out.println("lineSparator:  " + lineSparator + "Una linea nueva..");

        String lineSparator2 = System.lineSeparator();
        System.out.println("lineSparator2  " + lineSparator2 + "Una linea nueva..");

        System.out.println();
        //Todas las propriedades
        System.out.println("Todas las propriedades");
        Properties prop = System.getProperties();
        prop.list(System.out);
    }
}
