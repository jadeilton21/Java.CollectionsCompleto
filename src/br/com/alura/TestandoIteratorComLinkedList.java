package br.com.alura;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestandoIteratorComLinkedList {


    public static void main(String[] args) {

        System.out.println("-> Lista de Alunos: ");
        List<String> alunos = new LinkedList<>();
        alunos.add("--> Jadeilton Felix");
        alunos.add("--> Romario Gonçalves");
        alunos.add("--> Jade Lindo");
        alunos.add("--> Sthefany Barbosa");
        alunos.add("--> Carlos Junior");
        alunos.add("--> Matheus Marcos");
        System.out.println("=========================");
        System.out.println("---> Usando o ForEach:(Forma do Java 8 de se mostrar uma Lista:");
        alunos.forEach(aluno ->{
            System.out.println(aluno);
        });
        System.out.println("==========================");
        System.out.println("--> Usando o Iterator com While:(Forma Antiga do Java de se Mostra uma Lista) ");

        Iterator<String> it = alunos.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("-> Lista de Cores: ");

        List<String> cores = new LinkedList<>();
        cores.add("Azul");
        cores.add("Preto");
        cores.add("Branco");
        cores.add("Amarelo");
        cores.add("Verdão");


        System.out.println("> Usando o ForEach: ");

        cores.forEach(cor ->{
            System.out.println(cor);
        });

        System.out.println("> Usando o Iterator e While: ");

        Iterator<String> it2 = cores.iterator();

        while(it2.hasNext()){
            System.out.println(it2.next());
        }

        System.out.println("---> Maconhas: ");
        List<String> cannabis = new LinkedList<>();
        cannabis.add("--> Sativa");
        cannabis.add("--> Indica");
        cannabis.add("--> Rudelares");
        cannabis.add("--> Skunk");
        cannabis.add("--> Sativa L");


        System.out.println("--> Usando o ForEach: ");

        cannabis.forEach(cannabis2 -> {
            System.out.println(cannabis2);
        });

        System.out.println("--> Usando o Iterator do While: ");

        Iterator<String> it3 = cannabis.iterator();

        while (it3.hasNext()){
            System.out.println(it3.next());
        }


    }
}
