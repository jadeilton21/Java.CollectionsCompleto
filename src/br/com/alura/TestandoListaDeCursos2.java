package br.com.alura;

import java.util.ArrayList;
import java.util.List;

public class TestandoListaDeCursos2 {


    public static void main(String[] args) {



        Cursos2 javaColecion = new Cursos2("Java.8","Jadeilton");
        System.out.println("--> Resultado:");
        System.out.println(javaColecion);


        List<Aula> aulas = new ArrayList<>();
        System.out.println("--> Sem nada adicionado na Lista: ");
        System.out.println(aulas);


        System.out.println("--> Adicionando na lista com o método ADD: ");
        javaColecion.getAulas().add(new Aula("Historia da Música: ", 3));
        javaColecion.getAulas().add(new Aula("Historia da Armonia Músical: ",2));
        javaColecion.getAulas().add(new Aula("Música", 3));
        System.out.println(aulas);

        System.out.println("--> Adicionando na lista com o método Adicionar criado na classe Cursos2: ");

        javaColecion.adicionar(new Aula("Historia da Música: ", 2));
        javaColecion.adicionar(new Aula("Historia da Armonial Música: ", 3));
        javaColecion.adicionar(new Aula("Historia da Armonial Musical", 4));
        javaColecion.adicionar(new Aula("Música", 5));

        System.out.println(aulas);





    }
}
