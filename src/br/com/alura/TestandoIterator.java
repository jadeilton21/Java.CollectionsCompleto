package br.com.alura;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestandoIterator {


    public static void main(String[] args) {


        System.out.println("--> Usando o ForEach: ");


        List<String> letras = new LinkedList<>();
        letras.add("A");
        letras.add("B");
        letras.add("C");
        letras.add("D");


        letras.forEach(letras2 -> {
            System.out.println(letras2);
        });


        System.out.println("--> Com o While usando o HashNext: ");

        List<String> alunos = new LinkedList<>();
        alunos.add("Jadeilton ");
        alunos.add("Jade");
        alunos.add("Fumando");
        alunos.add("Fayaaaa");
        alunos.add("California");


        Iterator<String> alunos2 = alunos.iterator();

        while (alunos2.hasNext()) {
            System.out.println(alunos2.next());
        }

        System.out.println(" =================================   ");
        List<String> alunos3 = new LinkedList<>();

        alunos3.add("Jade");
        alunos3.add("Rakel");
        alunos3.add("Marcela");
        alunos3.add("Ricardo");
        alunos3.add("Renata");
        alunos3.add("Jadeilton");
        alunos3.add("Pedro");
        alunos3.add("Breno..");


        Iterator<String> interacao = alunos3.iterator();

        while (interacao.hasNext()){
            System.out.println(interacao.next());
        }


        System.out.println("--> Com ArrayList:");
        List<String> cores = new ArrayList<>();
        cores.add("--> Verde");
        cores.add("--> Azul");
        cores.add("--> Vermelho");
        cores.add("--> Cinza");
        cores.add("--> Preto");
        Iterator<String> it = cores.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }


        System.out.println("========================");
        System.out.println("--> Exemplos de Cannabis usando ArrayList:  ");

        List<String> ganjahs = new ArrayList<>();
        ganjahs.add("--> Sativa");
        ganjahs.add("--> Indica");
        ganjahs.add("--> Rudelares");
        ganjahs.add("--> Skunk");
        ganjahs.add("--> Rash");


        Iterator<String> it2 = ganjahs.iterator();



        while (it2.hasNext()){
            System.out.println(it2.next());
        }

        System.out.println("--> Exemplos de Cannabis usando LinkedList: ");
        List<String> cannabis = new LinkedList<>();
        cannabis.add("--> Sativa..");
        cannabis.add("--> Indica");
        cannabis.add("--> Rudelares");
        cannabis.add("--> Sativa L");
        cannabis.add("--> Skunk");
        cannabis.add("--> Raxixe");

        Iterator<String> it3 = cannabis.iterator();


        while (it3.hasNext()){
            System.out.println(it3.next());
        }

    }

}
