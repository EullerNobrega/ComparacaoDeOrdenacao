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
public class Array50000 extends AbstractArray {

    private int[] Array50000;

    public Array50000() {
        Array50000 = new int[50000];
    }

    public int[] getArray50000() {
        return Array50000;
    }

    public void testes() {
        testesOrdenados();
        testesReversos();
        testesAleatorios();
    }

    private void testesOrdenados() {
        System.out.println("---------- Testes Ordenados ----------");
        PrepararVetor.ordenadoVetor(Array50000);

        insertionSortTest(Array50000, 50000);
        selectionSortTest(Array50000, 50000);
        bubblesortTest(Array50000, 50000);
        shellSortTest(Array50000, 50000);
        mergeSortTest(Array50000);
        quickSortTest(Array50000);
        heapsortTest(Array50000, 50000);
        arraySortTest(Array50000);
    }

    private void testesReversos() {
        System.out.println("---------- Testes Reversos ----------");

        PrepararVetor.revertidoVetor(Array50000);
        insertionSortTest(Array50000, 50000);

        PrepararVetor.revertidoVetor(Array50000);
        selectionSortTest(Array50000, 50000);

        PrepararVetor.revertidoVetor(Array50000);
        bubblesortTest(Array50000, 50000);

        PrepararVetor.revertidoVetor(Array50000);
        shellSortTest(Array50000, 50000);

        PrepararVetor.revertidoVetor(Array50000);
        mergeSortTest(Array50000);
        
        PrepararVetor.revertidoVetor(Array50000);
        quickSortTest(Array50000);

        PrepararVetor.revertidoVetor(Array50000);
        heapsortTest(Array50000, 50000);

        PrepararVetor.revertidoVetor(Array50000);
        arraySortTest(Array50000);
        
    }

    private void testesAleatorios() {
        System.out.println("---------- Testes Aleatorios ----------");

        PrepararVetor.aleatorioVetor(Array50000);
        insertionSortTest(Array50000, 50000);

        PrepararVetor.aleatorioVetor(Array50000);

        PrepararVetor.aleatorioVetor(Array50000);
        selectionSortTest(Array50000, 50000);

        PrepararVetor.aleatorioVetor(Array50000);
        bubblesortTest(Array50000, 50000);

        PrepararVetor.aleatorioVetor(Array50000);
        shellSortTest(Array50000, 50000);

        PrepararVetor.aleatorioVetor(Array50000);
        mergeSortTest(Array50000);

        PrepararVetor.aleatorioVetor(Array50000);
        quickSortTest(Array50000);
        
        PrepararVetor.aleatorioVetor(Array50000);
        heapsortTest(Array50000, 50000);

        PrepararVetor.aleatorioVetor(Array50000);
        arraySortTest(Array50000);
        
    }
}
