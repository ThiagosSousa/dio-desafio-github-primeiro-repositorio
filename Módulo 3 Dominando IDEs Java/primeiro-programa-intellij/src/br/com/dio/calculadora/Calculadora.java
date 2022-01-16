package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        int soma = somar(a, b);
        int subtração = subtrair(a, b);
        int multiplicação = multiplicar(a, b);
        int divisão = dividir(a, b);

        System.out.println("Soma = " + soma);
        System.out.println("Subtração = " + subtração);
        System.out.println("Multiplicação = " + multiplicação);
        System.out.println("Divisão = " + divisão);

    }

    public static int somar(int a, int b){
        return a + b;
    }

    public static int subtrair(int a, int b){
        return a - b;
    }

    public static int multiplicar(int a, int b){
        return a * b;
    }

    public static int dividir(int a, int b){
        return a / b;
    }


}
