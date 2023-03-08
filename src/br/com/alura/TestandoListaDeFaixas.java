package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Collections.sort;

public class TestandoListaDeFaixas {


    public static void main(String[] args) {


        Faixas faixa1 = new Faixas("Branca",2);
        Faixas faixa2 = new Faixas("Azul",4);
        Faixas faixa3 = new Faixas("Roxa",6);
        Faixas faixa4 = new Faixas("Marrom",8);
        Faixas faixa5 = new Faixas("Preta",10);


        ArrayList<Faixas> faixas = new ArrayList<>();
        faixas.add(faixa1);
        faixas.add(faixa2);
        faixas.add(faixa3);
        faixas.add(faixa4);
        faixas.add(faixa5);


        System.out.println(faixas);

        Collections.sort(faixas);

        System.out.println(faixas);


        Collections.sort(faixas, Comparator.comparing(Faixas::getTempo));

        System.out.println(faixas);


        faixas.sort(Comparator.comparing(Faixas::getTempo));

        System.out.println(faixas);












    }




}
