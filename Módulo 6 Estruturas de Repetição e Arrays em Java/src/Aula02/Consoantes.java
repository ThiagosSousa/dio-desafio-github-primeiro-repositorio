package Aula02;

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String [] caracteres = new String[6];

        int quantidadeConsoantes = 0;

        for (int i = 0; i < caracteres.length; i++) {
            System.out.println("Digite uma letra: ");
            String letra = teclado.next();

            if (!((letra.equalsIgnoreCase("a")) || (letra.equalsIgnoreCase("e")) || (letra.equalsIgnoreCase("i")) ||(letra.equalsIgnoreCase("o")) || (letra.equalsIgnoreCase("u")))) {
                caracteres[quantidadeConsoantes] = letra;
                quantidadeConsoantes++;
            }
        }

        System.out.println("Foram digitadas " + quantidadeConsoantes + " consoantes");
        for (String consoante: caracteres){
            if (consoante != null){
                System.out.print(consoante + " ");
            }
        }
    }
}
