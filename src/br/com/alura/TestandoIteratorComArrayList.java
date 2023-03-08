package br.com.alura;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestandoIteratorComArrayList {


    public static void main(String[] args) {

        System.out.println("--> Lista de Alunos: ");
        List<String> alunos = new ArrayList<>();
        alunos.add("-- Max beltrão");
        alunos.add("-- Rasta Man");
        alunos.add("-- Beetowen");
        alunos.add("-- Mister Satã");

        System.out.println("--> Usando o ForEach:(Forma Nova do Java: ");
        alunos.forEach(aluno ->{
            System.out.println(aluno);
        });

        System.out.println("--> Usando o Iterator:(Forma Antiga do Java) ");

        Iterator<String> it = alunos.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }


        System.out.println("---> Lista de Cores: ");
        List<String> cores = new ArrayList<>();
        cores.add("-- Verde");
        cores.add("-- Rosa");
        cores.add("-- Vermelho");
        cores.add("-- Azul");

        System.out.println("--> Usando o ForEach:(Forma Nova do Java 8) ");


        cores.forEach(cor ->{
            System.out.println(cor);
        });


        System.out.println("--> Usando o Iterator While: (Forma Antiga do Java): ");


        Iterator<String> it2 = cores.iterator();

        while (it2.hasNext()){
            System.out.println(it2.next());
        }


        System.out.println("-> Lista de Números: ");
        List<Integer>  numeros = new ArrayList<>();

        numeros.add(5);
        numeros.add(4);
        numeros.add(3);
        numeros.add(2);
        numeros.add(1);


        System.out.println("--> Mostrando Lista de Números com o ForEach: (Forma Nova)");

        numeros.forEach(numero ->{
            System.out.println(numero);
        });

        System.out.println("--> Mostrando Lista de Números com o Iterator:(Forma Antiga)");

        Iterator<Integer> it3 = numeros.iterator();

        while (it3.hasNext()){
            System.out.println(it3.next());
        }
        System.out.println("--> Lista de Cannabis: ");
        List<String> cannabis = new ArrayList<>();
        cannabis.add("-- Sativa");
        cannabis.add("-- Rudelares");
        cannabis.add("-- Indica");
        cannabis.add("-- Skunk");
        cannabis.add("-- Raxixe");

        System.out.println("--> Usando o ForEach: (Forma Nova)");

        cannabis.forEach(cannabi ->{
            System.out.println(cannabi);
        });


        System.out.println("--> Usando o Iterator: (Forma Antiga)");

        Iterator<String> it4 = cannabis.iterator();

        while (it4.hasNext()){
            System.out.println(it4.next());
        }

    }
}
