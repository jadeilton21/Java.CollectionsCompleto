package br.com.alura;

import java.util.ArrayList;
import java.util.List;

public class TestandoListaDeCursos4 {


    public static void main(String[] args) {





        Cursos4 javaCollecion = new Cursos4("jadeilton","jadelton   ");


        System.out.println(javaCollecion);


        List<Aula> aulas = javaCollecion.getAulas();

        javaCollecion.getAulas().add(new Aula("Ervas", 32));
        javaCollecion.getAulas().add(new Aula("Ganjah",43));
        javaCollecion.getAulas().add(new Aula("fafd",34));


        System.out.println(aulas);


        javaCollecion.Adicionar(new Aula("ggagag",23));
        javaCollecion.Adicionar(new Aula("fodkfs",342));


        System.out.println(aulas);


    }
}
