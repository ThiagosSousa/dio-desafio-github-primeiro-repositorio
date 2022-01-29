package Desafio05;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
        for (int i = 0; i < N; i++) {
            byte X = teclado.nextByte();
            if ((X % 2 == 0) && (X > 0)) System.out.println("EVEN POSITIVE");
            else if ((X % 2 == 0) && (X < 0)) System.out.println("EVEN NEGATIVE");
            else if ((X % 2 != 0) && (X > 0)) System.out.println("ODD POSITIVE");
            else if ((X % 2 != 0) && (X < 0)) System.out.println("ODD NEGATIVE");
            else System.out.println("NULL");
        }
    }
}
