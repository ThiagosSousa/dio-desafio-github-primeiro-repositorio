package Aula02;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int [] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = random.nextInt(100);
        }

        for (int i = 0; i < numerosAleatorios.length; i++) {
            System.out.println((numerosAleatorios[i]-1) + " <= " + numerosAleatorios[i] + " => " + (numerosAleatorios[i]+1));
        }
    }
}
