package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class TestaPerformaceHashset {
    public static void main(String[] args) {


        Collection<Integer>  numero = new HashSet<>();


        long inicio = System.currentTimeMillis();


        for(int i =0; i <= 5000; i++){
           numero.add(i);
        }


        for (Integer numeros : numero) {
            numero.contains(numeros);
        }


        long fim = System.currentTimeMillis();
        long resulsadoFinal = fim - inicio;


        System.out.println("--> A velocidade usando ArraysList é de: " + resulsadoFinal);



    }
}
