import java.util.Map;

public class EjemploPropriedadesDeSistemaVariablesDeEntorno {
    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv();
        System.out.println("Variables de ambiente del sistema = " + varEnv);

        System.out.println("--Listando variables de entorno del sistema--");
        for(String key: varEnv.keySet()){
            System.out.println(key + " => " + varEnv.get(key));
        }

        String usenamer = System.getenv("USERNAME");
        System.out.println("usenamer = " + usenamer);
        
        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String tempDir = System.getenv("TEMP");
        System.out.println("tempDir = " + tempDir);

        String path = System.getenv("Path");
        System.out.println("path = " + path);

        String path2 = varEnv.get("Path");
        System.out.println("path = " + path2);
    }
}
