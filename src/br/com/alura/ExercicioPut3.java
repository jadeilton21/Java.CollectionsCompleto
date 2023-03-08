package br.com.alura;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class ExercicioPut3 {


    public static void main(String[] args) {


        Map<String,String> cores = new LinkedHashMap<>();
        cores.put("Azul","Vermelho");
        cores.put("Preto","Rosa");
        cores.put("Amarelo","Verde");


        Iterator<String> cor = cores.keySet().iterator();

        cores.keySet().forEach(coral ->{
            System.out.println(coral);
        });

//        while(cor.hasNext()){
//            System.out.println(cores.get(cor));
//        }
    }
}
