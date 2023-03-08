package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas3 {


    public static void main(String[] args) {

        String aluno1 = "Jadeilton";
        String aluno2 = " Matheus";
        String aluno3 = " Berg";


        ArrayList<String>  alunos = new ArrayList<>();

        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);


        System.out.println(alunos);


        System.out.println("Elementos em Ordem dentro da Lista: ");

        System.out.println("--> Aluno: " + alunos.get(0));
        System.out.println("--> Aluno: " + alunos.get(1));
        System.out.println("--> Aluno: " + alunos.get(2));


        System.out.println("Alunos em Ordem Alfabética: ");

        Collections.sort(alunos);

        System.out.println(alunos);


        System.out.println("Ordenando a Lista com o For: ");

        for(int i = 0; i < alunos.size(); i++){
            System.out.println("Aluno: " + alunos.get(i));
        }

        System.out.println("Ordenando a Lista com o ForEach: ");

        alunos.forEach(aluno ->{
            System.out.println("Procedimento: ");
            System.out.println("Aluno: --> " + aluno);
        });


        System.out.println("Removendo Itens da Lista: ");
        System.out.println(alunos);
        alunos.remove(0);
        System.out.println(alunos);
        alunos.remove(1);
        System.out.println(alunos);




    }
}
