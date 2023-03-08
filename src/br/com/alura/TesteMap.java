package br.com.alura;

import java.util.*;

public class TesteMap {


    public static void main(String[] args) {



        Map<String,Integer> nomes = new HashMap<>();
        nomes.put("Jadeilton",22);
        nomes.put("Eduardo",32);
        nomes.put("Gabriel",19);
        nomes.put("Marcela",23  );
        nomes.put("Silvia",23);
        nomes.put("Fauryan",33);


        // Para mostrar mensagem com String(Nomes) na tela;

        Set<String> chaves = nomes.keySet();
        for(String nome : chaves){
            System.out.println(nome);
        }


        // Para Mostrar valores(Idades, numeros) na tela;


        Collection<Integer> valores = nomes.values();
        for(Integer idade : valores){
            System.out.println(idade);
        }

        // para juntar os dois resultados::

        Set<Map.Entry<String, Integer>> associacoes = nomes.entrySet();

        for(Map.Entry<String, Integer> associacao : associacoes){
            System.out.println(associacao.getKey()  + " -- " + associacao.getValue());
        }




    }
}
