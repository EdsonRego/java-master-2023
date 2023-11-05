public class SentenciaBuclesEtiquetasBuscar {
    public static void main(String[] args) {

        String frase = "trigo tres tristes tigres tragan trigotrigo en un trigaltrigo";
        String palabra = "trigo";

        int maxPalavra = palabra.length();
        int maxFrase = frase.length() - maxPalavra;


        int cantidad = 0;
        char letra = 'g';

        buscar:
        for (int i = 0; i <= maxFrase ; ){
            int k = i;
            for (int j = 0; j < maxPalavra ; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    i++;
                    continue buscar;
                }
            }
                cantidad++;
                i = i + maxPalavra;
        }
        System.out.println("Encontrados = " + cantidad + " veces la palabra " + palabra + " en la frase");
    }
}
