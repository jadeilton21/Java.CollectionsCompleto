package br.com.alura;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ExercicioPut2 {

    public static void main(String[] args) {


        Map<Integer,String> alunos = new HashMap<>();
        alunos.put(16,"Jadeilton");
        alunos.put(24,"Marcela" );
        alunos.put(25,"Eduardo");
        alunos.put(32,"Breno");
        alunos.put(45,"savio");






        alunos.keySet().forEach(aluno ->{
            System.out.println(alunos.get(aluno));
        });






    }
}
