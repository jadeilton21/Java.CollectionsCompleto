package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas10 {


    public static void main(String[] args) {



        String hemp1 = "Sativa";
        String hemp2 = "Indica";
        String hemp3 = "Rudelares";


        ArrayList<String> ervas = new ArrayList<>();

        ervas.add(hemp1);
        ervas.add(hemp2);
        ervas.add(hemp3);

        System.out.println("--> Tipos de cepa de Cannabis");
        System.out.println(ervas);

        System.out.println("--> Tipos de Cannabis em Ordem Alfabética:  ");

        Collections.sort(ervas);
        System.out.println(ervas);

        System.out.println("--> Ervas em Sequencia Com o for Simples: ");
        for(int i =0; i < ervas.size(); i++){
            System.out.println("--> Erva: " + ervas.get(i));
        }

        System.out.println("--> Sequencia de Ervas com o For Each:");

        ervas.forEach(erva->{
            System.out.println("-> Erva: " + erva);
        });


        System.out.println("-- > Removendo Itens da Lista: ");
        System.out.println(ervas);

        ervas.remove(2);
        System.out.println(ervas);



    }
}
