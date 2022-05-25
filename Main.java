package boasPraticas;

public class Main {

    public static void main(String[] args) {

        int i;
        // inválido -> int i;
        int I;
        // inválido -> int 1a;
        int _1a;
        int $aq;

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10;
        // inválido -> j = 15;
        int asrn24678md;
        // inválido -> int asrn246 78md;
        int asrn2$4678_md = 10;
        // inválido -> int asrn2$46%78_md = 10;

        asrn24678md = 100;
        asrn2$4678_md = 10;

        int quantidadeProduto = 50;
        // não é boa prática -> int QuantidadeProduto;
        final int NUMERO_TENTATIVAS = 5;
        // não é boa prática -> final int numeroTentativas = 5;
        int QUANTIDADE_OPCOES = 25;
        // não é boa prática -> int qtdProd;

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);

        //Exemplos tipos de variáveis

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        // ultrapassa o limite de um short -> short s2 = 40000;

        // limite muito inferior -> int i1 = -10000000000;
        int i2 = 28500;

        long l1 = 1000000000000000000L;
        long l2 = 2004005000500055000L;

        //não cabe dentro de um float, é um double  -> float f1 = 4.5;
        float f2 = 10.68f;

        double d1 = 85.69;
        double d2 = 99.84d;

        char c1 = 'W';
        // não pode receber mais de um char -> char c2 = 'Tw';
        char c3 = '\u0057';

        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "asdhs audh883r 38320-#$#$";

        // data sendo guardada como texto -> String dt1 = "25/05/2022";
        // existe um tipo somente para o dado de data.

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println("Imprimindo as variáveis: " + b1 + b2 + s1 + i2 + l1 + l2 + f2 + d1 + d2 + c1 + c3 + st1 + st2 + st3 + bo1 + bo2);
    }
}
