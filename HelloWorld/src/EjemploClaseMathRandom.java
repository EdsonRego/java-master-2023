import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        String[] colores = { "azul" , "amarillo","rojo","verde","blanco","negro"};
        double random = Math.random();
        System.out.println("random = " + random);
        random *= colores.length;
        System.out.println("colores = " + colores[(int)random]);

        random *= 7;
        System.out.println("random = " + random);

        random = Math.floor(random);
        System.out.println("random = " + random);

        Random randomObj =  new Random();
        int randomInt = randomObj.nextInt(7);
        System.out.println("randomInt = " + randomInt);
        
        long randomLong = 15 +  randomObj.nextLong(25-15+1); // rango de 15 hasta 25
        System.out.println("randomLong = " + randomLong);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);
    }
}
