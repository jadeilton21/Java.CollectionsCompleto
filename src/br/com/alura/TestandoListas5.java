package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas5 {


    public static void main(String[] args) {


        String ep1 = "--> Guerra";
        String ep2 = "--> Fogo";
        String ep3 = "--> Mortes";
        String ep4 = "--> Ganhar";


        ArrayList<String>   eps = new ArrayList<>();

        eps.add(ep1);
        eps.add(ep2);
        eps.add(ep3);
        eps.add(ep4);

        System.out.println(" Lista Feita: ");
        System.out.println(eps);
        System.out.println("Ordenando em Ordem Alfabética: ");
        Collections.sort(eps);
        System.out.println(eps);


        System.out.println("Ordenando a Lista por cada nome: ");

        System.out.println("--> Eps: " + eps.get(0));
        System.out.println("--> Eps: " + eps.get(1));
        System.out.println("--> Eps: " + eps.get(2));
        System.out.println("--> Eps: " + eps.get(3));


        System.out.println("Ordenando a Lista com o For simples: ");

        for(int i = 0; i < eps.size(); i++){
            System.out.println("--> Eps: " + eps.get(i));
        }

        System.out.println("--> Ordenando a Lista com o ForEach: ");

        eps.forEach(ep -> {
            System.out.println("--> Procedimento: ");
            System.out.println("Escala: " + ep);

        });

        System.out.println("Removendo Itens da Lista: ");

        eps.remove(1);
        System.out.println(eps);

    }
}
