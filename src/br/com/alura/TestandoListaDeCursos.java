package br.com.alura;

import java.util.ArrayList;
import java.util.List;

public class TestandoListaDeCursos {


    public static void main(String[] args) {


        Cursos javaColecio = new Cursos("Analise e desenvolvimento de Sistemas.","Jadeilton" );

        List<Aula> aulas  = javaColecio.getAulas();
        System.out.println("--> Sem adicionar nada na lista: ");
        System.out.println(aulas);

        System.out.println("--> Adicionando uma lista com o método Add.");
        javaColecio.getAulas().add(new Aula("trabalhando com Java",3));
        javaColecio.getAulas().add(new Aula("Estudando Python", 6));
        javaColecio.getAulas().add(new Aula("Estrutura de Dados",9));
        System.out.println(aulas);


        System.out.println("--> Usando o método Adicionar criado na classe Cursos: ");

        javaColecio.adicionar(new Aula("Trabalhando com Java: ",3));
        javaColecio.adicionar(new Aula("Estudando Python",6));
        javaColecio.adicionar(new Aula("Estrutura de Dados",9));

        System.out.println(aulas);

    }
}
