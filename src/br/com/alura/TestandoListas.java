package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {


    public static void main(String[] args) {



        String curso1 = "Java 8: Tire proveitos dos novos recursos da linguagem.";
        String curso2 = "Apache Camel";
        String curso3 = "Certificação Java SE 8 programe I";


        ArrayList<String> cursos = new ArrayList<>();


        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);

        System.out.println(cursos);
        // Removendo Coisas da Lista.

       // cursos.remove(0);


        //System.out.println(cursos);



        // Saber só um número da lista.


        System.out.println(" O Primeiro curso da Lista é o: " + cursos.get(0));



        for(int i =0; i < cursos.size(); i++){
            System.out.println("Aula: " + cursos.get(i));

        }

        System.out.println("Para Mostrar a Lista em Ordem Alfabética: ");


        Collections.sort(cursos);

        System.out.println(cursos);
    }
}
