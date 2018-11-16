/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoDeOrdenacao.Arrays;

import java.util.Arrays;
import projetoDeOrdenacao.Metodos;

/**
 *
 * @author Euller
 */
public class AbstractArray {

    public void insertionSortTest(int[] v, int qtd) {
        long tempoInicio = System.currentTimeMillis();
        Metodos.insertionSort(v, qtd);
        System.out.println("Insertion Sort: Tempo Total: " + (System.currentTimeMillis() - tempoInicio));
    }

    public void selectionSortTest(int[] v, int qtd) {
        long tempoInicio = System.currentTimeMillis();
        Metodos.selectionSort(v, qtd);
        System.out.println("Selection Sort: Tempo Total: " + (System.currentTimeMillis() - tempoInicio));
    }

    public void bubblesortTest(int[] v, int qtd) {
        long tempoInicio = System.currentTimeMillis();
        Metodos.bubblesort(v, qtd);
        System.out.println("Bubble Sort: Tempo Total: " + (System.currentTimeMillis() - tempoInicio));
    }

    public void shellSortTest(int[] v, int qtd) {
        long tempoInicio = System.currentTimeMillis();
        int[] inc = new int[qtd];

        Metodos.shellSort(v, 0, inc, qtd);
        System.out.println("Shell Sort: Tempo Total: " + (System.currentTimeMillis() - tempoInicio));
    }

    public void mergeSortTest(int[] v) {
        long tempoInicio = System.currentTimeMillis();
        Metodos.mergeSort(v, 0, v.length - 1, System.currentTimeMillis());
        System.out.println("Merge Sort: Tempo Total: " + (System.currentTimeMillis() - tempoInicio));
    }

    public void quickSortTest(int[] v) {
        long tempoInicio = System.currentTimeMillis();
        try{
            Metodos.quickSort(v, 0, v.length - 1, System.currentTimeMillis());
        }catch(StackOverflowError ex){
            ex = new StackOverflowError("Estourou a pilha da recursividade");
        }
        System.out.println("Quick Sort: Tempo Total: " + (System.currentTimeMillis() - tempoInicio));
    }

    public void heapsortTest(int[] v, int qtd) {
        long tempoInicio = System.currentTimeMillis();
        Metodos.heapsort(v, qtd);
        System.out.println("Heap Sort: Tempo Total: " + (System.currentTimeMillis() - tempoInicio));
    }

    public void arraySortTest(int[] v) {
        long tempoInicio = System.currentTimeMillis();
        Arrays.sort(v);
        System.out.println("Array Sort: Tempo Total: " + (System.currentTimeMillis() - tempoInicio));
    }
}
