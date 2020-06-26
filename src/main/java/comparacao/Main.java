package comparacao;

import java.util.Scanner;

/**
 *
 * @author Euller
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        GenericArray genericArray;
        int op, metodo;

        do {
            System.out.println("Tamanho dos arrays:");
            System.out.println("\n1 -  Array 1.000 posicoes\n2 -  Array 5.000 posicoes\n3 -  Array 10.000 posicoes");
            System.out.println("4 -  Array 50.000 posicoes\n5 -  Array 10.0000 posicoes\n6 -  Array 500.000 posicoes");
            System.out.println(
                    "7 -  Array 1.000.000 posicoes\n8 -  Array 5.000.000 posicoes\n9 -  Array 10.000.000 posicoes");
            System.out.println(
                    "10 - Array 50.000.000 posicoes\n11 - Array 100.000.000 posicoes\n12 - Array 500.000.000 posicoes");
            System.out.println("13 - Array 1.000.000.000 posicoes");
            System.out.println("0 -  Sair\nInforme o numero a qual deseja consultar:\n");

            op = in.nextInt();
            in.nextLine();

            System.out.println("Informe qual metodo de ordenacao deseja testar:");
            System.out.println("\n1 - Insertion Sort\n2 - Selection Sort\n3 - Bubble Sort");
            System.out.println("\n4 - Shell Sort\n5 - Merge Sort\n6 - QuickSort");
            System.out.println("\n7 - HeapSort\n8 - Array Sort\n0 - Todos");

            metodo = in.nextInt();
            in.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Para Array de 1.000 posicoes:\n");
                    genericArray = new GenericArray(metodo, 1000);
                    genericArray.testes();
                    break;
                case 2:
                    System.out.println("\n\nPara Array de 5.000 posicoes:\n");
                    genericArray = new GenericArray(metodo, 5000);
                    genericArray.testes();
                    break;

                case 3:
                    System.out.println("\n\nPara Array de 10.000 posicoes:\n");
                    genericArray = new GenericArray(metodo, 10000);
                    genericArray.testes();
                    break;

                case 4:
                    System.out.println("\n\nPara Array de 500.00 posicoes:\n");
                    genericArray = new GenericArray(metodo, 50000);
                    genericArray.testes();
                    break;

                case 5:
                    System.out.println("\n\nPara Array de 100.000 posicoes:\n");
                    genericArray = new GenericArray(metodo, 100000);
                    genericArray.testes();
                    break;

                case 6:
                    System.out.println("\n\nPara Array de 500.000 posicoes:\n");
                    genericArray = new GenericArray(metodo, 500000);
                    genericArray.testes();
                    break;

                case 7:
                    System.out.println("\n\nPara Array de 1.000.000 posicoes:\n");
                    genericArray = new GenericArray(metodo, 1000000);
                    genericArray.testes();
                    break;

                case 8:
                    System.out.println("\n\nPara Array de 5.000.000 posicoes:\n");
                    genericArray = new GenericArray(metodo, 5000000);
                    genericArray.testes();
                    break;

                case 9:
                    System.out.println("\n\nPara Array de 10.000.000 posicoes:\n");
                    genericArray = new GenericArray(metodo, 10000000);
                    genericArray.testes();
                    break;

                case 10:
                    System.out.println("\n\nPara Array de 50.000.000 posicoes:\n");
                    genericArray = new GenericArray(metodo, 50000000);
                    genericArray.testes();
                    break;

                case 11:
                    System.out.println("\n\nPara Array de 100.000.000 posicoes:\n");
                    genericArray = new GenericArray(metodo, 100000000);
                    genericArray.testes();
                    break;

                case 12:
                    System.out.println("\n\nPara Array de 500.000.000 posicoes:\n");
                    genericArray = new GenericArray(metodo, 500000000);
                    genericArray.testes();
                    break;
                case 13:
                    System.out.println("\n\nPara Array de 1.000.000.000 posicoes:\n");
                    genericArray = new GenericArray(metodo, 1000000000);
                    genericArray.testes();
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
