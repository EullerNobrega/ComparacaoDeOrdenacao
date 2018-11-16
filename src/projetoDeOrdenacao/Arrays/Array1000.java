package projetoDeOrdenacao.Arrays;

import java.util.Arrays;
import java.util.Collections;
import projetoDeOrdenacao.PrepararVetor;

/**
 *
 * @author Euller
 */
public class Array1000 extends AbstractArray {
    private int[] Array1000;

    public Array1000() {
        Array1000 = new int[1000];
    }

    public int[] getArray1000() {
        return Array1000;
    }

    public void testes() {
        testesOrdenados();
        testesReversos();
        testesAleatorios();
    }

    private void testesOrdenados() {
        System.out.println("---------- Testes Ordenados ----------");
        PrepararVetor.ordenadoVetor(Array1000);

        insertionSortTest(Array1000, 1000);
        selectionSortTest(Array1000, 1000);
        bubblesortTest(Array1000, 1000);
        shellSortTest(Array1000, 1000);
        mergeSortTest(Array1000);
        quickSortTest(Array1000);
        heapsortTest(Array1000, 1000);
        arraySortTest(Array1000);
    }

    private void testesReversos() {
        System.out.println("---------- Testes Reversos ----------");

        PrepararVetor.revertidoVetor(Array1000);
        insertionSortTest(Array1000, 1000);

        PrepararVetor.revertidoVetor(Array1000);
        selectionSortTest(Array1000, 1000);

        PrepararVetor.revertidoVetor(Array1000);
        bubblesortTest(Array1000, 1000);

        PrepararVetor.revertidoVetor(Array1000);
        shellSortTest(Array1000, 1000);

        PrepararVetor.revertidoVetor(Array1000);
        mergeSortTest(Array1000);

        PrepararVetor.revertidoVetor(Array1000);
        quickSortTest(Array1000);

        PrepararVetor.revertidoVetor(Array1000);
        heapsortTest(Array1000, 1000);

        PrepararVetor.revertidoVetor(Array1000);
        arraySortTest(Array1000);
    }

    private void testesAleatorios() {
        System.out.println("---------- Testes Aleatorios ----------");

        PrepararVetor.aleatorioVetor(Array1000);
        insertionSortTest(Array1000, 1000);

        PrepararVetor.aleatorioVetor(Array1000);

        PrepararVetor.aleatorioVetor(Array1000);
        selectionSortTest(Array1000, 1000);

        PrepararVetor.aleatorioVetor(Array1000);
        bubblesortTest(Array1000, 1000);

        PrepararVetor.aleatorioVetor(Array1000);
        shellSortTest(Array1000, 1000);

        PrepararVetor.aleatorioVetor(Array1000);
        mergeSortTest(Array1000);

        PrepararVetor.aleatorioVetor(Array1000);
        quickSortTest(Array1000);

        PrepararVetor.aleatorioVetor(Array1000);
        heapsortTest(Array1000, 1000);

        PrepararVetor.aleatorioVetor(Array1000);
        arraySortTest(Array1000);
    }

}
