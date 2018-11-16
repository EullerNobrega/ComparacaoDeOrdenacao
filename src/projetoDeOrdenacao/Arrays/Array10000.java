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
public class Array10000 extends AbstractArray {

    private int[] Array10000;

    public Array10000() {
        Array10000 = new int[10000];
    }

    public int[] getArray10000() {
        return Array10000;
    }

    public void testes() {
        testesOrdenados();
        testesReversos();
        testesAleatorios();
    }

    private void testesOrdenados() {
        System.out.println("---------- Testes Ordenados ----------");
        PrepararVetor.ordenadoVetor(Array10000);

        insertionSortTest(Array10000, 10000);
        selectionSortTest(Array10000, 10000);
        bubblesortTest(Array10000, 10000);
        shellSortTest(Array10000, 10000);
        mergeSortTest(Array10000);
        quickSortTest(Array10000);
        heapsortTest(Array10000, 10000);
        arraySortTest(Array10000);
    }

    private void testesReversos() {
        System.out.println("---------- Testes Reversos ----------");

        PrepararVetor.revertidoVetor(Array10000);
        insertionSortTest(Array10000, 10000);

        PrepararVetor.revertidoVetor(Array10000);
        selectionSortTest(Array10000, 10000);

        PrepararVetor.revertidoVetor(Array10000);
        bubblesortTest(Array10000, 10000);

        PrepararVetor.revertidoVetor(Array10000);
        shellSortTest(Array10000, 10000);

        PrepararVetor.revertidoVetor(Array10000);
        mergeSortTest(Array10000);

        PrepararVetor.revertidoVetor(Array10000);
        quickSortTest(Array10000);

        PrepararVetor.revertidoVetor(Array10000);
        heapsortTest(Array10000, 10000);

        PrepararVetor.revertidoVetor(Array10000);
        arraySortTest(Array10000);
    }

    private void testesAleatorios() {
        System.out.println("---------- Testes Aleatorios ----------");

        PrepararVetor.aleatorioVetor(Array10000);
        insertionSortTest(Array10000, 10000);

        PrepararVetor.aleatorioVetor(Array10000);

        PrepararVetor.aleatorioVetor(Array10000);
        selectionSortTest(Array10000, 10000);

        PrepararVetor.aleatorioVetor(Array10000);
        bubblesortTest(Array10000, 10000);

        PrepararVetor.aleatorioVetor(Array10000);
        shellSortTest(Array10000, 10000);

        PrepararVetor.aleatorioVetor(Array10000);
        mergeSortTest(Array10000);

        PrepararVetor.aleatorioVetor(Array10000);
        quickSortTest(Array10000);

        PrepararVetor.aleatorioVetor(Array10000);
        heapsortTest(Array10000, 10000);

        PrepararVetor.aleatorioVetor(Array10000);
        arraySortTest(Array10000);
    }
}
