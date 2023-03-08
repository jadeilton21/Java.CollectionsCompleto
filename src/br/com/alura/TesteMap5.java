package br.com.alura;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TesteMap5 {


    public static void main(String[] args) {

        Map<String, Integer> pessoas = new HashMap<>();
        pessoas.put("Jade",234);
        pessoas.put("Eduardo",43);
        pessoas.put("Marcelo",34);
        pessoas.put("Eduarda",23);
        pessoas.put("Thaina",32);
        pessoas.put("Gabriel",34);


        System.out.println("--> Mostrar nomes(Strings): ");
        Collection<String> nomes = pessoas.keySet();

        for(String nome : nomes){
            System.out.println(nome);
        }

        System.out.println("--> Para Mostrar só Numeros(Integer): ");

        Collection<Integer> numeros = pessoas.values();
        for(Integer numero : numeros){
            System.out.println(numero);

        }

        System.out.println("--> Para Mostrar todas as String e Números: ");

        Collection<Map.Entry<String, Integer>> associados = pessoas.entrySet();

        for(Map.Entry<String, Integer> associacao : associados){
            System.out.println(associacao.getKey() + " --> " + associacao.getValue());
        }















    }
}
