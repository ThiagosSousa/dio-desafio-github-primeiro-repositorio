package Aula01;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        int n, pares, impares;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a quantidade de números que pretende analisar: ");
        n = teclado.nextInt();
        pares = 0;
        impares = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o número a ser analisado: ");
            int num = teclado.nextInt();
            if (num % 2 == 0) pares++;
            else impares++;
        }

        System.out.println("Foram digitados " + n + " números, sendo: ");
        System.out.println(impares + " ímpar(es) e " + pares + " par(es).");
    }
}
