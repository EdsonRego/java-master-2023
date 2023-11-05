import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EjemploPropriedadesDeSistemaAsignar {
    public static void main(String[] args) {

        /*Asi que se creo esta clase, también crie manualmente el archivo config.properties en el mismo directório
*/
        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propriedade.personalizada","Mi valor guardado en el objeto properties");

            System.setProperties(p);
            //System.getProperties().list(System.out);
            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(...) = " + ps.getProperty("mi.propriedade.personalizada"));
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("otro"));
            System.out.println(System.getProperty("config.autor.nombre"));
            System.out.println(System.getProperty("config.autor.email"));
            ps.list(System.out);

        }catch (Exception e){
            System.err.println("no existe el archivo = " + e);
            System.exit(1);
        }
    }
}
