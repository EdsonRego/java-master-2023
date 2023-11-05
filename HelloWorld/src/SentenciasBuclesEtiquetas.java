public class SentenciasBuclesEtiquetas {
    public static void main(String[] args) {

        bluce:
        for(int dia  = 1; dia <= 7; dia++) {

            System.out.println();
            int j = 1;
            while ( j <= 8 ) {
                if (dia == 6 || dia == 7) {
                    System.out.println("dia = " + dia + ": Descanso de fin de semana");
                    continue bluce;
                }
                System.out.println("[dia = " + dia + " ,trabajando a las " + j + " horas ");
                j++;
            }
        }

        /*System.out.println("\n==================");
        bluce1:
        for(int i = 0; i < 5; i++) {

            System.out.println();
            int j = 0;
            while ( j < 5 ) {
                if (i == 2) {
                    continue bluce1;
                }
                System.out.print("[i = " + i + " ,j =" + j + " ], ");
                j++;
            }
        }

        System.out.println("\n==================");
        etiqueta:
        for(int i = 0; i < 5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break etiqueta;
                }
                System.out.print("[i = " + i + " ,j =" + j + " ], ");
            }
        }*/
    }
}
