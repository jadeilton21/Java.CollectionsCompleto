package br.com.alura;

import java.util.Collections;
import java.util.Set;

public class TesteEmptySet {


    public static void main(String[] args) {



        Set<String> nome = Collections.emptySet();

        nome.add("Jadeilton");
        nome.add("Nós hehehe");
        nome.add("Jade Lindo");

        System.out.println(nome);


    }
}
