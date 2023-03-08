package br.com.alura;

import com.sun.xml.internal.ws.api.ha.HaInfo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TesteMap4 {


    public static void main(String[] args) {

        Map<String, Integer> cores = new HashMap<>();
        cores.put("Azul",10);
        cores.put("Verde",34);
        cores.put("Preto",35);
        cores.put("Branco",36);
        cores.put("Amarelo",43);

        System.out.println("--> Para mostrar(String): ");
        Set<String> resultado1 = cores.keySet();
        for(String nomes : resultado1){
            System.out.println(nomes);
        }

        System.out.println("--> Para Mostrar(Integer): ");
        Collection<Integer> resultado2 = cores.values();
        for(Integer numeros : resultado2){
            System.out.println(numeros);
        }


        System.out.println("--> Para Mostrar os dois Resultados: ");
        Collection<Map.Entry<String, Integer>> juntos = cores.entrySet();
        for (Map.Entry<String, Integer> resultadoFinal : juntos){
            System.out.println(resultadoFinal.getKey()  + " --> " + resultadoFinal.getValue());
        }





    }
}
