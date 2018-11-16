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
public class Array5000 extends AbstractArray {

    private int[] Array5000;

    public Array5000() {
        Array5000 = new int[5000];
    }

    public int[] getArray5000() {
        return Array5000;
    }

    public void testes() {
        testesOrdenados();
        testesReversos();
        testesAleatorios();
    }

    private void testesOrdenados() {
        System.out.println("---------- Testes Ordenados ----------");
        PrepararVetor.ordenadoVetor(Array5000);

        insertionSortTest(Array5000, 5000);
        selectionSortTest(Array5000, 5000);
        bubblesortTest(Array5000, 5000);
        shellSortTest(Array5000, 5000);
        mergeSortTest(Array5000);
        quickSortTest(Array5000);
        heapsortTest(Array5000, 5000);
        arraySortTest(Array5000);
    }

    private void testesReversos() {
        System.out.println("---------- Testes Reversos ----------");

        PrepararVetor.revertidoVetor(Array5000);
        insertionSortTest(Array5000, 5000);

        PrepararVetor.revertidoVetor(Array5000);
        selectionSortTest(Array5000, 5000);

        PrepararVetor.revertidoVetor(Array5000);
        bubblesortTest(Array5000, 5000);

        PrepararVetor.revertidoVetor(Array5000);
        shellSortTest(Array5000, 5000);

        PrepararVetor.revertidoVetor(Array5000);
        mergeSortTest(Array5000);

        PrepararVetor.revertidoVetor(Array5000);
        quickSortTest(Array5000);

        PrepararVetor.revertidoVetor(Array5000);
        heapsortTest(Array5000, 5000);

        PrepararVetor.revertidoVetor(Array5000);
        arraySortTest(Array5000);
    }

    private void testesAleatorios() {
        System.out.println("---------- Testes Aleatorios ----------");

        PrepararVetor.aleatorioVetor(Array5000);
        insertionSortTest(Array5000, 5000);

        PrepararVetor.aleatorioVetor(Array5000);

        PrepararVetor.aleatorioVetor(Array5000);
        selectionSortTest(Array5000, 5000);

        PrepararVetor.aleatorioVetor(Array5000);
        bubblesortTest(Array5000, 5000);

        PrepararVetor.aleatorioVetor(Array5000);
        shellSortTest(Array5000, 5000);

        PrepararVetor.aleatorioVetor(Array5000);
        mergeSortTest(Array5000);

        PrepararVetor.aleatorioVetor(Array5000);
        quickSortTest(Array5000);

        PrepararVetor.aleatorioVetor(Array5000);
        heapsortTest(Array5000, 5000);

        PrepararVetor.aleatorioVetor(Array5000);
        arraySortTest(Array5000);
    }
}
