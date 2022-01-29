package Desafio03;

import java.util.Locale;
import java.util.Scanner;

public class MacPronalts {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        int codigoProdutos=0, quantidadeProdutos=0;
        double valorProdutos=0, valorTotal=0;

        int quantidadeProdutosComprados = Integer.parseInt(teclado.nextLine());

        for (int i = 0; i < quantidadeProdutosComprados; i++) {
            codigoProdutos = teclado.nextInt();
            quantidadeProdutos = teclado.nextInt();

            switch (codigoProdutos){
                case 1001:
                    valorProdutos = 1.50;
                    break;
                case 1002:
                    valorProdutos = 2.50;
                    break;
                case 1003:
                    valorProdutos = 3.50;
                    break;
                case 1004:
                    valorProdutos = 4.50;
                    break;
                case 1005:
                    valorProdutos = 5.50;
                    break;
            }
            valorTotal += valorProdutos * quantidadeProdutos;
        }
        System.out.printf("%.2f\n", valorTotal);
        teclado.close();
    }
}
