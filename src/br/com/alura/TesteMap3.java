package br.com.alura;

import java.util.*;

public class TesteMap3 {

    public static void main(String[] args) {


        Map<String, Integer> alunos = new HashMap<>();
        alunos.put("Jadeilton",23);
        alunos.put("Doidão",344);
        alunos.put("Safadão",32);
        alunos.put("Gostosinho",23);
        alunos.put("Safadão",32);

        System.out.println("--> Para mostrar só Strings.....");
        Collection<String> algo = alunos.keySet();
        for(String nomes : algo){
            System.out.println(nomes);
        }
        System.out.println("--> Para Mostrar só Integers..");


        Collection<Integer> algo2 = alunos.values();
        for(Integer numero : algo2){
            System.out.println(numero);
        }

        System.out.println("--> Para Mostrar os dois de Uma vez só: ");
        Collection<Map.Entry<String, Integer>> associados = alunos.entrySet();
        for(Map.Entry<String, Integer> associado : associados){
            System.out.println(associado.getKey() + " <--> " + associado.getValue());
        }


    }
}
