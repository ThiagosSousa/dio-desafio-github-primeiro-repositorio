package Aula01;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        int nota;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite uma nota entre 0 e 10: ");
        nota = teclado.nextInt();

        while (nota < 0 || nota > 10){
            System.out.println("Favor digitar um valor entre 0 e 10.");
            nota = teclado.nextInt();
        }
    }
}
