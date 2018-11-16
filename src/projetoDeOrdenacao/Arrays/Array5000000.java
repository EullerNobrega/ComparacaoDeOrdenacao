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
public class Array5000000 extends AbstractArray {

    private int[] Array5000000;

    public Array5000000() {
        Array5000000 = new int[5000000];
    }

    public int[] getArray5000000() {
        return Array5000000;
    }

    public void testes() {
        testesOrdenados();
        testesReversos();
        testesAleatorios();
    }

    private void testesOrdenados() {
        System.out.println("---------- Testes Ordenados ----------");
        PrepararVetor.ordenadoVetor(Array5000000);

        insertionSortTest(Array5000000, 5000000);
        selectionSortTest(Array5000000, 5000000);
        bubblesortTest(Array5000000, 5000000);
        shellSortTest(Array5000000, 5000000);
        mergeSortTest(Array5000000);
        quickSortTest(Array5000000);
        heapsortTest(Array5000000, 5000000);
        arraySortTest(Array5000000);
    }

    private void testesReversos() {
        System.out.println("---------- Testes Reversos ----------");

        PrepararVetor.revertidoVetor(Array5000000);
        insertionSortTest(Array5000000, 5000000);

        PrepararVetor.revertidoVetor(Array5000000);
        selectionSortTest(Array5000000, 5000000);

        PrepararVetor.revertidoVetor(Array5000000);
        bubblesortTest(Array5000000, 5000000);

        PrepararVetor.revertidoVetor(Array5000000);
        shellSortTest(Array5000000, 5000000);

        PrepararVetor.revertidoVetor(Array5000000);
        mergeSortTest(Array5000000);

        PrepararVetor.revertidoVetor(Array5000000);
        quickSortTest(Array5000000);

        PrepararVetor.revertidoVetor(Array5000000);
        heapsortTest(Array5000000, 5000000);

        PrepararVetor.revertidoVetor(Array5000000);
        arraySortTest(Array5000000);
    }

    private void testesAleatorios() {
        System.out.println("---------- Testes Aleatorios ----------");

        PrepararVetor.aleatorioVetor(Array5000000);
        insertionSortTest(Array5000000, 5000000);

        PrepararVetor.aleatorioVetor(Array5000000);

        PrepararVetor.aleatorioVetor(Array5000000);
        selectionSortTest(Array5000000, 5000000);

        PrepararVetor.aleatorioVetor(Array5000000);
        bubblesortTest(Array5000000, 5000000);

        PrepararVetor.aleatorioVetor(Array5000000);
        shellSortTest(Array5000000, 5000000);

        PrepararVetor.aleatorioVetor(Array5000000);
        mergeSortTest(Array5000000);

        PrepararVetor.aleatorioVetor(Array5000000);
        quickSortTest(Array5000000);

        PrepararVetor.aleatorioVetor(Array5000000);
        heapsortTest(Array5000000, 5000000);

        PrepararVetor.aleatorioVetor(Array5000000);
        arraySortTest(Array5000000);
    }
}
