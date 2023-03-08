package br.com.alura;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestandoIteratorComLinkedList2 {


    public static void main(String[] args) {

        List<Integer> numeros = new LinkedList<>();
        numeros.add(0);
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);


        System.out.println("--> Usando ForEach:(Forma Nova do Java 8)");
        numeros.forEach(numero ->{
            System.out.println(numero);
        });


        System.out.println("--> Usando o Iterator: (Forma Antiga do Java)");

        Iterator<Integer> it = numeros.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }


        List<String> cores = new LinkedList<>();
        cores.add("Verdão");
        cores.add("Vermelho");
        cores.add("Amarelo");
        cores.add("Cinza");
        cores.add("Preto");


        System.out.println("--> Usando o forEach: ");
        cores.forEach(cor->{
            System.out.println(cor);
        });
        System.out.println("--> Usando o Iterator: ( Forma Antiga do Java)");

        Iterator<String> it2 = cores.iterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }

        System.out.println("-----> Maconhas <-----");
        List<String> maconhas = new LinkedList<>();
        maconhas.add("-- Sativa L");
        maconhas.add("-- Indica");
        maconhas.add("-- Rudelares");
        maconhas.add("-- Skunk");
        maconhas.add("-- Raxixe");


        System.out.println("--> Usando o forEach para mostrar Lista:( Forma do Java 8 nova) ");

        maconhas.forEach(maconha-> {
                System.out.println(maconha);
        });


        System.out.println("--> Usando o Iterator: (Forma Antiga do Java: ");

        Iterator<String> it3 = maconhas.iterator();
        while (it3.hasNext()){
            System.out.println(it3.next());
        }








    }
}
