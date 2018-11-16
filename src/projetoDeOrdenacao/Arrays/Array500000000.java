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
public class Array500000000 extends AbstractArray{

    private int[] Array500000000;

    public Array500000000() {
        Array500000000 = new int[5000000];
    }

    public int[] getArray500000000() {
        return Array500000000;
    }

    public void testes() {
        testesOrdenados();
        testesReversos();
        testesAleatorios();
    }

    private void testesOrdenados() {
        System.out.println("---------- Testes Ordenados ----------");
        PrepararVetor.ordenadoVetor(Array500000000);

        insertionSortTest(Array500000000, 5000000);
        selectionSortTest(Array500000000, 5000000);
        bubblesortTest(Array500000000, 5000000);
        shellSortTest(Array500000000, 5000000);
        mergeSortTest(Array500000000);
        quickSortTest(Array500000000);
        heapsortTest(Array500000000, 5000000);
        arraySortTest(Array500000000);
    }

    private void testesReversos() {
        System.out.println("---------- Testes Reversos ----------");

        PrepararVetor.revertidoVetor(Array500000000);
        insertionSortTest(Array500000000, 5000000);

        PrepararVetor.revertidoVetor(Array500000000);
        selectionSortTest(Array500000000, 5000000);

        PrepararVetor.revertidoVetor(Array500000000);
        bubblesortTest(Array500000000, 5000000);

        PrepararVetor.revertidoVetor(Array500000000);
        shellSortTest(Array500000000, 5000000);

        PrepararVetor.revertidoVetor(Array500000000);
        mergeSortTest(Array500000000);

        PrepararVetor.revertidoVetor(Array500000000);
        quickSortTest(Array500000000);

        PrepararVetor.revertidoVetor(Array500000000);
        heapsortTest(Array500000000, 5000000);

        PrepararVetor.revertidoVetor(Array500000000);
        arraySortTest(Array500000000);
    }

    private void testesAleatorios() {
        System.out.println("---------- Testes Aleatorios ----------");

        PrepararVetor.aleatorioVetor(Array500000000);
        insertionSortTest(Array500000000, 5000000);

        PrepararVetor.aleatorioVetor(Array500000000);

        PrepararVetor.aleatorioVetor(Array500000000);
        selectionSortTest(Array500000000, 5000000);

        PrepararVetor.aleatorioVetor(Array500000000);
        bubblesortTest(Array500000000, 5000000);

        PrepararVetor.aleatorioVetor(Array500000000);
        shellSortTest(Array500000000, 5000000);

        PrepararVetor.aleatorioVetor(Array500000000);
        mergeSortTest(Array500000000);

        PrepararVetor.aleatorioVetor(Array500000000);
        quickSortTest(Array500000000);

        PrepararVetor.aleatorioVetor(Array500000000);
        heapsortTest(Array500000000, 5000000);

        PrepararVetor.aleatorioVetor(Array500000000);
        arraySortTest(Array500000000);
    }
}
