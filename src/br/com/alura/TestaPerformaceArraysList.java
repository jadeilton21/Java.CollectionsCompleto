package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;

public class TestaPerformaceArraysList {


    public static void main(String[] args) {


        Collection<Integer> numero = new ArrayList<>();

        long inicio = System.currentTimeMillis();

        for(int i=0; i <= 5000; i++){
            numero.add(i);
        }

        for (Integer numeros : numero) {
            numero.contains(numeros);
        }



        long fim = System.currentTimeMillis();

        long tempoFinalExecucao = inicio - fim;


        System.out.println("--> Seu tempo de Execução foi de: " + tempoFinalExecucao);









    }
}
