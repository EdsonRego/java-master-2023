public class Desafio14ArreglosNumeroMasAlto {
    public static void main(String[] args) {

        int[] num = {14, 33, 15, 36, 78, 21, 43};
        int max = 0;

        System.out.println("Exibir arreglo");
        for (int i=0 ; i < num.length; i++){
            System.out.println(" Numero: " + num[i]);
        }
        System.out.println();

        for (int i = 1; i < num.length; i++){
            max = (num[max] > num[i])? max: i ;
        }

        System.out.println("Número mas alto = " + num[max]);

       /* //Solución del professor
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[10];

        // ingreamos los datos por ejemplo {14, 33, 15, 36, 78, 21, 43}
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese un numero de 11 a 99: ");
            arreglo[i] = scanner.nextInt();
        }

        int max = 0;

        // luego obtenemos el valor mayor
        for (int i = 0; i < 7; i++) {
            max = (max > arreglo[i])? max: arreglo[i];
        }
        System.out.println("El valor mas alto es: " + max);*/
    }
}
