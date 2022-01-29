package Desafio02;

import java.math.BigInteger;
import java.util.Scanner;

public class TrigoNoTabuleiro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int N = teclado.nextInt();

        for (int i = 0; i < N; i++) {
            int X = teclado.nextInt();
            BigInteger quantidadeDeTrigo = BigInteger.valueOf(2);
            quantidadeDeTrigo = quantidadeDeTrigo.pow(X);
            BigInteger quantidadeEmKg = quantidadeDeTrigo.divide(BigInteger.valueOf(12000));
            System.out.println(quantidadeEmKg + " kg");
        }
    }
}
