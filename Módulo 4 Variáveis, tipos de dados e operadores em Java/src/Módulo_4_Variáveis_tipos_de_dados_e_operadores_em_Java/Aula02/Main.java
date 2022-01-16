package Módulo_4_Variáveis_tipos_de_dados_e_operadores_em_Java.Aula02;

public class Main {

    public static void main(String[] args) {

       //Aula 02 - Tipos de Dados

       byte b1 = 10;
       byte b2 = 20;

       short s1 = 20000;
       //short s2 = 40000; //Erro de overflow

       //int i1 = -100000000000000; //Overflow
       int i2 = 28500;

       long l1 = 1000000000000000000L;
       long l2 = 2004005000500055000L;

       //float f1 = 4.5; // O tipo float exige que o "f" seja colocado no final do número.
       float f2 = 10.68f;

       double d1 = 85.69;
       double d2 = 99.84d;

       char c1 = 'W';
       //char c2 = 'TW'; //Erro de compilação, pois o tipo char só aceita um caractere.

       String st1 = "Fulano";
       String st2 = "Cicrano";
       String st3 = "naoasdoaid dna sdoadoa sndaodai sdnaogoiwnwei 15168218.";

       String dt1 = "03/09/1989";

       boolean bo1 = true;
       boolean bo2 = false;

       System.out.println(b1);
       System.out.println(b2);
       System.out.println(s1);
       System.out.println(i2);
       System.out.println(l1);
       System.out.println(l2);
       System.out.println(f2);
       System.out.println(d1);
       System.out.println(d2);
       System.out.println(c1);
       System.out.println(st1);
       System.out.println(st2);
       System.out.println(st3);
       System.out.println(dt1);
       System.out.println(bo1);
       System.out.println(bo2);
    }
}
