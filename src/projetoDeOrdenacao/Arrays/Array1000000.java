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
public class Array1000000 extends AbstractArray {

    private int[] Array1000000;

    public Array1000000() {
        Array1000000 = new int[1000000];
    }

    public int[] getArray1000000() {
        return Array1000000;
    }

    public void testes() {
        testesOrdenados();
        testesReversos();
        testesAleatorios();
    }

    private void testesOrdenados() {
        System.out.println("---------- Testes Ordenados ----------");
        PrepararVetor.ordenadoVetor(Array1000000);

        insertionSortTest(Array1000000, 1000000);
        selectionSortTest(Array1000000, 1000000);
        bubblesortTest(Array1000000, 1000000);
        shellSortTest(Array1000000, 1000000);
        mergeSortTest(Array1000000);
        quickSortTest(Array1000000);
        heapsortTest(Array1000000, 1000000);
        arraySortTest(Array1000000);
    }

    private void testesReversos() {
        System.out.println("---------- Testes Reversos ----------");

        PrepararVetor.revertidoVetor(Array1000000);
        insertionSortTest(Array1000000, 1000000);

        PrepararVetor.revertidoVetor(Array1000000);
        selectionSortTest(Array1000000, 1000000);

        PrepararVetor.revertidoVetor(Array1000000);
        bubblesortTest(Array1000000, 1000000);

        PrepararVetor.revertidoVetor(Array1000000);
        shellSortTest(Array1000000, 1000000);

        PrepararVetor.revertidoVetor(Array1000000);
        mergeSortTest(Array1000000);

        PrepararVetor.revertidoVetor(Array1000000);
        quickSortTest(Array1000000);

        PrepararVetor.revertidoVetor(Array1000000);
        heapsortTest(Array1000000, 1000000);

        PrepararVetor.revertidoVetor(Array1000000);
        arraySortTest(Array1000000);
    }

    private void testesAleatorios() {
        System.out.println("---------- Testes Aleatorios ----------");

        PrepararVetor.aleatorioVetor(Array1000000);
        insertionSortTest(Array1000000, 1000000);

        PrepararVetor.aleatorioVetor(Array1000000);

        PrepararVetor.aleatorioVetor(Array1000000);
        selectionSortTest(Array1000000, 1000000);

        PrepararVetor.aleatorioVetor(Array1000000);
        bubblesortTest(Array1000000, 1000000);

        PrepararVetor.aleatorioVetor(Array1000000);
        shellSortTest(Array1000000, 1000000);

        PrepararVetor.aleatorioVetor(Array1000000);
        mergeSortTest(Array1000000);

        PrepararVetor.aleatorioVetor(Array1000000);
        quickSortTest(Array1000000);

        PrepararVetor.aleatorioVetor(Array1000000);
        heapsortTest(Array1000000, 1000000);

        PrepararVetor.aleatorioVetor(Array1000000);
        arraySortTest(Array1000000);
    }
}
