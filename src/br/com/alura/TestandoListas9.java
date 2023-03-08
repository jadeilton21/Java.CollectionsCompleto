package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas9 {


    public static void main(String[] args) {


        String cor1 = "Vermelho";
        String cor2 = "Amarelo";
        String cor3 = "Roxo";
        String cor4 = "Verde";

        ArrayList<String> cores = new ArrayList<>();
        cores.add(cor1);
        cores.add(cor2);
        cores.add(cor3);
        cores.add(cor4);

        System.out.println("--> Sequencia de Cores: ");
        System.out.println(cores);

        System.out.println("--> Sequencia de Cores em Ordem Alfabética: ");
        Collections.sort(cores);
        System.out.println(cores);


        System.out.println("--> Sequencia das Cores usando For Simples: ");

        for(int i =0; i < cores.size(); i++){
            System.out.println("Cor: " + cores.get(i));

        }

        System.out.println("--> Sequencia de Cores usando ForEach: ");

        cores.forEach(cor->{
            System.out.println("-> Cor: " + cor);
        });

        System.out.println(" Removendo Itens da Lista de Cor: ");

        cores.remove(0);

        System.out.println(cores);
    }
}
