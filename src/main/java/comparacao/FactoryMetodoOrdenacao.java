package comparacao;

import java.awt.Color;
import java.util.Arrays;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Euller
 */

public class FactoryMetodoOrdenacao {

    private int metodo, tamVetor;
    private int[] array;
    private long tempoInsertion, tempoSelection, tempoBubble, tempoShell, tempoMerge, tempoQuick, tempoHeap, tempoArray;

    public FactoryMetodoOrdenacao(int metodo, int tamVetor) {
        this.metodo = metodo;
        this.tamVetor = tamVetor;
    }

    public void escolhaMetodo() {
        switch (metodo) {
            case 1:
                insertionSortTest(array, tamVetor);
                chartAll();
                break;
            case 2:
                selectionSortTest(array, tamVetor);
                chartAll();
                break;
            case 3:
                bubblesortTest(array, tamVetor);
                chartAll();
                break;
            case 4:
                shellSortTest(array, tamVetor);
                chartAll();
                break;
            case 5:
                mergeSortTest(array);
                chartAll();
                break;
            case 6:
                quickSortTest(array);
                chartAll();
                break;
            case 7:
                heapsortTest(array, tamVetor);
                chartAll();
                break;
            case 8:
                arraySortTest(array);
                chartAll();
                break;
            case 0:
                insertionSortTest(array, tamVetor);
                selectionSortTest(array, tamVetor);
                bubblesortTest(array, tamVetor);
                shellSortTest(array, tamVetor);
                mergeSortTest(array);
                quickSortTest(array);
                heapsortTest(array, tamVetor);
                arraySortTest(array);
                chartAll();
                break;
            default:
                System.out.println("Opcao invalida");
                break;

        }
    }

    private void insertionSortTest(int[] array, int tamVetor) {
        long tempoInicio = System.nanoTime();
        Metodos.insertionSort(array, tamVetor);
        tempoInsertion = (System.nanoTime() - tempoInicio);
        System.out.println("Insertion Sort: Tempo Total: " + tempoInsertion);
       
    }

    private void selectionSortTest(int[] array, int tamVetor) {
        long tempoInicio = System.nanoTime();
        Metodos.selectionSort(array, tamVetor);
        tempoSelection = (System.nanoTime() - tempoInicio);
        System.out.println("Selection Sort: Tempo Total: " + tempoSelection);
    }

    private void bubblesortTest(int[] array, int tamVetor) {
        long tempoInicio = System.nanoTime();
        Metodos.bubblesort(array, tamVetor);
        tempoBubble = (System.nanoTime() - tempoInicio);
        System.out.println("Bubble Sort: Tempo Total: " + tempoBubble);
    }

    private void shellSortTest(int[] array, int tamVetor) {
        long tempoInicio = System.nanoTime();
        int[] inc = new int[tamVetor];

        Metodos.shellSort(array, 0, inc, tamVetor);
        tempoShell = (System.nanoTime() - tempoInicio);
        System.out.println("Shell Sort: Tempo Total: " + tempoShell);
    }

    private void mergeSortTest(int[] array) {
        long tempoInicio = System.nanoTime();
        Metodos.mergeSort(array, 0, array.length - 1, System.nanoTime());
        tempoMerge = (System.nanoTime() - tempoInicio);
        System.out.println("Merge Sort: Tempo Total: " + tempoMerge);
    }

    private void quickSortTest(int[] array) {
        long tempoInicio = System.nanoTime();
        try {
            Metodos.quickSort(array, 0, array.length - 1, System.nanoTime());
        } catch (StackOverflowError ex) {
            ex = new StackOverflowError("Estourou a pilha da recursividade");
        }
        tempoQuick = (System.nanoTime() - tempoInicio);
        System.out.println("Quick Sort: Tempo Total: " + tempoQuick);
    }

    private void heapsortTest(int[] array, int tamVetor) {
        long tempoInicio = System.nanoTime();
        Metodos.heapsort(array, tamVetor);
        tempoHeap = (System.nanoTime() - tempoInicio);
        System.out.println("Heap Sort: Tempo Total: " + tempoHeap);
    }

    private void arraySortTest(int[] array) {
        long tempoInicio = System.nanoTime();
        Arrays.sort(array);
        tempoArray = (System.nanoTime() - tempoInicio);
        System.out.println("Array Sort: Tempo Total: " + tempoArray);
    }

    private void chartAll() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(tempoInsertion, "Insertion Sort", "Tempo Total");
        dataset.setValue(tempoSelection, "Selection Sort", "Tempo Total");
        dataset.setValue(tempoBubble, "Bubble Sort", "Tempo Total");
        dataset.setValue(tempoShell, "Shell Sort", "Tempo Total");
        dataset.setValue(tempoMerge, "Merge Sort", "Tempo Total");
        dataset.setValue(tempoQuick, "Quick Sort", "Tempo Total");
        dataset.setValue(tempoHeap, "Heap Sort", "Tempo Total");
        dataset.setValue(tempoArray, "Array Sort", "Tempo Total");
        JFreeChart chart = ChartFactory.createBarChart("Comparacao ", String.valueOf(tamVetor), "Nano Time",
                dataset, PlotOrientation.VERTICAL, true, true, false);
        chart.setBackgroundPaint(Color.white);
        chart.getTitle().setPaint(Color.red);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLUE);
        ChartFrame frame = new ChartFrame("Metodos de Ordenacao", chart);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(850,700);
    }



    public void setArray(int[] array) {
        this.array = array;
    }

}