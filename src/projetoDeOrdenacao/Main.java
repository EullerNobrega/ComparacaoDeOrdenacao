package projetoDeOrdenacao;

import java.util.Scanner;
import projetoDeOrdenacao.Arrays.Array1000;
import projetoDeOrdenacao.Arrays.Array10000;
import projetoDeOrdenacao.Arrays.Array100000;
import projetoDeOrdenacao.Arrays.Array1000000;
import projetoDeOrdenacao.Arrays.Array10000000;
import projetoDeOrdenacao.Arrays.Array100000000;
import projetoDeOrdenacao.Arrays.Array5000;
import projetoDeOrdenacao.Arrays.Array50000;
import projetoDeOrdenacao.Arrays.Array500000;
import projetoDeOrdenacao.Arrays.Array5000000;
import projetoDeOrdenacao.Arrays.Array50000000;
import projetoDeOrdenacao.Arrays.Array500000000;

/**
 *
 * @author Euller
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Array1000 a1000 = new Array1000();
        Array5000 a5000 = new Array5000();
        Array10000 a10000 = new Array10000();
        Array50000 a50000 = new Array50000();
        Array100000 a100000 = new Array100000();
        Array500000 a500000 = new Array500000();
        Array1000000 a1000000 = new Array1000000();
        Array5000000 a5000000 = new Array5000000();
        Array10000000 a10000000 = new Array10000000();
        Array50000000 a50000000 = new Array50000000();
        Array100000000 a100000000 = new Array100000000();
        Array500000000 a500000000 = new Array500000000();
//        Array1000000000 a1000000000 = new Array1000000000(); JVM NAO ACEITA

        Scanner in = new Scanner(System.in);
        int op;

        do {
            System.out.println("Tamanho dos arrays:");
            System.out.println("\n1 -  Array 1000 posicoes\n2 -  Array 5000 posicoes\n3 -  Array 10000 posicoes");
            System.out.println("4 -  Array 50000 posicoes\n5 -  Array 100000 posicoes\n6 -  Array 500000 posicoes");
            System.out.println("7 -  Array 1000000 posicoes\n8 -  Array 5000000 posicoes\n9 -  Array 10000000 posicoes");
            System.out.println("10 - Array 50000000 posicoes\n11 - Array 100000000 posicoes\n12 - Array 500000000 posicoes");
            System.out.println("13 - Todos\n0 -  Sair\nInforme o numero a qual deseja consultar:\n");

            op = in.nextInt();
            in.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Para Array de 1000 posicoes:\n");
                    a1000.testes();
                    break;
                case 2:
                    System.out.println("\n\nPara Array de 5000 posicoes:\n");
                    a5000.testes();
                    break;

                case 3:
                    System.out.println("\n\nPara Array de 10000 posicoes:\n");
                    a10000.testes();
                    break;

                case 4:
                    System.out.println("\n\nPara Array de 50000 posicoes:\n");
                    a50000.testes();
                    break;

                case 5:
                    System.out.println("\n\nPara Array de 100000 posicoes:\n");
                    a100000.testes();
                    break;

                case 6:
                    System.out.println("\n\nPara Array de 500000 posicoes:\n");
                    a500000.testes();
                    break;

                case 7:
                    System.out.println("\n\nPara Array de 1000000 posicoes:\n");
                    a1000000.testes();
                    break;

                case 8:
                    System.out.println("\n\nPara Array de 5000000 posicoes:\n");
                    a5000000.testes();
                    break;

                case 9:
                    System.out.println("\n\nPara Array de 10000000 posicoes:\n");
                    a10000000.testes();
                    break;

                case 10:
                    System.out.println("\n\nPara Array de 50000000 posicoes:\n");
                    a50000000.testes();
                    break;

                case 11:
                    System.out.println("\n\nPara Array de 100000000 posicoes:\n");
                    a100000000.testes();
                    break;

                case 12:
                    System.out.println("\n\nPara Array de 500000000 posicoes:\n");
                    a500000000.testes();
                    break;
                case 13:
                    System.out.println("Para Array de 1000 posicoes:\n");
                    a1000.testes();
                    System.out.println("\n\nPara Array de 5000 posicoes:\n");
                    a5000.testes();
                    System.out.println("\n\nPara Array de 10000 posicoes:\n");
                    a10000.testes();
                    System.out.println("\n\nPara Array de 50000 posicoes:\n");
                    a50000.testes();
                    System.out.println("\n\nPara Array de 100000 posicoes:\n");
                    a100000.testes();
                    System.out.println("\n\nPara Array de 500000 posicoes:\n");
                    a500000.testes();
                    System.out.println("\n\nPara Array de 1000000 posicoes:\n");
                    a1000000.testes();
                    System.out.println("\n\nPara Array de 5000000 posicoes:\n");
                    a5000000.testes();
                    System.out.println("\n\nPara Array de 10000000 posicoes:\n");
                    a10000000.testes();
                    System.out.println("\n\nPara Array de 50000000 posicoes:\n");
                    a50000000.testes();
                    System.out.println("\n\nPara Array de 100000000 posicoes:\n");
                    a100000000.testes();
                    System.out.println("\n\nPara Array de 500000000 posicoes:\n");
                    a500000000.testes();
                    break;
                case 0:
                    break;

                default:
                    System.out.println("Opcao invalida");
                    break;

            }
        } while (op != 0);

    }

}
