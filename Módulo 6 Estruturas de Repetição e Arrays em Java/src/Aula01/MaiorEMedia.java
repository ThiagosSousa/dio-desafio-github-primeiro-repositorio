package Aula01;

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero, cont, maior;
        maior = 0;
        float soma = 0;
        float media = 0;
        cont = 0;
        do{
            System.out.println("Digite um número: ");
            numero = teclado.nextInt();
            if (numero > maior){
                maior = numero;
            }
            soma += numero;
            cont++;
            media = soma/cont;
        } while(cont < 5);
        System.out.println(soma);
        System.out.println("Maior: " + maior);
        System.out.println("Média: " + media);
    }
}
