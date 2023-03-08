package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TesteAlunos3 {


    public static void main(String[] args) {


        Collection<String> alunos = new HashSet<>();
        alunos.add("Gostoso");
        alunos.add("Faya...");
        alunos.add("Eu voce e Dois filhos..");
        alunos.add("Doidão em havard");
        alunos.add("Chapado em marte");


        System.out.println(alunos);


        for (String aluno : alunos) {
            System.out.println(aluno);
        }


        List<String> alunosEmLista = new ArrayList<>(alunos);
        alunosEmLista.add("Jadeilton");
        alunosEmLista.add("Faiaaa");
        alunosEmLista.add("Jadeilton Pesado.");

        System.out.println(alunosEmLista);


        boolean alunosEmLista2 = alunos.contains("Gostoso");
        System.out.println(alunos);








    }
}
