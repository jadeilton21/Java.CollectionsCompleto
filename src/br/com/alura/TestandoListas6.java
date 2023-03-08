package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas6 {

    public static void main(String[] args) {




        String faixa1 = "Branca";
        String faixa2 = "Azul";
        String faixa3 = "Roxa";
        String faixa4 = "Marrom";
        String faixa5 = "Preta";


        ArrayList<String> faixas = new ArrayList<>();

        faixas.add(faixa1);
        faixas.add(faixa2);
        faixas.add(faixa3);
        faixas.add(faixa4);
        faixas.add(faixa5);

        System.out.println("--> Todas as faixas adicionadas: ");
        System.out.println(faixas);

        System.out.println("--> Sequencia de Nomes de Faixa: ");

        System.out.println("--> Faixa: " + faixas.get(0));
        System.out.println("--> Faixa: " + faixas.get(1));
        System.out.println("--> Faixa: " + faixas.get(2));
        System.out.println("--> Faixa: " + faixas.get(3));
        System.out.println("--> Faixa: " + faixas.get(4));


        System.out.println("--> Sequencia de Faixas em For Simples:  ");

        for(int i = 0; i < faixas.size(); i++){
            System.out.println("Faixa: " + faixas.get(i));

        }

        System.out.println("--> Sequencia de Faixas em ForEach");

        faixas.forEach(faixa -> {
            System.out.println("-> Procedimento: ");
            System.out.println("-> Faixa: " + faixa);
        });


        System.out.println("--> Coleção da Lista em Ordem Alfabética: ");

        Collections.sort(faixas);
        System.out.println(faixas);


        System.out.println("--> Removendo Itens da Listas: ");

        faixas.remove(2);


        System.out.println(faixas);


















    }
}
