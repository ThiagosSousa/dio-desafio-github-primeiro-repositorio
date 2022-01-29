package Desafio01;

import java.util.Scanner;

public class TabuleiroDeXadrez {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int L = teclado.nextInt();
        int C = teclado.nextInt();
        int[][] tabuleiro = new int[L][C];

        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                if ((i % 2 == 0) && (j % 2 == 0)){
                    tabuleiro[i][j] = 1;
                }  else if ((i % 2 == 0) && (j % 2 == 1)) {
                    tabuleiro[i][j] = 0;
                } else if ((i % 2 == 1) && (j % 2 == 0)){
                    tabuleiro[i][j] = 0;
                } else if ((i % 2 == 1) && (j % 2 == 1)){
                    tabuleiro[i][j] = 1;
                }
            }
        }
        System.out.println(tabuleiro[L-1][C-1]);
    }
}
