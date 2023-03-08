package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas4 {


    public static void main(String[] args) {




        String faixa1 = "Branca";
        String faixa2 = "Azul";
        String faixa3 = " Roxa";
        String faixa4 = " Marrom";
        String faixa5 = " Preta";


        ArrayList<String> faixas = new ArrayList<>();


        faixas.add(faixa1);
        faixas.add(faixa2);
        faixas.add(faixa3);
        faixas.add(faixa4);
        faixas.add(faixa5);

        System.out.println("--> Todas As Faixas Iniciais do Jiu Jitsu: ");

        System.out.println(faixas);


        System.out.println("--> Faixas do Jiu Jitsu em Ordem Alfabética: ");

        Collections.sort(faixas);
        System.out.println(faixas);

        System.out.println("--> Ordenando a Lista com o For: ");

        for(int i =0; i < faixas.size(); i++)   {
            System.out.println("Faixa: " + faixas.get(i));
        }
        System.out.println(" Ordenando a Lista usando o Foreach");
        faixas.forEach(faixa -> {
            System.out.println("--> Procedimento: ");
            System.out.println("Faixas: --> " + faixa);
        });






        System.out.println("--> Removendo Itens da Lista: ");
        faixas.remove(2);
        System.out.println("--> Vai ser Removido a faixa Roxa: ");
        System.out.println(faixas);


    }
}

