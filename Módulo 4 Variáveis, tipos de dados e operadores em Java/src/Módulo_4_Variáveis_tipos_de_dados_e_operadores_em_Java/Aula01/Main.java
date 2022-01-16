package Módulo_4_Variáveis_tipos_de_dados_e_operadores_em_Java.Aula01;

public class Main {

    public static void main(String[] args) {

        //Aula 01 - Criação de variáveis.

        int i;
        int I;
        //int 1a; //Erro pois variável não pode começar com números.
        int _1a, $aq; //Apesar de não dar erro, não é uma boa prática iniciar variável com _ ou $.

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10; // Criar uma constante.
        //j = 15; // Erro pois a constante não pode mudar seu valor.

        int quantidadeProduto = 50;
        //int QuantidadeProduto; // Não é indicado, pois não é uma boa prática começar com letra maiúscula.
        final int NUMERO_TENTATIVAS = 5; // É uma boa prática que quando a variável é final, utiliza-se o nome em letra maiúscula separado por "_".

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);


    }
}
