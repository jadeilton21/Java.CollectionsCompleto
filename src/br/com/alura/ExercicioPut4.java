package br.com.alura;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExercicioPut4 {


    public static void main(String[] args) {


        Map<Integer,String> cannabis = new LinkedHashMap<>();

        cannabis.put(1,"--> Sativa");
        cannabis.put(2,"--> Indica");
        cannabis.put(3,"--> Rudelares");
        cannabis.put(4,"--> Skunk");


        cannabis.keySet().forEach(maconha ->{
            System.out.println(cannabis.get(maconha));
        });
        cannabis.keySet().forEach(maconha ->{
            System.out.println(maconha);
        });












    }
}
