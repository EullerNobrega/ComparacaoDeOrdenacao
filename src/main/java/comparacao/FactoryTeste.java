package comparacao;
import java.util.Arrays;

/**
 *
 * @author Euller
 */

public class FactoryTeste {

    private int tipoTeste;
    private int[] array;
    private FactoryMetodoOrdenacao factoryMetodoOrdenacao;

    public FactoryTeste(int tipoTeste, int metodo, int tamVetor, int[] array) {
        this.tipoTeste = tipoTeste;
        this.array = array;
        this.factoryMetodoOrdenacao = new FactoryMetodoOrdenacao(metodo, tamVetor);
    }

    public void escolha() {
        switch (tipoTeste)

        {
            case 1:
                testeOrdenado();
                break;
            case 2:
                testeReverso();
                break;
            case 3:
                testeAleatorio();
                break;
            case 4:
                testeOrdenado();
                testeReverso();
                testeAleatorio();
                break;
            default:
                System.out.println("Opcao invalida");
                break;

        }
    }

    private void testeOrdenado() {
        System.out.println("---------- Teste Ordenado ----------");
        PrepararVetor.ordenadoVetor(array);
        factoryMetodoOrdenacao.setArray(array);
        factoryMetodoOrdenacao.escolhaMetodo();
        System.gc();
    }

    private void testeReverso() {
        System.out.println("---------- Teste Reverso ----------");

        Arrays.sort(array);
        PrepararVetor.revertidoVetor(array);
        factoryMetodoOrdenacao.setArray(array);
        factoryMetodoOrdenacao.escolhaMetodo();
        System.gc();
    }

    private void testeAleatorio() {
        System.out.println("---------- Teste Aleatorio ----------");

        PrepararVetor.aleatorioVetor(array);
        factoryMetodoOrdenacao.setArray(array);
        factoryMetodoOrdenacao.escolhaMetodo();
        System.gc();
    }
}