package br.com.alura;

import java.util.*;

public class Cursos5 {
    private String titulo;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();

    private Set<String> aluno5 = new HashSet<String>();




    public Cursos5(String titulo, String instrutor) {
        this.titulo = titulo;
        this.instrutor = instrutor;
    }


    public String getTitulo() {
        return titulo;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public void adicionar(Aula aula){
        this.getAulas().add(aula);
    }


    public void matricula(String aluno5){
        this.aluno5.add(aluno5);
    }

    public Set<String> getAluno5(){
        return Collections.unmodifiableSet(aluno5);
    }
}
