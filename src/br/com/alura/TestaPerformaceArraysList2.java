package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;

public class TestaPerformaceArraysList2 {


    public static void main(String[] args) {

        Collection<Integer> numero = new ArrayList<>();

        long inicio = System.currentTimeMillis();


        for(int i=0; i <= 5000; i++){
            numero.add(i);
        }

        for (Integer numeros : numero) {
            numero.contains(numeros);
        }

        System.out.println("==================");


        long fim = System.currentTimeMillis();
        long fimDoResultado = inicio - fim;


        System.out.println("--> A velocidade é de:" + fimDoResultado);






    }
}
