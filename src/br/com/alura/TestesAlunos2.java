package br.com.alura;

import java.util.*;

public class TestesAlunos2 {


    public static void main(String[] args) {


        Collection<String> alunos = new HashSet<>();

        alunos.add("Jadeilton");
        alunos.add("Gostoso");
        alunos.add("Faia");
        alunos.add("Lindão");
        alunos.add("Maconheiro");
        alunos.add("Tesão");


        System.out.println(alunos);

        System.out.println("=============================");
        for (String aluno: alunos) {
            System.out.println(aluno);
        }


        System.out.println("=============================");


        List<String> alunosEmLista = new ArrayList<String>(alunos);


        alunosEmLista.add("eu");
        alunosEmLista.add("voce");

        System.out.println(alunosEmLista);
        System.out.println("==========================");
        alunosEmLista.remove("eu");
        System.out.println(alunosEmLista);





    }
}
