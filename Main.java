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

        // Exemplos tipos de variáveis

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

        // Exemplos Operadores Aritméticos

        System.out.println("PrePos");
        prePos();
        System.out.println("Aritmético");
        aritmetico();
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("Precedência");
        precedencia();

        // Exemplos Casting (Conversões)

        byte b3;
        short s3 = 1000;
        b3 = (byte) s3;

        long l3;
        int i1 = 10;
        l3 = i1;

        int i3;
        long l4 = 100000000000000000L;
        i3 = (int) l4;

        int i4;
        long l5 = 10000L;
        i4 = (int) l5;

        double d3;
        float f3 = 10.5f;
        d3 = f3;

        float f4;
        float f5;
        double d4 = 10000.58d;
        f4 = (float) d4;
        double d5 = 10000.5888888888888888888888d;
        f5 = (float) d3;

        int i6;
        float f6; = 11.5697f;
        i6 = (int) f6;

        System.out.println("b3: " + b3);
        System.out.println("l3: " + l3);
        System.out.println("i3: " + i3);
        System.out.println("i4: " + i4);
        System.out.println("d3: " + d3);
        System.out.println("f4: " + f4);
        System.out.println("f5: " + f5);
        System.out.println("i6: " + i6);

        b1 = (byte) d3;

        System.out.println("b1: " + b1);

    }

    private static void prePos() {

        int k = 10;

        int i = ++k; // Pré fixado
        int j = k--; // Pós fixado
        int x = k;

        System.out.println("i" + i);
        System.out.println("j" + j);
        System.out.println("x" + x);
    }

    private static void aritmetico() {

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a+b;
        int r2 = c-a;
        int r3 = d*b;
        int r4 = e/a;
        int r5 = c%b;

        System.out.println("a+b");
        System.out.println("c-a");
        System.out.println("d*b");
        System.out.println("e/a");
        System.out.println("c%b");

    }

    private static void atribuicao() {

        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5f;
        double d = f;

        System.out.println("d" + d);

        i += 5; // i = i + 5
        j -= 3; // j = j - 3
        d /= 2.7d; // d = d / 2.7d
        l *= 3; // l = l * 3
        k %= 2; // k = k % 2

        System.out.println("i:" + i);
        System.out.println("j:" + j);
        System.out.println("d:" + d);
        System.out.println("l:" + l);
        System.out.println("k:" + k);

        i = k = j;

        System.out.println("k:" + k);
        System.out.println("i:" + i);
    }

    private static void precedencia() {

        int i = 10;
        int j = 20;
        int k = 30;

        int a = i++ + --j * k; // 10 + 19 + 30 -> 10 + 570 -> 580

        System.out.println("i++ + --J * k " + a);

        System.out.println("i: " + i); // 11

        int b = k / --i % 3 + 1; // 30 / 10 % 3 + 1 -> 1

        System.out.println("k / --i % 3 + 1: " + b);

        System.out.println("i: " + i); // 10

        int c = 2;

        c *= i += 5; // c = 2 * i; i = i + 5 -> c = 2 * i: i = 10 + 5; -> c = 2 * 15; -> c = 2 * 15; c = 30

        System.out.println("c *= i += 5: " + c);
    }

}
