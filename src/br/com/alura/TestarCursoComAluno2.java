package br.com.alura;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class TestarCursoComAluno2 {


    public static void main(String[] args) {


        Cursos2 javaCollecions = new Cursos2("Java Básico","Jadeilton");

        javaCollecions.adicionar(new Aula("Filosofia",1232));
        javaCollecions.adicionar(new Aula("Matemática",132));



        Aluno2 aluno1 = new Aluno2("Jadeilton",3213);
        Aluno2 aluno2 = new Aluno2("Maathues",23433);
        Aluno2 aluno3 = new Aluno2("Jade",34242);



        javaCollecions.matricula(aluno1);
        javaCollecions.matricula(aluno2);
        javaCollecions.matricula(aluno3);


        System.out.println("--> Em Ordem: ");
        javaCollecions.getAlunos2().forEach(aluno ->{
            System.out.println(aluno);
        });


        System.out.println("--> O aluno " + aluno1.getNome() + "Está Matriculado? ");
        System.out.println(javaCollecions.estaMatriculado(aluno1));



        Aluno2 aluno5 = new Aluno2("Jadeilton33",234232);
        System.out.println(" Esse Jadeilton33 ta matriculado? ");
        System.out.println(javaCollecions.estaMatriculado(aluno5));

        System.out.println("---> Os Alunos são iguais? ");
        Aluno2 alunoEquivalente = new Aluno2("Jadeilton ",234232);
        System.out.println(aluno5 == alunoEquivalente);

        Aluno2 turini = new Aluno2("Jadeilton ",234232);

        System.out.println("-->  O aluno5 é igual ao Turini? ");
        System.out.println(aluno5.equals(turini));

        System.out.println("-- > São iguais? ");
        System.out.println(aluno5.hashCode() == turini.hashCode());


        System.out.println("--> Forma de Rodar a lista de Nomes dos alunos no Java 8: ");

        javaCollecions.getAlunos2().forEach(aluno ->{
            System.out.println(aluno);
        });


        System.out.println("--> Formas de Rodar Antes do Java 8: ");
        for(Aluno2 alunoFor : javaCollecions.getAlunos2()){
            System.out.println(alunoFor);
        }

        System.out.println("--> Usando o Iterator: ");
        Set<Aluno2> alunos2 = javaCollecions.getAlunos2();
        Iterator<Aluno2> iterator = alunos2.iterator();


        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println("--> Usando a Classe Vector: ");
        Vector<Aluno2> vetor = new Vector<>();
        Iterator<Aluno2> vetor2 = vetor.iterator();

        while(iterator.hasNext()){
            System.out.println(vetor2.next());
        }
    }
}
