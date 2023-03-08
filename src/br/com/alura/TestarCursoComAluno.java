package br.com.alura;

import java.sql.SQLOutput;
import java.util.Collections;
import java.util.Set;

public class TestarCursoComAluno {


    public static void main(String[] args) {





        Cursos javaColecoes = new Cursos("Dominando as Coleções do Java", "Paulo");



        javaColecoes.adicionar(new Aula("Java Básico",10));
        javaColecoes.adicionar(new Aula("Java Médio", 11));
        javaColecoes.adicionar(new Aula("Java Intermediario",12));
        javaColecoes.adicionar(new Aula("Java Avançado",12));

        Aluno aluno1 = new Aluno("Jadeilton",12344);
        Aluno aluno2 = new Aluno("Marco",2132432);
        Aluno aluno3 = new Aluno("Doidão",1324324);

        Set<Aluno> alunos = javaColecoes.getAlunos();

        javaColecoes.matricula(aluno1);
        javaColecoes.matricula(aluno2);
        javaColecoes.matricula(aluno3);


        System.out.println("--> Alunos Matriculados: ");
        javaColecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });

        Set<Aluno> alunosSicronizados = Collections.synchronizedSet(alunos);


        System.out.println("O Aluno " + aluno1.getNome() + " está matriculado? ");
        System.out.println(javaColecoes.estaMatriculado(aluno1));



        Aluno turini = new Aluno("Turini",5438534);
        System.out.println("--> E o Turini, está´matriculado? ");
        System.out.println(javaColecoes.estaMatriculado(turini));


        Aluno aluno = new Aluno("Dougles Quintanilha",11824763);
        Aluno alunoDoFormula = new Aluno("Dougles Quintanilha",11824763);


        System.out.println("--> O Aluno é igual ao que veio do formulario? ");
        System.out.println(aluno == alunoDoFormula);


        System.out.println("O Aluno1 é equals ao Turini? ");
        System.out.println(aluno1.equals(turini));


        Aluno turini1 = new Aluno("Rodrigo Turini",34672);
        System.out.println("--> E esse Turini está matriculado? ");
        System.out.println(javaColecoes.estaMatriculado(turini1));




    }
}
