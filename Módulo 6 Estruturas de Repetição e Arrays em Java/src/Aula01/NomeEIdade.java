package Aula01;

import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) {
        String nome = "";
        int idade;
        Scanner teclado = new Scanner(System.in);

        while (true){
            System.out.println("Digite o nome do aluno: ");
            nome = teclado.next();
            if (nome.equals("0")){
                break;
            }
            System.out.println("Digite a idade do aluno");
            idade = teclado.nextInt();
        }
    }
}
