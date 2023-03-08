package br.com.alura;

import java.util.ArrayList;
import java.util.List;

public class TestandoListaDeCursos3 {


    public static void main(String[] args) {



        Cursos3 javaCollecion = new Cursos3("Aula de Fisica","JADE");

        List<Aula> aulas = javaCollecion.getAulas();

        javaCollecion.getAulas().add(new Aula("Fisica do primeiro Ano.",34));
        javaCollecion.getAulas().add(new Aula("Artes da Cultura",34));
        javaCollecion.getAulas().add(new Aula("Ciencia da computação: ",34));
        javaCollecion.getAulas().add(new Aula("Artes historicas",23));


        System.out.println(aulas);

        javaCollecion.adicionar(new Aula("Faia fogo",43));


    }
}
