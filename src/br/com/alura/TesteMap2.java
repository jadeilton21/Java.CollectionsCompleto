package br.com.alura;

import java.util.*;

public class TesteMap2 {


    public static void main(String[] args) {


        Map<String,Integer> nomes = new HashMap<>();
        nomes.put("Jadeilton",34);
        nomes.put("Sfaadão", 23);
        nomes.put("Ganjador",343);
        nomes.put("Safadão", 343);
        nomes.put("Gostosão",342);
        nomes.put("Maconheiro",342);
        nomes.put("Safado",32);




        Collection<String> associacoes = nomes.keySet();


        System.out.println("--> Para Mostrar só o nome(Strings,nomes) : ");
        for(String nome : associacoes){
            System.out.println(nome);
        }

        System.out.println("--> Para Mostrar Numeros(Integers, Numeros) : ");
        Collection<Integer> numeros = nomes.values();
        for(Integer numero : numeros){
            System.out.println(numero);
        }


        System.out.println("--> Para Mostrar os dois Cadastrados(String, Integer");
        Collection<Map.Entry<String, Integer>> associados = nomes.entrySet();
        for(Map.Entry<String,Integer> associacao : associados){
            System.out.println(associacao.getKey() + " <--> " + associacao.getValue());
        }





    }
}
