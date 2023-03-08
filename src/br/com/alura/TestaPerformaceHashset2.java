package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class TestaPerformaceHashset2 {


    public static void main(String[] args) {


        Collection<Integer> numero = new HashSet<>();

        long inicio = System.currentTimeMillis();


        for(int i=0; i <= 5000; i++){
            numero.add(i);
        }


        for (Integer numeros : numero) {
            numero.contains(numeros);
        }

        long fim = System.currentTimeMillis();

        long resultadoFinal = fim - inicio;

        System.out.println("--> O resultado Final usando HashSet é: " + resultadoFinal);
















    }
}
