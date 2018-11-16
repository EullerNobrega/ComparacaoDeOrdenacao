/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoDeOrdenacao.Arrays;

import projetoDeOrdenacao.PrepararVetor;

/**
 *
 * @author Euller
 */
public class Array10000000 extends AbstractArray {

    private int[] Array10000000;

    public Array10000000() {
        Array10000000 = new int[10000000];
    }

    public int[] getArray10000000() {
        return Array10000000;
    }

    public void testes() {
        testesOrdenados();
        testesReversos();
        testesAleatorios();
    }

    private void testesOrdenados() {
        System.out.println("---------- Testes Ordenados ----------");
        PrepararVetor.ordenadoVetor(Array10000000);

        insertionSortTest(Array10000000, 10000000);
        selectionSortTest(Array10000000, 10000000);
        bubblesortTest(Array10000000, 10000000);
        shellSortTest(Array10000000, 10000000);
        mergeSortTest(Array10000000);
        quickSortTest(Array10000000);
        heapsortTest(Array10000000, 10000000);
        arraySortTest(Array10000000);
    }

    private void testesReversos() {
        System.out.println("---------- Testes Reversos ----------");

        PrepararVetor.revertidoVetor(Array10000000);
        insertionSortTest(Array10000000, 10000000);

        PrepararVetor.revertidoVetor(Array10000000);
        selectionSortTest(Array10000000, 10000000);

        PrepararVetor.revertidoVetor(Array10000000);
        bubblesortTest(Array10000000, 10000000);

        PrepararVetor.revertidoVetor(Array10000000);
        shellSortTest(Array10000000, 10000000);

        PrepararVetor.revertidoVetor(Array10000000);
        mergeSortTest(Array10000000);

        PrepararVetor.revertidoVetor(Array10000000);
        quickSortTest(Array10000000);

        PrepararVetor.revertidoVetor(Array10000000);
        heapsortTest(Array10000000, 10000000);

        PrepararVetor.revertidoVetor(Array10000000);
        arraySortTest(Array10000000);
    }

    private void testesAleatorios() {
        System.out.println("---------- Testes Aleatorios ----------");

        PrepararVetor.aleatorioVetor(Array10000000);
        insertionSortTest(Array10000000, 10000000);

        PrepararVetor.aleatorioVetor(Array10000000);

        PrepararVetor.aleatorioVetor(Array10000000);
        selectionSortTest(Array10000000, 10000000);

        PrepararVetor.aleatorioVetor(Array10000000);
        bubblesortTest(Array10000000, 10000000);

        PrepararVetor.aleatorioVetor(Array10000000);
        shellSortTest(Array10000000, 10000000);

        PrepararVetor.aleatorioVetor(Array10000000);
        mergeSortTest(Array10000000);

        PrepararVetor.aleatorioVetor(Array10000000);
        quickSortTest(Array10000000);

        PrepararVetor.aleatorioVetor(Array10000000);
        heapsortTest(Array10000000, 10000000);

        PrepararVetor.aleatorioVetor(Array10000000);
        arraySortTest(Array10000000);
    }
}
