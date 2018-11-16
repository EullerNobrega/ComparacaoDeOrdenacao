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
public class Array100000000 extends AbstractArray {

    private int[] Array100000000;

    public Array100000000() {
        Array100000000 = new int[100000000];
    }

    public int[] getArray100000000() {
        return Array100000000;
    }

    public void testes() {
        testesOrdenados();
        testesReversos();
        testesAleatorios();
    }

    private void testesOrdenados() {
        System.out.println("---------- Testes Ordenados ----------");
        PrepararVetor.ordenadoVetor(Array100000000);

        insertionSortTest(Array100000000, 100000000);
        selectionSortTest(Array100000000, 100000000);
        bubblesortTest(Array100000000, 100000000);
        shellSortTest(Array100000000, 100000000);
        mergeSortTest(Array100000000);
        quickSortTest(Array100000000);
        heapsortTest(Array100000000, 100000000);
        arraySortTest(Array100000000);
    }

    private void testesReversos() {
        System.out.println("---------- Testes Reversos ----------");

        PrepararVetor.revertidoVetor(Array100000000);
        insertionSortTest(Array100000000, 100000000);

        PrepararVetor.revertidoVetor(Array100000000);
        selectionSortTest(Array100000000, 100000000);

        PrepararVetor.revertidoVetor(Array100000000);
        bubblesortTest(Array100000000, 100000000);

        PrepararVetor.revertidoVetor(Array100000000);
        shellSortTest(Array100000000, 100000000);

        PrepararVetor.revertidoVetor(Array100000000);
        mergeSortTest(Array100000000);

        PrepararVetor.revertidoVetor(Array100000000);
        quickSortTest(Array100000000);

        PrepararVetor.revertidoVetor(Array100000000);
        heapsortTest(Array100000000, 100000000);

        PrepararVetor.revertidoVetor(Array100000000);
        arraySortTest(Array100000000);
    }

    private void testesAleatorios() {
        System.out.println("---------- Testes Aleatorios ----------");

        PrepararVetor.aleatorioVetor(Array100000000);
        insertionSortTest(Array100000000, 100000000);

        PrepararVetor.aleatorioVetor(Array100000000);

        PrepararVetor.aleatorioVetor(Array100000000);
        selectionSortTest(Array100000000, 100000000);

        PrepararVetor.aleatorioVetor(Array100000000);
        bubblesortTest(Array100000000, 100000000);

        PrepararVetor.aleatorioVetor(Array100000000);
        shellSortTest(Array100000000, 100000000);

        PrepararVetor.aleatorioVetor(Array100000000);
        mergeSortTest(Array100000000);

        PrepararVetor.aleatorioVetor(Array100000000);
        quickSortTest(Array100000000);

        PrepararVetor.aleatorioVetor(Array100000000);
        heapsortTest(Array100000000, 100000000);

        PrepararVetor.aleatorioVetor(Array100000000);
        arraySortTest(Array100000000);
    }
}
