package br.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TesteAlunos {


    public static void main(String[] args) {


        Set<String> alunos = new HashSet<>();
        alunos.add("Jade");
        alunos.add("Faya");
        alunos.add("Ganjah");
        alunos.add("Putaria.");


        System.out.println(alunos);


        for (String aluno: alunos) {
            System.out.println(aluno);
        }


        boolean jadeEstaMatriculado = alunos.contains("Jadeilton");

        System.out.println(alunos);


        List<String> alunosEmLista = new ArrayList<>(alunos);

        alunosEmLista.add("Jadeilton");
        System.out.println(alunosEmLista);











    }
}
