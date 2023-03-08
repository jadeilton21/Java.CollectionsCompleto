package br.com.alura;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class ExercicioPut {


    public static void main(String[] args) {


        Map<Integer,String> pessoas = new LinkedHashMap<>();

        pessoas.put(22,"Jadeilton");
        pessoas.put(19,"Gabriel");
        pessoas.put(34,"Gilvanio");


        pessoas.keySet().forEach(pessoa -> {
            System.out.println(pessoas.get(pessoa));
        });











    }
}
