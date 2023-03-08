package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestandoListaDeAlunos2 {


    public static void main(String[] args) {


        Aula aula1 = new Aula("Revisando o conteudo ", 14);
        Aula aula2 = new Aula("Subtraindo equações ", 20);
        Aula aula3 = new Aula("Somando Divisores", 30);


        ArrayList<Aula> aulas = new ArrayList<>();

        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);


        Collections.sort(aulas);


        System.out.println(aulas);


        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));

        System.out.println(aulas);


        aulas.sort(Comparator.comparing(Aula::getTempo));

        System.out.println(aulas);




    }
}
