package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas8 {

    public static void main(String[] args) {

        String horario1 = "Matutino";
        String horario2 = "Vespertino";
        String horario3 = "Noturno";


        ArrayList<String> horarios = new ArrayList<>();

        horarios.add(horario1);
        horarios.add(horario2);
        horarios.add(horario3);


        System.out.println("--> Turnos Da Semana: ");
        System.out.println(horarios);


        System.out.println("--> Turnos em Ordem Alfabética: ");
        Collections.sort(horarios);
        System.out.println(horarios);

        System.out.println("--> Sequencia de Turnos usando o For Simples: ");

        for(int i = 0; i <horarios.size(); i++){
            System.out.println("-> Aula: " + horarios.get(i));

        }
        System.out.println("--> Sequencia de Turnos usando o ForEach: ");

        horarios.forEach(horario -> {
            System.out.println("-> Aula: " + horario);
        });


        System.out.println(" Removendo Itens da Lista: ");

        System.out.println(horarios);

        horarios.remove(2);
        System.out.println(horarios);

    }


}
