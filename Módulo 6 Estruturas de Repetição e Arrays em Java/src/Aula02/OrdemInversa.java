package Aula02;

import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {
        int [] vetor = {0, 6, 15, 30, 18,-4};

        for (int i = vetor.length-1; i >= 0 ; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
