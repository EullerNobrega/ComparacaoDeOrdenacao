package comparacao;

import java.util.Scanner;

/**
 *
 * @author Euller
 */
public class GenericArray {

    private int[] array;
    private int metodo, tamVetor;

    public GenericArray(int metodo, int tamVetor) {
        this.array = new int[tamVetor];
        this.metodo = metodo;
        this.tamVetor = tamVetor;
    }

    public void testes() {
        Scanner in = new Scanner(System.in);
        FactoryTeste factoryTeste;
        System.out.println("Informe qual a orientacao dos elementos no vetor: ");
        System.out.println("\n1 - Elementos Ordenados\n2 - Elementos Invertidos\n3 - Elementos Aleatorios");
        int escolha = in.nextInt();
        in.nextLine();
        factoryTeste = new FactoryTeste(escolha, metodo, tamVetor, array);
        factoryTeste.escolha();
    }

    public void setTamArray(int tamVetor) {
        this.tamVetor = tamVetor;
        this.array = new int[tamVetor];
    }

}
