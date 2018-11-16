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
public class Array50000000 extends AbstractArray {

    private int[] Array50000000;

    public Array50000000() {
        Array50000000 = new int[50000000];
    }

    public int[] getArray50000000() {
        return Array50000000;
    }

    public void testes() {
        testesOrdenados();
        testesReversos();
        testesAleatorios();
    }

    private void testesOrdenados() {
        System.out.println("---------- Testes Ordenados ----------");
        PrepararVetor.ordenadoVetor(Array50000000);

        insertionSortTest(Array50000000, 50000000);
        selectionSortTest(Array50000000, 50000000);
        bubblesortTest(Array50000000, 50000000);
        shellSortTest(Array50000000, 50000000);
        mergeSortTest(Array50000000);
        quickSortTest(Array50000000);
        heapsortTest(Array50000000, 50000000);
        arraySortTest(Array50000000);
    }

    private void testesReversos() {
        System.out.println("---------- Testes Reversos ----------");

        PrepararVetor.revertidoVetor(Array50000000);
        insertionSortTest(Array50000000, 50000000);

        PrepararVetor.revertidoVetor(Array50000000);
        selectionSortTest(Array50000000, 50000000);

        PrepararVetor.revertidoVetor(Array50000000);
        bubblesortTest(Array50000000, 50000000);

        PrepararVetor.revertidoVetor(Array50000000);
        shellSortTest(Array50000000, 50000000);

        PrepararVetor.revertidoVetor(Array50000000);
        mergeSortTest(Array50000000);

        PrepararVetor.revertidoVetor(Array50000000);
        quickSortTest(Array50000000);

        PrepararVetor.revertidoVetor(Array50000000);
        heapsortTest(Array50000000, 50000000);

        PrepararVetor.revertidoVetor(Array50000000);
        arraySortTest(Array50000000);
    }

    private void testesAleatorios() {
        System.out.println("---------- Testes Aleatorios ----------");

        PrepararVetor.aleatorioVetor(Array50000000);
        insertionSortTest(Array50000000, 50000000);

        PrepararVetor.aleatorioVetor(Array50000000);

        PrepararVetor.aleatorioVetor(Array50000000);
        selectionSortTest(Array50000000, 50000000);

        PrepararVetor.aleatorioVetor(Array50000000);
        bubblesortTest(Array50000000, 50000000);

        PrepararVetor.aleatorioVetor(Array50000000);
        shellSortTest(Array50000000, 50000000);

        PrepararVetor.aleatorioVetor(Array50000000);
        mergeSortTest(Array50000000);

        PrepararVetor.aleatorioVetor(Array50000000);
        quickSortTest(Array50000000);

        PrepararVetor.aleatorioVetor(Array50000000);
        heapsortTest(Array50000000, 50000000);

        PrepararVetor.aleatorioVetor(Array50000000);
        arraySortTest(Array50000000);
    }
}
