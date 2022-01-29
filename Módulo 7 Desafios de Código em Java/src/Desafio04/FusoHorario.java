package Desafio04;

import java.util.Scanner;

public class FusoHorario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int horarioDeSaida = teclado.nextInt();
        int tempoDeViagem = teclado.nextInt();
        int fusoHorario = teclado.nextInt();
        int previsaoDeChegada = 0;

        if (horarioDeSaida + tempoDeViagem + fusoHorario >= 0){
            previsaoDeChegada = (horarioDeSaida + tempoDeViagem + fusoHorario)%24;
        } else {
            previsaoDeChegada = (horarioDeSaida + tempoDeViagem + fusoHorario)%24 + 24;
        }

        System.out.println(previsaoDeChegada);

        teclado.close();
    }
}
