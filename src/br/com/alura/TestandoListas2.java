package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas2 {


    public static void main(String[] args) {


        String aula1 = "Java.lang";
        String aula2 = "Java.util";
        String aula3 = "Java.io";


        ArrayList<String> aulas = new ArrayList<>();


        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        //Removento um Item da Lista;


        //aulas.remove(2);

        //System.out.println(aulas);

        System.out.println("Sequencia de Cursos com o Get: ");
        System.out.println("--> O primeiro Curso é o: " + aulas.get(0));
        System.out.println("--> O Segundo Curso é o : " + aulas.get(1));
        System.out.println("--> O Terceiro Curso é o: " + aulas.get(2));


        System.out.println("Ordenando uma Lista com o For: ");
        for(int i = 0; i < aulas.size(); i++){
            System.out.println("Aula: " + aulas.get(i));
        }


        System.out.println("Ordenando em Ordem Alfabética a Lista: ");


        Collections.sort(aulas);

        System.out.println(aulas);



        aulas.forEach(aula ->{
            System.out.println("Percorrendo: ");
            System.out.println("--> Aula: " + aula);
        });




    }
}
