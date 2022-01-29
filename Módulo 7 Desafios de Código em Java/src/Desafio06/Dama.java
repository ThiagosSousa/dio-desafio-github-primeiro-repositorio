package Desafio06;

import java.util.Scanner;

public class Dama {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int x1,y1,x2,y2;

        while(true){
            x1 = teclado.nextInt();
            y1 = teclado.nextInt();
            x2 = teclado.nextInt();
            y2 = teclado.nextInt();

            if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) break;
            if (x1 == x2 && y1 == y2) System.out.println("0");
            else if (x1 == x2  || y1 == y2) System.out.println("1");
            else if (Math.abs(x2-x1) == Math.abs(y2-y1)) System.out.println("1");
            else System.out.println("2");
        }
    }
}
