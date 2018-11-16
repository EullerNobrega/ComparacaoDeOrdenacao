/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoDeOrdenacao;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.TreeSet;

/**
 *
 * @author Euller
 */
public class PrepararVetor {

    public static int[] ordenadoVetor(int[] v) {
        Random gerador = new Random();

        int numero = gerador.nextInt(100000);

        for (int i = 0; i < v.length; i++) {
            v[i] = numero;
            numero++;
        }
        return v;
    }

    public static int[] revertidoVetor(int[] v) {
        Collections.reverse(Arrays.asList(v));
        return v;
    }

    public static int[] aleatorioVetor(int[] v) {
        Random gerador = new Random();
      
        
        for (int i = 0; i < v.length; i++) {
            v[i] = gerador.nextInt(100000);
        }
        
        return v;
    }
}
