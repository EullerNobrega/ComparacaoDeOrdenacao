package projetoDeOrdenacao;

/**
 *
 * @author Euller
 */
public class Metodos {

    public static void insertionSort(int[] vet, int n) {
        int j, p, tmp;
        long tempoInicio = System.currentTimeMillis();

        for (p = 1; p < n; p++) {
            long tempo = System.currentTimeMillis() - tempoInicio;
            if (tempo < 3600000) {
                tmp = vet[p];
                for (j = p; j > 0 && tmp < vet[j - 1]; j--) {
                    vet[j] = vet[j - 1];
                }
                vet[j] = tmp;
            } else {
                System.out.println("O tempo de execucao passou de 1 hora");
                break;
            }

        }
    }

    public static void selectionSort(int[] vet, int n) {
        int i, j, min = 0, tmp;
        long tempoInicio = System.currentTimeMillis();

        for (i = 0; i < n - 1; i++) {
            long tempo = System.currentTimeMillis() - tempoInicio;
            if (tempo < 3600000) {
                for (j = i + 1, min = i; j < n; j++) {
                    if (vet[j] < vet[min]) {
                        min = j;
                    }
                }
                tmp = vet[i];
                vet[i] = vet[min];
                vet[min] = tmp;
            } else {
                System.out.println("O tempo de execucao passou de 1 hora");
                break;
            }
        }
    }

    public static void bubblesort(int[] vet, int n) {
        int i, j, tmp;
        long tempoInicio = System.currentTimeMillis();

        for (i = 0; i < n - 1; i++) {
            long tempo = System.currentTimeMillis() - tempoInicio;
            if (tempo < 3600000) {
                for (j = n - 1; j > i; j--) {
                    if (vet[j] < vet[j - 1]) {
                        tmp = vet[j - 1];
                        vet[j - 1] = vet[j];
                        vet[j] = tmp;
                    }
                }
            } else {
                System.out.println("O tempo de execucao passou de 1 hora");
                break;
            }
        }
    }

    public static void shellSort(int[] data, int n, int inc[], int num) {
        int j, hCnt, h, k, tmp;
        long tempoInicio = System.currentTimeMillis();

        for (num--; num >= 0; num--) {
            long tempo = System.currentTimeMillis() - tempoInicio;
            if (tempo < 3600000) {
                h = inc[num];
                for (hCnt = h; hCnt < 2 * h; hCnt++) {
                    for (j = hCnt; j < n; j += h) {
                        tmp = data[j];
                        k = j;
                        while (k - h >= 0 && tmp < data[k - h]) {
                            data[k] = data[k - h];
                            k -= h;
                        }
                        data[k] = tmp;
                    }
                }
            } else {
                System.out.println("O tempo de execucao passou de 1 hora");
                break;
            }
        }
    }

    public static void mergeSort(int[] v, int inicio, int fim, long tempoInicio) {
        int meio;

        if (inicio == fim) { // tamanho = 1
            return;
        } else {
            long tempo = System.currentTimeMillis() - tempoInicio;
            if (tempo < 3600000) {
                // encontra o meio
                meio = (inicio + fim) / 2;
                // ordena 1a metade
                mergeSort(v, inicio, meio, tempoInicio);
                // ordena 2a metade
                mergeSort(v, meio + 1, fim, tempoInicio);
                // intercala
                merge(v, inicio, meio, fim);
            } else {
                System.out.println("O tempo de execucao passou de 1 hora");
                return;
            }
        }
    }

    private static void merge(int[] vetor, int inicio, int meio, int fim) {
        int prim = inicio;
        int seg = meio + 1;
        int[] aux = new int[fim + 1];
        int i = inicio;
        // enquanto tiver elementos nos dois conjuntos
        while ((prim <= meio) && (seg <= fim)) {
            // insere elemento do primeiro
            if (vetor[prim] <= vetor[seg]) {
                aux[i] = vetor[prim];
                prim++;
            } else { // insere elemento do segundo
                aux[i] = vetor[seg];
                seg++;
            }
            i++;
        }
        // sobrou elementos do segundo
        if (prim > meio) {
            while (seg <= fim) {
                aux[i] = vetor[seg];
                seg++;
                i++;
            }
            // sobrou elementos do primeiro
        } else {
            while (prim <= meio) {
                aux[i] = vetor[prim];
                prim++;
                i++;
            }
        }
        // copia o vetor auxiliar no vetor principal
        for (i = inicio; i <= fim; i++) {
            vetor[i] = aux[i];
        }
    }

    private static int particiona(int A[], int esquerda, int direita) {
        int i, temp;
        int ptr = esquerda;
        int pivo = A[esquerda];
        /* pivô é primeiro elemento */
 /* Separa o vetor em elementos pequenos e grandes – em relação ao
        pivô */
        for (i = esquerda + 1; i <= direita; i++) {
            if (A[i] <= pivo) {
                ptr = ptr + 1;
                troca(A[i], A[ptr]);
            }
        }
        /* coloca o pivo entre os elementos pequenos e grandes */
        troca(A[esquerda], A[ptr]);
        return ptr;
    }

    private static void troca(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
    }

    public static void quickSort(int A[], int esquerda, int direita, long tempoInicio) {
        int pivo = particiona(A, esquerda, direita);
        long tempo = System.currentTimeMillis() - tempoInicio;
        if (tempo < 3600000) {
            if (pivo > esquerda) {
                quickSort(A, esquerda, pivo - 1, tempoInicio);
            }
            if (pivo < direita) {
                quickSort(A, pivo + 1, direita, tempoInicio);
            }
        } else {
            System.out.println("O tempo de execucao passou de 1 hora");
            return;
        }
    }

    public static void heapsort(int[] a, int n) {
        int i = n / 2, pai, filho, t;
        long tempoInicio = System.currentTimeMillis();

        for (;;) {
            long tempo = System.currentTimeMillis() - tempoInicio;
            if (tempo < 3600000) {
                if (i > 0) {
                    i--;
                    t = a[i];
                } else {
                    n--;
                    if (n == 0) {
                        return;
                    }
                    t = a[n];
                    a[n] = a[0];
                }
                pai = i;
                filho = i * 2 + 1;

                while (filho < n) {
                    if ((filho + 1 < n) && (a[filho + 1] > a[filho])) {
                        filho++;
                    }
                    if (a[filho] > t) {
                        a[pai] = a[filho];
                        pai = filho;
                        filho = pai * 2 + 1;
                    } else {
                        break;
                    }
                }
                a[pai] = t;
            } else {
                System.out.println("O tempo de execucao passou de 1 hora");
                return;
            }
        }/* fim for*/

    }

}
