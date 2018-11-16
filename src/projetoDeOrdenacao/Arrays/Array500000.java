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
public class Array500000 extends AbstractArray {

    private int[] Array500000;

    public Array500000() {
        Array500000 = new int[500000];
    }

    public int[] getArray500000() {
        return Array500000;
    }

    public void testes() {
        testesOrdenados();
        testesReversos();
        testesAleatorios();
    }

    private void testesOrdenados() {
        System.out.println("---------- Testes Ordenados ----------");
        PrepararVetor.ordenadoVetor(Array500000);

        insertionSortTest(Array500000, 500000);
        selectionSortTest(Array500000, 500000);
        bubblesortTest(Array500000, 500000);
        shellSortTest(Array500000, 500000);
        mergeSortTest(Array500000);
        quickSortTest(Array500000);
        heapsortTest(Array500000, 500000);
        arraySortTest(Array500000);
    }

    private void testesReversos() {
        System.out.println("---------- Testes Reversos ----------");

        PrepararVetor.revertidoVetor(Array500000);
        insertionSortTest(Array500000, 500000);

        PrepararVetor.revertidoVetor(Array500000);
        selectionSortTest(Array500000, 500000);

        PrepararVetor.revertidoVetor(Array500000);
        bubblesortTest(Array500000, 500000);

        PrepararVetor.revertidoVetor(Array500000);
        shellSortTest(Array500000, 500000);

        PrepararVetor.revertidoVetor(Array500000);
        mergeSortTest(Array500000);

        PrepararVetor.revertidoVetor(Array500000);
        quickSortTest(Array500000);

        PrepararVetor.revertidoVetor(Array500000);
        heapsortTest(Array500000, 500000);

        PrepararVetor.revertidoVetor(Array500000);
        arraySortTest(Array500000);
    }

    private void testesAleatorios() {
        System.out.println("---------- Testes Aleatorios ----------");

        PrepararVetor.aleatorioVetor(Array500000);
        insertionSortTest(Array500000, 500000);

        PrepararVetor.aleatorioVetor(Array500000);

        PrepararVetor.aleatorioVetor(Array500000);
        selectionSortTest(Array500000, 500000);

        PrepararVetor.aleatorioVetor(Array500000);
        bubblesortTest(Array500000, 500000);

        PrepararVetor.aleatorioVetor(Array500000);
        shellSortTest(Array500000, 500000);

        PrepararVetor.aleatorioVetor(Array500000);
        mergeSortTest(Array500000);

        PrepararVetor.aleatorioVetor(Array500000);
        quickSortTest(Array500000);

        PrepararVetor.aleatorioVetor(Array500000);
        heapsortTest(Array500000, 500000);

        PrepararVetor.aleatorioVetor(Array500000);
        arraySortTest(Array500000);
    }
}
