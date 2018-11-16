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
public class Array100000 extends AbstractArray {

    private int[] Array100000;

    public Array100000() {
        Array100000 = new int[100000];
    }

    public int[] getArray100000() {
        return Array100000;
    }

    public void testes() {
        testesOrdenados();
        testesReversos();
        testesAleatorios();
    }

    private void testesOrdenados() {
        System.out.println("---------- Testes Ordenados ----------");
        PrepararVetor.ordenadoVetor(Array100000);

        insertionSortTest(Array100000, 100000);
        selectionSortTest(Array100000, 100000);
        bubblesortTest(Array100000, 100000);
        shellSortTest(Array100000, 100000);
        mergeSortTest(Array100000);
        quickSortTest(Array100000);
        heapsortTest(Array100000, 100000);
        arraySortTest(Array100000);
    }

    private void testesReversos() {
        System.out.println("---------- Testes Reversos ----------");

        PrepararVetor.revertidoVetor(Array100000);
        insertionSortTest(Array100000, 100000);

        PrepararVetor.revertidoVetor(Array100000);
        selectionSortTest(Array100000, 100000);

        PrepararVetor.revertidoVetor(Array100000);
        bubblesortTest(Array100000, 100000);

        PrepararVetor.revertidoVetor(Array100000);
        shellSortTest(Array100000, 100000);

        PrepararVetor.revertidoVetor(Array100000);
        mergeSortTest(Array100000);
        PrepararVetor.revertidoVetor(Array100000);
        quickSortTest(Array100000);

        PrepararVetor.revertidoVetor(Array100000);
        heapsortTest(Array100000, 100000);

        PrepararVetor.revertidoVetor(Array100000);
        arraySortTest(Array100000);
    }

    private void testesAleatorios() {
        System.out.println("---------- Testes Aleatorios ----------");

        PrepararVetor.aleatorioVetor(Array100000);
        insertionSortTest(Array100000, 100000);

        PrepararVetor.aleatorioVetor(Array100000);

        PrepararVetor.aleatorioVetor(Array100000);
        selectionSortTest(Array100000, 100000);

        PrepararVetor.aleatorioVetor(Array100000);
        bubblesortTest(Array100000, 100000);

        PrepararVetor.aleatorioVetor(Array100000);
        shellSortTest(Array100000, 100000);

        PrepararVetor.aleatorioVetor(Array100000);
        mergeSortTest(Array100000);
        PrepararVetor.aleatorioVetor(Array100000);
        quickSortTest(Array100000);

        PrepararVetor.aleatorioVetor(Array100000);
        heapsortTest(Array100000, 100000);

        PrepararVetor.aleatorioVetor(Array100000);
        arraySortTest(Array100000);
    }
}
