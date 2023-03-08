package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas7 {


    public static void main(String[] args) {


        String aula1 = "Java";
        String aula2 = "Python";
        String aula3 = "CC++";


        ArrayList<String> aulas = new ArrayList();

        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(" Aulas da semana: ");

        System.out.println(aulas);


        System.out.println(" Aulas em Ordem Alfabética: ");

        Collections.sort(aulas);
        System.out.println(aulas);


        System.out.println("--> Sequencia de Aulas usando o For Simples: ");

        for(int i =0; i < aulas.size(); i ++){
            System.out.println("--> Aula: " + aulas.get(i));

        }

        System.out.println("--> Sequencia de Aulas usando o Foreach: ");

        aulas.forEach(aula -> {
            System.out.println("--> Aula: " + aula );
        });


        System.out.println("--> Removendo Item da Lista: ");
        aulas.remove(0);
        System.out.println(aulas);





    }
}
