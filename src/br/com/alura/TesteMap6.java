package br.com.alura;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TesteMap6 {

    public static void main(String[] args) {


        Map<String, Integer> maconhas = new HashMap<>();
        maconhas.put("--> Sativa", 34);
        maconhas.put("--> Indica",54);
        maconhas.put("--> Rudelares",34);
        maconhas.put("--> Skunk",12);


        System.out.println("--> Para Mostrar só String: ");
        Collection<String>  resultado1 = maconhas.keySet();
        for(String cannabis : resultado1){
            System.out.println(cannabis);
        }

        System.out.println("--> Para Mostrar só Integer: ");
        Collection<Integer> resultado2 = maconhas.values();
        for(Integer cannabis : resultado2 ){
            System.out.println(cannabis);
        }

        System.out.println("--> Para Mostrar os Dois Resultados: ");
        Collection<Map.Entry<String, Integer>> resultado3 = maconhas.entrySet();
        for(Map.Entry<String, Integer> resultadoFinal : resultado3){
            System.out.println(resultadoFinal.getKey() + " <--> " + resultadoFinal.getValue() + "--> Gramas..");
        }



    }
}
