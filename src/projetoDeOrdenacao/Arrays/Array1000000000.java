///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package projetoDeOrdenacao.Arrays;
//
//import java.util.Arrays;
//import projetoDeOrdenacao.PrepararVetor;
//
///**
// *
// * @author Euller
// */
//public class Array1000000000 extends AbstractArray{
//    private int[] Array1000000000;
//
//    public int[] getArray1000000000() {
//        return Array1000000000;
//    }
//    
//     public void testes(){
//        testesOrdenados();
////        testesReversos();
////        testesAleatorios();
//    }
//
//    private void testesOrdenados() {
//        System.out.println("---------- Testes Ordenados ----------");
//        Array1000000000 = new int[1000000000];
//        PrepararVetor.ordenadoVetor(Array1000000000);
//
//        insertionSortTest(Array1000000000, 1000000000);
//        selectionSortTest(Array1000000000, 1000000000);
//        bubblesortTest(Array1000000000, 1000000000);
//        shellSortTest(Array1000000000, 1000000000);
//        mergeSortTest(Array1000000000);
//        quickSortTest(Array1000000000);
//        heapsortTest(Array1000000000, 1000000000);
//        arraySortTest(Array1000000000);
//        System.gc();
//    }
//
//    private void testesReversos() {
//        System.out.println("---------- Testes Reversos ----------");
//
//        Array1000000000 = new int[1000000000];
//        Arrays.sort(Array1000000000);
//        PrepararVetor.revertidoVetor(Array1000000000);
//        insertionSortTest(Array1000000000, 1000000000);
//        
//        PrepararVetor.revertidoVetor(Array1000000000);
//        selectionSortTest(Array1000000000, 1000000000);
//        
//        PrepararVetor.revertidoVetor(Array1000000000);
//        bubblesortTest(Array1000000000, 1000000000);
//        
//        PrepararVetor.revertidoVetor(Array1000000000);
//        shellSortTest(Array1000000000, 1000000000);
//        
//        PrepararVetor.revertidoVetor(Array1000000000);
//        mergeSortTest(Array1000000000);
//        
//        PrepararVetor.revertidoVetor(Array1000000000);
//        quickSortTest(Array1000000000);
//        
//        PrepararVetor.revertidoVetor(Array1000000000);
//        heapsortTest(Array1000000000, 1000000000);
//        
//        PrepararVetor.revertidoVetor(Array1000000000);
//        arraySortTest(Array1000000000);
//    }
//
////    private void testesAleatorios() {
////        System.out.println("---------- Testes Aleatorios ----------");
////
////        Array1000000000 = new int[1000000000];
////        PrepararVetor.aleatorioVetor(Array1000000000);
////        insertionSortTest(Array1000000000, 1000000000);
////        
////        Array1000000000 = new int[1000000000];
////        PrepararVetor.aleatorioVetor(Array1000000000);
////        
////        Array1000000000 = new int[1000000000];
////        PrepararVetor.aleatorioVetor(Array1000000000);
////        selectionSortTest(Array1000000000, 1000000000);
////        
////        Array1000000000 = new int[1000000000];
////        PrepararVetor.aleatorioVetor(Array1000000000);
////        bubblesortTest(Array1000000000, 1000000000);
////        
////        Array1000000000 = new int[1000000000];
////        PrepararVetor.aleatorioVetor(Array1000000000);
////        shellSortTest(Array1000000000, 1000000000);
////        
////        Array1000000000 = new int[1000000000];
////        PrepararVetor.aleatorioVetor(Array1000000000);
////        mergeSortTest(Array1000000000);
////        
////        Array1000000000 = new int[1000000000];
////        PrepararVetor.aleatorioVetor(Array1000000000);
////        quickSortTest(Array1000000000);
////        
////        Array1000000000 = new int[1000000000];
////        PrepararVetor.aleatorioVetor(Array1000000000);
////        heapsortTest(Array1000000000, 1000000000);
////        
////        Array1000000000 = new int[1000000000];
////        PrepararVetor.aleatorioVetor(Array1000000000);
////        arraySortTest(Array1000000000);
////    }
//}
