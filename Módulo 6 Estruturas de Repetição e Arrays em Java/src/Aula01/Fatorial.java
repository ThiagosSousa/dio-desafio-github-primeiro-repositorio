package Aula01;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroFatorial;
        int fatorial;

        System.out.println("Digite um número para calcular o seu fatorial: ");
        numeroFatorial = teclado.nextInt();
        fatorial = numeroFatorial;
        for (int i = numeroFatorial-1; i >= 1 ; i--) {
            fatorial *= i;
        }
        System.out.println(numeroFatorial + "! = " + fatorial);
    }
}
